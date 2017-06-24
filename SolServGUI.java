/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/
package gui;

import modelo.SolServ;
import dao.SolServDAO;
import javax.swing.JOptionPane;
import java.util.ArrayList; 

import java.sql.Date;  
import java.text.SimpleDateFormat;  

public class SolServGUI extends javax.swing.JFrame {
 

//consulta sql retorna os serviços oferecidos para um combobox no construtor:
 /*-------------------------CONSTRUTOR-------------------------------------*/ 
    public SolServGUI() {
        SolServDAO habilidade = new SolServDAO();
        ArrayList listagemDeHabilidades;
        initComponents();
        listagemDeHabilidades = habilidade.obterListaDeHabilidades();
        
        for (int registro = 0; registro < listagemDeHabilidades.size(); registro++){ 
        jComboBox1.addItem(listagemDeHabilidades.get(registro)); 
    }
        jComboBox1.setSelectedItem(null);
    }
/*-------------------------CONSTRUTOR-------------------------------------*/ 

/*Botão para inserir os dados da solicitação de serviços, os mesmos são carregados dos campos para o objeto “SolServ”,
caso algum campo esteja vazio então é emitida mensagem de alerta e não é permitido inserir com os mesmos vazios,
os campos de banco de dados “Aprovado” é inserido por default como “N” e “DataSolicitacao” com a data atual:
*/

  /*-------------------------INSERIR-------------------------------------*/ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
    SolServ solicitacao = new SolServ();
    solicitacao.setIdcliente(Long.parseLong(jTextField2.getText()));
    solicitacao.setHabilidade(jComboBox1.getSelectedItem().toString());
    solicitacao.setDescricao(jTextArea1.getText());
    solicitacao.setStatus("Cadastrada");
    
    Date data = new Date(System.currentTimeMillis());    
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");   
    solicitacao.setDataSolicitacao(formatarDate.format(data));
    solicitacao.setAprovado("N");


    // fazendo a validação dos dados
    if ((jTextField2.getText().isEmpty()) || (jComboBox1.getSelectedItem()==null) 
         || (jTextArea1.getText().isEmpty()) ) {
       JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
    }
    else {

        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        SolServDAO dao = new SolServDAO();
        dao.adiciona(solicitacao);
        JOptionPane.showMessageDialog(null, "Solicitação inserida com sucesso! ");
    }
    // apaga os dados preenchidos nos campos de texto
    jTextField2.setText("");
    jComboBox1.setSelectedItem(null); 
    jTextArea1.setText("");
    jLabel6.setText("");
    }                                        
  /*-------------------------INSERIR-------------------------------------*/ 

//botão para sair do sistema
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
    }                                        

//botão para voltar a tela principal
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
