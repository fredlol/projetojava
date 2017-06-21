
package gui;
import dao.FaturaDAO;
import modelo.SolServ;
import dao.SolServDAO;
import javax.swing.JOptionPane;
import dao.PecasDAO;
import modelo.Fatura;

public class OrdemServicoGUI extends javax.swing.JFrame {
  private Long idOS, idFunc;  
   javax.swing.JFrame jframe; 
/*-------------------------CONSTRUTOR-------------------------------------*/ 
    public OrdemServicoGUI() {
        initComponents();
        jComboBox1.setSelectedItem(null);
        jCheckBox1.setSelected(false);
       
    }
/*-------------------------CONSTRUTOR-------------------------------------*/ 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ORDEM DE SERVIÇO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitação de Serviço"));

        jLabel2.setText("Codigo OS::");

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente:");

        jLabel4.setText("Tipo de Serviço:");

        jLabel5.setText("Serviço Solicitado:");

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("Status Atual:");

        jTextField4.setEditable(false);

        jTextField8.setEditable(false);

        jLabel11.setText("Data Solicitação:");

        jTextField9.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField9)))
                                .addGap(27, 27, 27)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Orçamento"));

        jLabel6.setText("Nº de Horas:");

        jLabel7.setText("Valor da Hora:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cadastrada", "Aguardando Orcamento", "Aguardando Aprovacao do Cliente", "Aprovada", "Em andamento", "Concluida", "Em cobranca", "Encerrada", "Cancelada" }));

        jLabel9.setText("id Funcionario:");

        jLabel10.setText("Novo Status:");

        jButton4.setText("Alterar Orçamento");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setText("Nome Funcionario:");

        jTextField10.setEditable(false);

        jCheckBox1.setText("Aprovada pelo Cliente?");

        jButton5.setText("Materiais");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setText("Valor Total:");

        jTextField11.setEditable(false);

        jButton6.setText("Calcula");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Vencimento:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setText("dias");

        jButton7.setText("Faturar");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setEnabled(false);

        jLabel16.setText("Dt Encerramento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton7)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /*-----------------------------SAIR-----------------------------*/   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
 /*-----------------------------SAIR-----------------------------*/   

 /*-----------------------------VOLTAR-----------------------------*/   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed
 /*-----------------------------VOLTAR-----------------------------*/   
    
     /*-------------------------PESQUISAR-------------------------------------*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    SolServ solicitacao = new SolServ();
    jTextField10.setText("");

    // fazendo a validação dos dados
    if ((jTextField1.getText().isEmpty())) {
       JOptionPane.showMessageDialog(null, "O campo codigo deve estar preenchido para a pesquisa");
    }
    else {
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        SolServDAO dao = new SolServDAO();
        solicitacao = dao.getSolicitacao(Long.parseLong(jTextField1.getText()));
        JOptionPane.showMessageDialog(null, "Solicitação "+jTextField1.getText()+" pesquisada! ");
    }
    jTextField2.setText(solicitacao.getIdcliente().toString());
    jTextField3.setText(solicitacao.getHabilidade());
    jTextArea1.setText(solicitacao.getDescricao());
    jTextField4.setText(solicitacao.getStatus());
    jTextField8.setText(solicitacao.getDataSolicitacao());
    jTextField7.setText(solicitacao.getIdFuncionario().toString());
    jTextField5.setText(String.valueOf(solicitacao.getNumHoras()));
    jTextField6.setText(String.valueOf(solicitacao.getValorHoras()));
    jTextField9.setText(solicitacao.getNomeCliente());
    jTextField10.setText(solicitacao.getNomeFuncionario().toString());
    jTextField10.setText(solicitacao.getNomeFuncionario().toString());
    jTextField11.setText(String.valueOf(solicitacao.getValorTotal()));
    jFormattedTextField1.setText(solicitacao.getVencimento().toString());
    if(solicitacao.getAprovado().equals("S")) jCheckBox1.setSelected(true);
    else     jCheckBox1.setSelected(false);
    
    if (jTextField4.getText().equals("Concluida")){
         jButton7.setEnabled(true);
         jFormattedTextField2.setEnabled(true);
          jFormattedTextField2.setText(solicitacao.getDataEncerramento().toString());
    }
       
    else {
       jButton7.setEnabled(false); 
        jFormattedTextField2.setEnabled(false);
    }
        
    
    }//GEN-LAST:event_jButton3ActionPerformed
    /*-------------------------PESQUISAR-------------------------------------*/
    
 /*--------------------FUNÇÃO PESQUISAR-------------------------------------*/
    private void pesquisar()
    {
 SolServ solicitacao = new SolServ();
    jTextField10.setText("");
 //System.out.println(idOS);
        // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
        SolServDAO dao = new SolServDAO();
        solicitacao = dao.getSolicitacao(idOS);
        JOptionPane.showMessageDialog(null, "Solicitação "+idOS+ "pesquisada! ");
    
    jTextField1.setText(solicitacao.getId().toString());
    jTextField2.setText(solicitacao.getIdcliente().toString());
    jTextField3.setText(solicitacao.getHabilidade());
    jTextArea1.setText(solicitacao.getDescricao());
    jTextField4.setText(solicitacao.getStatus());
    jTextField8.setText(solicitacao.getDataSolicitacao());
    jTextField7.setText(idFunc.toString());
    //jTextField7.setText(solicitacao.getIdFuncionario().toString());
    jTextField5.setText(String.valueOf(solicitacao.getNumHoras()));
    jTextField6.setText(String.valueOf(solicitacao.getValorHoras()));
    jTextField9.setText(solicitacao.getNomeCliente());
    jTextField10.setText(solicitacao.getNomeFuncionario().toString());
    jTextField11.setText(String.valueOf(solicitacao.getValorTotal()));
    jFormattedTextField1.setText(solicitacao.getVencimento().toString());
    if(solicitacao.getAprovado().equals("S")) jCheckBox1.setSelected(true);
    else     jCheckBox1.setSelected(false);  
    if (jTextField4.getText().equals("Concluida")){
         jButton7.setEnabled(true);
         jFormattedTextField2.setEnabled(true);
         jFormattedTextField2.setText(solicitacao.getDataEncerramento().toString());
    }
       
    else {
       jButton7.setEnabled(false); 
        jFormattedTextField2.setEnabled(false);
    }
    }
 /*--------------------FUNÇÃO PESQUISAR-------------------------------------*/
    
    
    
    /*---------------------------ALTERAR--------------------------------------*/
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    SolServ solicitacao = new SolServ();

    // fazendo a validação dos dados
    if ((jTextField5.getText().isEmpty()) || (jTextField6.getText().isEmpty())
         || (jTextField7.getText().isEmpty()) || (jComboBox1.getSelectedItem()==null)
            || (jTextField11.getText().isEmpty()) ||(jFormattedTextField1.getText().isEmpty()) 
            || (Integer.parseInt(jFormattedTextField1.getText())) <30) {
       JOptionPane.showMessageDialog(null, "Os campos não podem ficar vazios");
       JOptionPane.showMessageDialog(null, "Data vencimento tem que estar entre 30 e 90");
    }
    else {
       
    solicitacao.setIdFuncionario(Long.parseLong(jTextField7.getText()));
    solicitacao.setValorHoras(Double.parseDouble(jTextField6.getText()));
    solicitacao.setStatus(jComboBox1.getSelectedItem().toString());
    solicitacao.setNumHoras(Double.parseDouble(jTextField5.getText()));
    solicitacao.setId(Long.parseLong(jTextField1.getText()));
    solicitacao.setValorTotal(Double.parseDouble(jTextField11.getText()));
    solicitacao.setVencimento(Long.parseLong(jFormattedTextField1.getText()));
    if(jCheckBox1.isSelected()==true) solicitacao.setAprovado("S");
    else     solicitacao.setAprovado("N");
   if (jTextField4.getText().equals("Concluida"))    
    solicitacao.setDataEncerramento((jFormattedTextField2.getText()));
    
    SolServDAO dao = new SolServDAO();
        dao.alteraOS(solicitacao);
        JOptionPane.showMessageDialog(null, "OC "+jTextField1.getText()+" alterada com sucesso! ");
    }
    

 
       
    jTextArea1.setText("");
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
    jTextField11.setText("");
    jButton7.setEnabled(false);
    jFormattedTextField2.setText("");
    jFormattedTextField1.setText("");
    jComboBox1.setSelectedItem(null);
    jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButton4ActionPerformed
/*---------------------------ALTERAR--------------------------------------*/
    
/*---------------------------PEÇAS--------------------------------------*/
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      PecasGUI janela = new PecasGUI(); //faz a instancia   
     janela.campoRecebe( Long.parseLong(jTextField1.getText())); // Chama o método que está na 'janelaPrincipal' 
     
    //dispose(); 
    janela.setVisible(true); // mostra a janelaPrincipal 
    }//GEN-LAST:event_jButton5ActionPerformed
