
package gui;
import modelo.Cliente;
import dao.ClienteDAO;
import javax.swing.JOptionPane;
public class ClienteGUI extends javax.swing.JFrame {

    public ClienteGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Clientes"));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("e-mail");

        jLabel5.setText("Telefone");

        jLabel6.setText("Data Nascimento");

        jLabel7.setText("Endereço");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

        jLabel8.setText("Codigo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jFormattedTextField3)
                            .addComponent(jTextField3)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTES");

        jButton3.setText("Sair");
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addGap(208, 208, 208))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /*-------------------------INSERIR-------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed
/*-------------------------INSERIR-------------------------------------*/
    
    
   /*-------------------------PESQUISAR-------------------------------------*/  
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

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
    }//GEN-LAST:event_jButton4ActionPerformed
/*-------------------------PESQUISAR-------------------------------------*/
    
    
     /*-------------------------LIMPAR-------------------------------------*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed
  /*-------------------------LIMPAR-------------------------------------*/
    
    
    
  /*-------------------------EXCLUIR-------------------------------------*/ 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
    }//GEN-LAST:event_jButton5ActionPerformed
/*-------------------------EXCLUIR-------------------------------------*/ 
    
    
    
 /*-------------------------ALTERAR-------------------------------------*/ 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }//GEN-LAST:event_jButton7ActionPerformed
  /*-------------------------ALTERAR-------------------------------------*/ 
    
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
    // End of variables declaration//GEN-END:variables
}
