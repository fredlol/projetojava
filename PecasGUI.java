/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/

package gui;
import javax.swing.table.*;
import modelo.Pecas;
import javax.swing.JOptionPane;
import dao.PecasDAO;

public class PecasGUI extends javax.swing.JFrame {
Long idos;    
Double Valor;
Double Quantidade;
String Descricao;
/*----------------------------------------------------------------------*/
    public PecasGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
/*----------------------------------------------------------------------*/

//cria tabela e suas colunas na abertura do formulário
/*----------------------------------------------------------------------*/
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.addColumn("Descricao");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Valor");
    }                                 
/*----------------------------------------------------------------------*/
    
//adiciona linha a tabela com os campos preenchidos no formulário
/*----------------------------------------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Object row []= {jTextField1.getText(), jTextField2.getText(), jTextField3.getText()};
        ((DefaultTableModel)jTable1.getModel()).addRow(row);
    }                                        
 /*----------------------------------------------------------------------*/
    
//verifica se as linhas da tabela estão vazias, se não estiverem então vai pegando as linhas uma a uma
//e suas colunas e inserindo na tabela de banco de dados:
  /*-------------------------INSERIR-------------------------------------*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int somaLinhas = ((DefaultTableModel)jTable1.getModel()).getRowCount();
       Pecas material = new Pecas();
       int i;
       Double somatorio = 0.0;

    // fazendo a validação dos dados
    if ( somaLinhas == 0) {
       JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
    }
    else {
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        PecasDAO dao = new PecasDAO();
      for(i =0; i < somaLinhas; i++){
      material.setIdOS(idos);
      //JOptionPane.showMessageDialog(null,jTable1.getValueAt(0, 0).toString());
      material.setDescricao( ((DefaultTableModel)jTable1.getModel()).getValueAt(i, 0).toString()); 
      material.setQuantidade( Double.parseDouble(((DefaultTableModel)jTable1.getModel()).getValueAt(i, 1).toString()));
material.setValor(Double.parseDouble(((DefaultTableModel)jTable1.getModel()).getValueAt(i, 2).toString())) ;
      dao.adiciona(material);
      somatorio = somatorio + (material.getValor()* material.getQuantidade());
      //JOptionPane.showMessageDialog(null,somatorio);
    }
      JOptionPane.showMessageDialog(null, "Peças inseridas com sucesso! ");
    }
    dispose();
    }                                        
 /*-------------------------INSERIR-------------------------------------*/
    
//recebe id da ordem de serviço
 /*-----------------------------RECEBER RESULTADO-----------------------------*/   
    public void campoRecebe(Long idOS)
    {
     this.idos=idOS;
    }
 /*-----------------------------RECEBER RESULTADO-----------------------------*/      

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}

