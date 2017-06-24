package dao;
/*
Classes de Conexão DAO
As conexões são com um banco de dados mysql.
Todas conexões com o BD são inicializadas nos construtores da classe ( this.connection = new ConnectionFactory().getConnection())
*/
import factory.ConnectionFactory;
import modelo.Fatura;
import java.sql.*;
import java.sql.PreparedStatement;

/*
Esta classe possui o procedimento “adiciona” para inserir os dados da fatura no banco de dados,
a função “procura” busca a fatura pelo identificador de serviço/OS passado por parâmetro para a consulta SQL,
o resultado é retornado para um objeto do tipo Fatura caso o retorne algum resultado,
senão retorna um long com valor 0 para posterior tratamento.
Todas as funções e procedimentos possuem tratamento de erro genérico try- catch- throw de banco de dados. 

soma o valor das peças/materiais agrupando o mesmo pelo identificador da solicitação de serviço/OS,
caso o retorno desta soma seja nulo(nenhum registro) o resultado retornado é 0.0,
senão retorna um double com o valor da soma.
Todas as funções e procedimentos possuem tratamento de erro genérico try- catch- throw de banco de dados. 

*/

public class FaturaDAO {
    private Connection connection;
    Long id;
    Long idOS;
    Double valor;
    String formapagamento;
    String instituicao;
   

    public FaturaDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    /*----------------------------------------------------------------------*/ 
    public void adiciona(Fatura fatura){

        String sql = "INSERT INTO fatura(idos,valor,formapagamento,instituicao) VALUES(?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setLong(1, fatura.getIdOS());
           stmt.setDouble(2, fatura.getValor());
           stmt.setString(3, fatura.getFormaPagamento());
           stmt.setString(4, fatura.getInstituicao());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
    
    
     /*----------------------------------------------------------------------*/
    public Fatura procura(Long IdOS){ 
        Fatura fatura = new Fatura();  
        String sql = "SELECT * FROM fatura where idos = '" + IdOS + "'";
        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  
        if (!rs.next()) {
                //System.out.println("Não existem registos na base de dados para serem visualizados");
                fatura.setId(0l);
                        rs.close();  
                        stmt.close();  
                return fatura;
        }
        else{
        //rs.next();
        fatura.setId(rs.getLong("id"));
        fatura.setIdOS(rs.getLong("idos"));
        fatura.setValor(rs.getDouble("valor"));
        fatura.setFormaPagamento(rs.getString("formapagamento"));
        fatura.setInstituicao(rs.getString("instituicao"));
        //System.out.println(rs.getLong("id")+"passou aqui");
        rs.close();  
        stmt.close();  
        return fatura;
        }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
  
}

