
package gui;

import java.util.ArrayList; 
import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;


public class LogaFuncGUI extends javax.swing.JFrame {
    
    javax.swing.JFrame jframe; // Reservo uma instância que será recebida pelo método 'public void instancia()'.

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
     
     public void instancia(javax.swing.JFrame jframe){  
    this.jframe = jframe; // Guarda o valor recebido pelo parâmetro.
    setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
}  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ESCOLHA O FUNCIONARIO:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
/*----------------------------------------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if ((jComboBox1.getSelectedItem()==null)) {
       JOptionPane.showMessageDialog(null, "Seleção não pode estar vazia");
    }
    else {
    TabelaServicosGUI janelaPrincipal = (TabelaServicosGUI)this.jframe; // Aqui acontece toda mágica, e feito um CAST(é isso pessoal ?)  
    janelaPrincipal.campoRecebe(jComboBox1.getSelectedItem().toString()); // Chama o método que está na 'janelaPrincipal'  
    //jTextField1.setText(null);  
    
    setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
/*----------------------------------------------------------------------*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

