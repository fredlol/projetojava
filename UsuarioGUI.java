
package gui;

import modelo.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
public class UsuarioGUI extends javax.swing.JFrame {


    public UsuarioGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE FUNCIONÁRIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo Funcionário"));

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("e-mail");

        jLabel5.setText("Telefone");

        jLabel6.setText("Habilidade");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton5.setText("Excluir");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Alterar");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jButton2))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jButton3.setText("SAIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     /*-------------------------INSERIR-------------------------------------*/ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed
 /*-------------------------INSERIR-------------------------------------*/ 
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    System.exit(0);       
    }//GEN-LAST:event_jButton3ActionPerformed

    
    /*-------------------------LIMPAR-------------------------------------*/ 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField6.setText("");
    jFormattedTextField1.setText("");
    jTextField3.setText("");
    jFormattedTextField2.setText("");
    jTextField5.setText("");
    jLabel8.setText("");
    
    jButton5.setEnabled(false);
     jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed
 /*-------------------------LIMPAR-------------------------------------*/
    
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    
   /*-------------------------PESQUISAR-------------------------------------*/ 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
    }//GEN-LAST:event_jButton4ActionPerformed
 /*-------------------------PESQUISAR-------------------------------------*/ 
    
    
   /*-------------------------EXCLUIR-------------------------------------*/ 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
    }//GEN-LAST:event_jButton5ActionPerformed
 /*-------------------------EXCLUIR-------------------------------------*/ 
    
    
    /*-------------------------ALTERAR-------------------------------------*/ 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

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
    }//GEN-LAST:event_jButton6ActionPerformed
/*-------------------------ALTERAR-------------------------------------*/ 
    


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
