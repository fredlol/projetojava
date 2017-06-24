
package gui;
/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/
import modelo.Cliente;
import dao.ClienteDAO;
import javax.swing.JOptionPane;
public class ClienteGUI extends javax.swing.JFrame {

    public ClienteGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

Botão para sair do sistema:
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
    }       

/*Botão para inserir os dados do cliente, os mesmos são carregados dos campos para o objeto “Cliente”,
 caso algum campo esteja vazio então é emitida mensagem de alerta e não é permitido inserir com os mesmos vazios: */

    /*-------------------------INSERIR-------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
    Cliente clientes = new Cliente();
    clientes.setNome(jTextField1.getText());
    clientes.setCpf(jFormattedTextField2.getText());
    clientes.setEmail(jTextField2.getText());
    clientes.setTelefone(jFormattedTextField3.getText());
    clientes.setEndereco(jTextField3.getText());
    clientes.setDataNascimento(jFormattedTextField4.getText());

    // fazendo a validação dos dados
    if ((jTextField1.getText().isEmpty()) || (jTextField2.getText().isEmpty()) 
         || (jTextField3.getText().isEmpty()) || (jFormattedTextField2.getText().isEmpty())
           || (jFormattedTextField3.getText().isEmpty())|| (jFormattedTextField4.getText().isEmpty() ) ) {
       JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
    }
    else {

        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        ClienteDAO dao = new ClienteDAO();
        dao.adiciona(clientes);
        JOptionPane.showMessageDialog(null, "Cliente "+jTextField1.getText()+" inserido com sucesso! ");
    }

    // apaga os dados preenchidos nos campos de texto
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jFormattedTextField3.setText("");
    jFormattedTextField4.setText("");
    jLabel9.setText("");
    
     jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
/*-------------------------INSERIR-------------------------------------*/
    
/*Botão para pesquisar os dados do cliente, os mesmos são carregados nos campos do objeto “Cliente”
que recebeu os dados retornados do Banco de dados e deste para os campos de exibição na tela,
caso o nome a ser pesquisado estiver vazio então é emitida mensagem de alerta e não é permitido pesquisar com o mesmo vazio,
habilita-se os botões de excluir e alterar: */

   /*-------------------------PESQUISAR-------------------------------------*/  
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    Cliente clientes = new Cliente();

    // fazendo a validação dos dados
    if ((jTextField1.getText().isEmpty())) {
       JOptionPane.showMessageDialog(null, "O campo nome deve estar preenchido para a pesquisa");
    }
    else {
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        ClienteDAO dao = new ClienteDAO();
        clientes = dao.getTodosClientes(jTextField1.getText());
        JOptionPane.showMessageDialog(null, "Cliente "+jTextField1.getText()+" pesquisado! ");
    }
    jLabel9.setText(String.valueOf(clientes.getId()));
    jTextField1.setText(clientes.getNome());
    jFormattedTextField2.setText(clientes.getCpf());
    jTextField2.setText(clientes.getEmail());
    jFormattedTextField3.setText(clientes.getTelefone());
    jFormattedTextField4.setText(clientes.getDataNascimento());
    jTextField3.setText(clientes.getEndereco());
    
    jButton5.setEnabled(true);
     jButton6.setEnabled(true);
    }                                        
/*-------------------------PESQUISAR-------------------------------------*/
    
/*Botão para limpar os dados nos campos do formulário e desabilita os botões de excluir e alterar: */

     /*-------------------------LIMPAR-------------------------------------*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // apaga os dados preenchidos nos campos de texto
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jFormattedTextField3.setText("");
    jFormattedTextField4.setText("");
     jLabel9.setText("");
    
    jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
  /*-------------------------LIMPAR-------------------------------------*/
    
  /*Botão para excluir os dados do cliente,
  passa-se o nome digitado no campo “nome” para a exclusão no banco de dados: */
  /*-------------------------EXCLUIR-------------------------------------*/ 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       ClienteDAO dao = new ClienteDAO();
        dao.excluiCliente(jTextField1.getText());
        JOptionPane.showMessageDialog(null, "Cliente "+jTextField1.getText()+" excluido! ");
        
        
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jFormattedTextField3.setText("");
    jFormattedTextField4.setText("");
     jLabel9.setText("");
    jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
/*-------------------------EXCLUIR-------------------------------------*/ 
    
  /*Botão para alterar os dados do cliente, os mesmos são carregados dos campos para do objeto “Cliente”
  que altera estes dados no Banco de dados a partir do identificador do cliente informado,
  caso algum campo estiver vazio então é emitida mensagem de alerta e não é permitido alterar com os mesmos vazios,
  ao final desabilita-se os botões de excluir e alterar que estavam habilitados: */

/*-------------------------ALTERAR-------------------------------------*/ 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    Cliente clientes = new Cliente();
    clientes.setNome(jTextField1.getText());
    clientes.setCpf(jFormattedTextField2.getText());
    clientes.setEmail(jTextField2.getText());
    clientes.setTelefone(jFormattedTextField3.getText());
    clientes.setEndereco(jTextField3.getText());
    clientes.setDataNascimento(jFormattedTextField4.getText());
    clientes.setId(Long.parseLong(jLabel9.getText()));

    // fazendo a validação dos dados
    if ((jTextField1.getText().isEmpty()) || (jTextField2.getText().isEmpty()) 
         || (jTextField3.getText().isEmpty()) || (jFormattedTextField2.getText().isEmpty())
           || (jFormattedTextField3.getText().isEmpty())|| (jFormattedTextField4.getText().isEmpty() ) ) {
       JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
    }
    else {

        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        ClienteDAO dao = new ClienteDAO();
        dao.alteraCliente(clientes);
        JOptionPane.showMessageDialog(null, "Cliente "+jTextField1.getText()+" alterado com sucesso! ");
    }

    // apaga os dados preenchidos nos campos de texto
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jFormattedTextField3.setText("");
    jFormattedTextField4.setText("");
     jLabel9.setText("");
    
     jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }                                        
  /*-------------------------ALTERAR-------------------------------------*/ 

    //Botão para retornar à tela principal:
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     new PrincipalGUI().setVisible(true);//que quer abrir  
     dispose(); 
    }                                        
    
    
    // Declaração de variáveis:                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}
