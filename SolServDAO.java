package dao;
/*
Classes de Conexão DAO
As conexões são com um banco de dados mysql.
Todas conexões com o BD são inicializadas nos construtores da classe ( this.connection = new ConnectionFactory().getConnection())
*/
import factory.ConnectionFactory;
import modelo.SolServ;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList; 
import java.util.Date;

/*
Esta classe possui o procedimento “adiciona” para inserir os dados da solicitação de serviço no banco de dados,
a função “getSolicitacao” busca a solicitação de serviço/OS pelo seu identificador passado por parâmetro para a consulta SQL,
o resultado é retornado para um objeto do tipo SolServ com a solicitação de serviço
alem do nome do funcionário alocado (quando houver) e nome do cliente.
A função obterListaDeHabilidades busca todas as habilidades(tipo de profissional) distintamente dos funcionários cadastrados,
o resultado é retornado por um ArrayList.
O procedimento alteraOS altera os dados de uma Ordem de Serviço cujo id foi passado por parâmetro junto com os dados a serem alterados.
Todas as funções e procedimentos possuem tratamento de erro genérico try- catch- throw de banco de dados.
Para preencher a lista de habilidades o “ResultSet rs” é feito um while que traz os resultados de cada linha para o ResultSet.
*/

public class SolServDAO {
    private Connection connection;
    Long id;
    Long idcliente ;
    String habilidade;
    String descricao;
    String status;
    String datasolicitacao;
    String aprovado;
    Long valor ;
    Long vencimento;
    String dataencerramento;
   

    public SolServDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    
    /*----------------------------------------------------------------------*/
    public void adiciona(SolServ solicitacao){

        String sql = "INSERT INTO solserv(idcliente,habilidade,descricao, status, datasolicitacao, aprovado) VALUES(?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setLong(1, solicitacao.getIdcliente());
           stmt.setString(2, solicitacao.getHabilidade());
           stmt.setString(3, solicitacao.getDescricao());
           stmt.setString(4, solicitacao.getStatus());
           stmt.setString(5, solicitacao.getDataSolicitacao()); 
           stmt.setString(6, solicitacao.getAprovado());  
           
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/
    
    
     /*----------------------------------------------------------------------*/
    public ArrayList obterListaDeHabilidades(){ 
        ArrayList habilidade = new ArrayList();  
        String sql = "SELECT distinct habilidade FROM usuario";
        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  

        while (rs.next()){
        habilidade.add(rs.getString("habilidade"));
        }
        rs.close();  
        stmt.close();  
        return habilidade; 
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    
    
    /*----------------------------------------------------------------------*/  
    public SolServ getSolicitacao(Long id){  
        //String sql = "select * from solserv where id = '" + id + "'";
        //String sql = "select A.*, B.nome as NomeCliente from solserv A, cliente B where B.id = A.idcliente and A.id = '" + id + "'";
        String sql = "select A.*, B.nome as NomeCliente, CASE WHEN USU.nome IS NULL THEN '' ELSE USU.NOME END NomeFuncionario from cliente B, solserv A LEFT OUTER JOIN (SELECT id, nome FROM usuario)USU ON USU.id = A.idfuncionario where B.id = A.idcliente and A.id = '" + id + "'";

        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  

        SolServ solicitacao = new SolServ();
        rs.next();  //aponta para o primeiro registro
        solicitacao.setId(rs.getLong("id"));
        solicitacao.setIdcliente(rs.getLong("idcliente"));
        solicitacao.setHabilidade(rs.getString("habilidade"));
        solicitacao.setDescricao(rs.getString("descricao"));
        solicitacao.setStatus(rs.getString("status"));
        solicitacao.setDataSolicitacao(rs.getString("datasolicitacao"));
        solicitacao.setNomeCliente(rs.getString("NomeCliente"));
        solicitacao.setValorHoras(rs.getDouble("valorhora"));
        solicitacao.setNumHoras(rs.getDouble("numhoras"));
        solicitacao.setNomeFuncionario(rs.getString("NomeFuncionario"));
        solicitacao.setIdFuncionario(rs.getLong("idfuncionario"));
        solicitacao.setAprovado(rs.getString("aprovado"));
        solicitacao.setValorTotal(rs.getDouble("valor"));
        solicitacao.setVencimento(rs.getLong("vencimento"));
        solicitacao.setDataEncerramento(rs.getString("dataencerramento"));
        
        rs.close();  
        stmt.close();  
        return solicitacao;  
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    
      /*----------------------------------------------------------------------*/ 
    public void alteraOS(SolServ solicitacao){
  String sql = "UPDATE solserv SET status=?, idfuncionario=?,numhoras=?,valorhora=?, aprovado=?, valor=?, vencimento=?, dataencerramento=? WHERE id=?";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, solicitacao.getStatus());
           stmt.setLong(2, solicitacao.getIdFuncionario());
           stmt.setDouble(3, solicitacao.getNumHoras());
           stmt.setDouble(4, solicitacao.getValorHoras());
           stmt.setString(5, solicitacao.getAprovado());
           System.out.println(solicitacao.getValorTotal());
           stmt.setDouble(6, solicitacao.getValorTotal());           
           stmt.setLong(7, solicitacao.getVencimento());
           stmt.setString(8, solicitacao.getDataEncerramento());
           stmt.setLong(9, solicitacao.getId());
           
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
    
    
}
