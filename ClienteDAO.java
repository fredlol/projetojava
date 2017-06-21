package dao;

import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String datanascimento;
    String endereco;

    public ClienteDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    /*----------------------------------------------------------------------*/ 
    public void adiciona(Cliente cliente){

        String sql = "INSERT INTO cliente(nome,cpf,email,telefone,datanascimento,endereco) VALUES(?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, cliente.getNome());
           stmt.setString(2, cliente.getCpf());
           stmt.setString(3, cliente.getEmail());
           stmt.setString(4, cliente.getTelefone());
           stmt.setString(5, cliente.getDataNascimento());
           stmt.setString(6, cliente.getEndereco());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
    
    /*----------------------------------------------------------------------*/  
    public Cliente getTodosClientes(String Nome){  
        String sql = "select * from cliente where nome = '" + Nome + "'";
        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  

        Cliente clientes = new Cliente();
        rs.next();  //aponta para o primeiro registro
        clientes.setId(rs.getLong("id"));
        clientes.setNome(rs.getString("nome"));
        clientes.setCpf(rs.getString("cpf"));
        clientes.setEmail(rs.getString("email"));
        clientes.setTelefone(rs.getString("telefone"));
        clientes.setEndereco(rs.getString("endereco"));  
        clientes.setDataNascimento(rs.getString("datanascimento"));  
        rs.close();  
        stmt.close();  
        return clientes;  
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    
    
    /*----------------------------------------------------------------------*/ 
    public void excluiCliente(String Nome){

        String sql = "DELETE FROM cliente WHERE nome = '" + Nome + "'";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
    
    
        /*----------------------------------------------------------------------*/ 
    public void alteraCliente(Cliente cliente){
  String sql = "UPDATE cliente SET nome=?, cpf=?,email=?,telefone=?,datanascimento=?,endereco=? WHERE id=?";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, cliente.getNome());
           stmt.setString(2, cliente.getCpf());
           stmt.setString(3, cliente.getEmail());
           stmt.setString(4, cliente.getTelefone());
           stmt.setString(5, cliente.getDataNascimento());
           stmt.setString(6, cliente.getEndereco());
           stmt.setLong(7, cliente.getId());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
}