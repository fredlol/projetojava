package dao;
/*
Classes de Conexão DAO
As conexões são com um banco de dados mysql.
Todas conexões com o BD são inicializadas nos construtores da classe ( this.connection = new ConnectionFactory().getConnection())
*/
import factory.ConnectionFactory;
import modelo.Pecas;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList; 

/*
Esta classe possui o procedimento “adiciona” para inserir os dados das peças/materiais no banco de dados,
a função “getSomaPecas” soma o valor das peças/materiais agrupando o mesmo pelo identificador da solicitação de serviço/OS,
caso o retorno desta soma seja nulo(nenhum registro) o resultado retornado é 0.0, senão retorna um double com o valor da soma.
Todas as funções e procedimentos possuem tratamento de erro genérico try- catch- throw de banco de dados. 
*/

public class PecasDAO {
    private Connection connection;
    Long id;
    Long idos;
    String descricao;
    Double valor;
    Double quantidade;
   

    public PecasDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    
    /*----------------------------------------------------------------------*/
    public void adiciona(Pecas material){

        String sql = "INSERT INTO pecas(idos,descricao,valor, quantidade) VALUES(?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setLong(1, material.getIdOS());
           stmt.setString(2, material.getDescricao());
           stmt.setDouble(3, material.getValor());
           stmt.setDouble(4, material.getQuantidade());
           
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/
    
    
    /*----------------------------------------------------------------------*/  
    public Double getSomaPecas(Long idOS){  
        Double soma;
         String sql = "SELECT IFNULL(SUM(valor*quantidade), 0) AS soma from pecas where idos = '" + idOS + "' group by idos";
        try {
       PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();        
        if (!rs.next()) {
            //System.out.println("Não existem registos na base de dados para serem visualizados");
            soma=0.0;
            rs.close();  
            stmt.close();  
            return soma;
        }       
        else {
        //rs.next();  //aponta para o primeiro registro
        soma = rs.getDouble("soma");
        rs.close();  
        stmt.close();  
        return soma;      
        }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    
}
