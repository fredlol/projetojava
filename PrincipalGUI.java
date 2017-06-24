package gui;
/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/

public class PrincipalGUI extends javax.swing.JFrame {
    public PrincipalGUI() {
        initComponents();
    }

//Abre interface Cliente
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   new ClienteGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                      
                  
//Abre interface Funcionário
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   new UsuarioGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }              
                          
//Fecha Sistema
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
    }                                        

//Abre interface Solicitação de Serviços
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     new SolServGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                                        

//Abre duas interfaces, uma para Logar Funcionário que irá selecionar o funcionário e outra que ficará em “backgroung” esperando as informações da primeira para popular uma tabela com Ordens de serviço relativas a habilidade do funcionário selecionado.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        TabelaServicosGUI janelaPrincipal = new TabelaServicosGUI(); //faz a instancia  
        janelaPrincipal.setVisible(true); // mostra a janelaPrincipal  
        LogaFuncGUI janelaSecundaria = new LogaFuncGUI(); // faz a instância  
        janelaSecundaria.instancia(janelaPrincipal); // janelaSecundaria possui um método que recebe a instância da 'janelaPrincipal', no qual a gente precisa para enviar os valores mais tarde.   
        janelaSecundaria.setVisible(true); // mostra a janelaSecundaria  
    }                                        

//Abre interface Ordem de Serviço diretamente
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   new OrdemServicoGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                                        

//Abre interface principal, no caso desta classe descrita aqui
  public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}

