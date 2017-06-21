package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList; 

public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String habilidade;

    public UsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    
    /*----------------------------------------------------------------------*/
    public void adiciona(Usuario usuario){

        String sql = "INSERT INTO usuario(nome,cpf,email,telefone, habilidade) VALUES(?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getCpf());
           stmt.setString(3, usuario.getEmail());
           stmt.setString(4, usuario.getTelefone());
           stmt.setString(5, usuario.getHabilidade());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/
    
    
   /*----------------------------------------------------------------------*/  
    public Usuario getFuncionario(String Nome){  
        String sql = "select * from usuario where nome = '" + Nome + "'";
        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  

        Usuario usuarios = new Usuario();
        rs.next();  //aponta para o primeiro registro
        usuarios.setId(rs.getLong("id"));
        usuarios.setNome(rs.getString("nome"));
        usuarios.setCpf(rs.getString("cpf"));
        usuarios.setEmail(rs.getString("email"));
        usuarios.setTelefone(rs.getString("telefone"));
        usuarios.setHabilidade(rs.getString("habilidade"));           
        rs.close();  
        stmt.close();  
        return usuarios;  
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    
       /*----------------------------------------------------------------------*/ 
    public void excluiFuncionario(String Nome){

        String sql = "DELETE FROM usuario WHERE nome = '" + Nome + "'";
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
    public void alteraUsuario(Usuario usuario){
  String sql = "UPDATE usuario SET nome=?, cpf=?,email=?,telefone=?,habilidade=? WHERE id=?";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getCpf());
           stmt.setString(3, usuario.getEmail());
           stmt.setString(4, usuario.getTelefone());
           stmt.setString(5, usuario.getHabilidade());
           stmt.setLong(6, usuario.getId());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    /*----------------------------------------------------------------------*/ 
    
    
    
      /*----------------------------------------------------------------------*/
    public ArrayList obterNomesTodosFuncs(){ 
        ArrayList funcionarios = new ArrayList();  
        String sql = "SELECT nome FROM usuario";
        try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();  

        while (rs.next()){
        funcionarios.add(rs.getString("nome"));
        }
        rs.close();  
        stmt.close();  
        return funcionarios; 
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
     /*----------------------------------------------------------------------*/
    

    
}