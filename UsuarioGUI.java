
package gui;
/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/


import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
public class UsuarioGUI extends javax.swing.JFrame {
    public UsuarioGUI() {
        initComponents();
    }
/*
Nesta interface os seguintes campos são formatados:
Telefone: (xx)xxxxx-xxxx
Cpf: xxx.xxx.xxx-xx
*/
   
/*
Botão para inserir os dados do funcionário, os mesmos são carregados dos campos para o objeto “Funcionario”,
caso algum campo esteja vazio então é emitida mensagem de alerta e não é permitido inserir com os mesmos vazios: 
*/

     /*-------------------------INSERIR-------------------------------------*/ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
    Usuario usuarios = new Usuario();
    usuarios.setNome(jTextField6.getText());
    usuarios.setCpf(jFormattedTextField1.getText());
    usuarios.setEmail(jTextField3.getText());
    usuarios.setTelefone(jFormattedTextField2.getText());
    usuarios.setHabilidade(jTextField5.getText());

    // fazendo a validação dos dados
    if ((jTextField6.getText().isEmpty()) || (jFormattedTextField1.getText().isEmpty()) 
         || (jTextField3.getText().isEmpty()) || (jFormattedTextField2.getText().isEmpty()|| (jTextField5.getText().isEmpty()) )) {
       JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
    }
    else {

        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        UsuarioDAO dao = new UsuarioDAO();
        dao.adiciona(usuarios);
        JOptionPane.showMessageDialog(null, "Funcionário "+jTextField6.getText()+" inserido com sucesso! ");
    }

    // apaga os dados preenchidos nos campos de texto
    jTextField6.setText("");
    jFormattedTextField1.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jTextField5.setText("");
    jLabel8.setText("");
    }                                        
 /*-------------------------INSERIR-------------------------------------*/ 
    //Botão para sair do sistema:
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    System.exit(0);       
    }                                        

    //Botão para Limpar os campos do formulário e desabilitar os botões de alterar e excluir:
    /*-------------------------LIMPAR-------------------------------------*/ 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    jTextField6.setText("");
    jFormattedTextField1.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jTextField5.setText("");
    jLabel8.setText("");
    jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
 /*-------------------------LIMPAR-------------------------------------*/
    
/*Botão para pesquisar os dados do funcionário, os mesmos são carregados nos campos do objeto “funcionário”
que recebeu os dados retornados do Banco de dados e deste para os campos de exibição na tela,
caso o nome a ser pesquisado estiver vazio então é emitida mensagem de alerta e não é permitido pesquisar com o mesmo vazio,
habilita-se os botões de excluir e alterar que estavam desabilitados:
*/
    
   /*-------------------------PESQUISAR-------------------------------------*/ 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
// instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
    Usuario usuarios = new Usuario();

    // fazendo a validação dos dados
    if ((jTextField6.getText().isEmpty())) {
       JOptionPane.showMessageDialog(null, "O campo nome deve estar preenchido para a pesquisa");
    }
    else {
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        UsuarioDAO dao = new UsuarioDAO();
        usuarios = dao.getFuncionario(jTextField6.getText());
        JOptionPane.showMessageDialog(null, "Funcionário "+jTextField6.getText()+" pesquisado! ");
    }
    
    jLabel8.setText(String.valueOf(usuarios.getId()));
    jTextField6.setText(usuarios.getNome());
    jFormattedTextField1.setText(usuarios.getCpf());
    jTextField3.setText(usuarios.getEmail());
    jFormattedTextField2.setText(usuarios.getTelefone());
    jTextField5.setText(usuarios.getHabilidade());
    jButton5.setEnabled(true);
     jButton6.setEnabled(true);
    }                                        
 /*-------------------------PESQUISAR-------------------------------------*/ 
    
  /*Botão para excluir os dados do funcionário, passa-se o nome digitado no campo “nome” para a exclusão no banco de dados: */

   /*-------------------------EXCLUIR-------------------------------------*/ 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       UsuarioDAO dao = new UsuarioDAO();
        dao.excluiFuncionario(jTextField6.getText());
        JOptionPane.showMessageDialog(null, "Funcionario "+jTextField6.getText()+" excluido! ");
        
    jTextField6.setText("");
    jFormattedTextField1.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jTextField5.setText("");
    jLabel8.setText("");
    jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
 /*-------------------------EXCLUIR-------------------------------------*/ 
    
 /*Botão para alterar os dados do funcionario, os mesmos são carregados dos campos para do objeto “Cliente”
 que altera estes dados no Banco de dados a partir do identificador do cliente informado,
 caso algum campo estiver vazio então é emitida mensagem de alerta e não é permitido alterar com os mesmos vazio:
 */

    /*-------------------------ALTERAR-------------------------------------*/ 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    Usuario usuarios = new Usuario();
    usuarios.setNome(jTextField6.getText());
    usuarios.setCpf(jFormattedTextField1.getText());
    usuarios.setEmail(jTextField3.getText());
    usuarios.setTelefone(jFormattedTextField2.getText());
    usuarios.setHabilidade(jTextField5.getText());
    usuarios.setId(Long.parseLong(jLabel8.getText()));

    // fazendo a validação dos dados
    if ((jTextField6.getText().isEmpty()) || (jFormattedTextField1.getText().isEmpty()) 
         || (jTextField3.getText().isEmpty()) || (jFormattedTextField2.getText().isEmpty()|| (jTextField5.getText().isEmpty()) )) {
       JOptionPane.showMessageDialog(null, "Os campos não podem ficar vazios");
    }
    else {
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        UsuarioDAO dao = new UsuarioDAO();
        dao.alteraUsuario(usuarios);
        JOptionPane.showMessageDialog(null, "Funcionario "+jTextField6.getText()+" alterado com sucesso! ");
    }
    // apaga os dados preenchidos nos campos de texto
    jTextField6.setText("");
    jFormattedTextField1.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jTextField5.setText("");
    jLabel8.setText("");
     jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
/*-------------------------ALTERAR-------------------------------------*/ 

//volta para a tela principal
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                                        
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration                   
}
