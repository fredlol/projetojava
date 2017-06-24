/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/

package gui;
import modelo.Fatura;
import javax.swing.JOptionPane;
import dao.FaturaDAO;

public class FaturaGUI extends javax.swing.JFrame {
    private Long idos;
    private Double valor;
    /*----------------------------CONSTRUTOR------------------------------------------*/
    public FaturaGUI() {
        initComponents();
         jTextField1.setEnabled(false);
         jRadioButton1.setSelected(true);
    }
    /*----------------------------CONSTRUTOR------------------------------------------*/

//se a forma de pagamento escolhida for cartão então o campo da instituição é limpo,
    //senão(opção depósito) então o campo é gravado no banco de dados junto com os demais campos
/*-------------------------------INSERIR---------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      Fatura fatura = new Fatura();
      
        if (jRadioButton1.isSelected()){
            fatura.setFormaPagamento("Cartao");
             fatura.setInstituicao("");
        }
        else {
            fatura.setFormaPagamento("Deposito");
            fatura.setInstituicao(jTextField1.getText());
        }           
        fatura.setIdOS(idos);
        fatura.setValor(valor);
        
        FaturaDAO dao = new FaturaDAO();
          dao.adiciona(fatura);
      JOptionPane.showMessageDialog(null, "OS Faturada com sucesso! ");
    
    dispose();
    }                                        
/*-------------------------------INSERIR---------------------------------------*/

    //se o botão de depósito for escolhido então o campo de instituição é habilitado:
/*----------------------------------------------------------------------*/
    private void jRadioButton2FocusGained(java.awt.event.FocusEvent evt) {                                          
    jTextField1.setEnabled(true);
    }                                         
/*----------------------------------------------------------------------*/

//ao se abrir o formlário os campos de id da OS e o valor da OS são preenchidos
/*----------------------------------------------------------------------*/
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
    jTextField3.setText(idos.toString());
    jTextField4.setText(valor.toString());
    }                                 
/*----------------------------------------------------------------------*/
    
    //se o botão de cartão for escolhido então o campo de instituição é desabilitado e limpo:
/*----------------------------------------------------------------------*/
    private void jRadioButton1FocusGained(java.awt.event.FocusEvent evt) {                                          
        jTextField1.setEnabled(false);
         jTextField1.setText("");
    }                                         
/*----------------------------------------------------------------------*/
    
//fecha interface FaturaGUI
/*----------------------------------------------------------------------*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
dispose();    }                                        
/*----------------------------------------------------------------------*/
    
//procedimento para receber id da OS e valor da OS:
 /*-----------------------------RECEBER RESULTADO-----------------------------*/   
    public void campoRecebe(Long idOS, Double valor)    {
     this.idos=idOS;
     this.valor=valor;    }
 /*-----------------------------RECEBER RESULTADO-----------------------------*/   

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