/*---------------------------PEÇAS--------------------------------------*/

/*---------------------------CALCULA VALOR--------------------------------------*/
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    PecasDAO dao = new PecasDAO();
        Double somatorio = 0.0;
        String aux;
    somatorio = somatorio + (Double.parseDouble(jTextField5.getText())* Double.parseDouble(jTextField6.getText()));
    somatorio = somatorio + dao.getSomaPecas(Long.parseLong(jTextField1.getText()));
    somatorio = somatorio * 1.05;
    aux = truncateDouble(somatorio,2);
    jTextField11.setText(aux);
    }//GEN-LAST:event_jButton6ActionPerformed
/*---------------------------CALCULA VALOR--------------------------------------*/

    
/*---------------------------FATURA--------------------------------------*/
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Fatura fatura = new Fatura();
        FaturaDAO dao = new FaturaDAO();
        System.out.println("passou aqui");
        fatura= dao.procura(Long.parseLong(jTextField1.getText()));
        
        if (fatura.getId() != 0)
        {
             JOptionPane.showMessageDialog(null, "Já existe fatura cadastrada, favor encerrar OS! ");
        }
        else{
        FaturaGUI janela1 = new FaturaGUI(); //faz a instancia   
        System.out.println(jTextField1.getText());
        janela1.campoRecebe( Long.parseLong(jTextField1.getText()), Double.parseDouble(jTextField11.getText())); // Chama o método que está na 'janelaPrincipal' 
        janela1.setVisible(true); // mostra a janelaPrincipal    
        }
    }//GEN-LAST:event_jButton7ActionPerformed
  /*---------------------------FATURA--------------------------------------*/

    
 
    
 /*-----------------------------RECEBER RESULTADO-----------------------------*/   
    public void campoRecebe(Long idOS, Long idFunc)
    {
     this.idOS=idOS;
     this.idFunc=idFunc;
       System.out.println(idFunc);
      pesquisar();
    }
 /*-----------------------------RECEBER RESULTADO-----------------------------*/     
    
    
    
/*---------------------------FUNÇÃO PARA TRUNCAR------------------------------*/
public String truncateDouble(Double num,int numLength) {
 
        String stringDouble = String.valueOf( num );
        int iPoint = stringDouble.indexOf(".");
        int iMore = stringDouble.length() - (iPoint + numLength + 1);
 
        if( iMore < 0 ) 
 
            for(int i=0;i<(-iMore);i++)
                stringDouble = stringDouble + "0";
 
        else
 
            stringDouble=stringDouble.substring(0 , iPoint + numLength + 1 );
 
 return stringDouble;
    }
/*---------------------------FUNÇÃO PARA TRUNCAR------------------------------*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
