/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/
package gui;

import java.util.ArrayList; 
import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;


public class LogaFuncGUI extends javax.swing.JFrame {
    
    javax.swing.JFrame jframe; // Reservo uma instância que será recebida pelo método 'public void instancia()'.

//consulta sql retorna os nomes dos funcionários para um combobox no construtor:
/*-------------------------CONSTRUTOR-------------------------------------*/ 
     public LogaFuncGUI() {
        UsuarioDAO funcionario = new UsuarioDAO();
        ArrayList NomeFuncionarios;
        initComponents();
        NomeFuncionarios = funcionario.obterNomesTodosFuncs();
        
        for (int registro = 0; registro < NomeFuncionarios.size(); registro++){ 
        jComboBox1.addItem(NomeFuncionarios.get(registro)); 
        }
        jComboBox1.setSelectedItem(null);
    }
/*-------------------------CONSTRUTOR-------------------------------------*/ 

//para fechar a tela
     public void instancia(javax.swing.JFrame jframe){  
    this.jframe = jframe; // Guarda o valor recebido pelo parâmetro.
    setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
}  

//chama o método da janela principal que irá receber o funcionário selecionado caso a seleção não esteja vazia (TabelaServicosGUI)
/*----------------------------------------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     if ((jComboBox1.getSelectedItem()==null)) {
       JOptionPane.showMessageDialog(null, "Seleção não pode estar vazia");
    }
    else {
    TabelaServicosGUI janelaPrincipal = (TabelaServicosGUI)this.jframe; // Aqui acontece toda mágica, e feito um CAST 
    janelaPrincipal.campoRecebe(jComboBox1.getSelectedItem().toString()); // Chama o método que está na 'janelaPrincipal'      
    setVisible(false);
    }                                        
    }
/*----------------------------------------------------------------------*/
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
