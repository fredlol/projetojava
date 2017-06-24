/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/
package gui;
import dao.FaturaDAO;
import modelo.SolServ;
import dao.SolServDAO;
import javax.swing.JOptionPane;
import dao.PecasDAO;
import modelo.Fatura;

/*
Esta classe lida com a interface da ordem de serviço, só é possível faturar a mesma quando estiver no status “concluída”
e deve-se utilizar o botão “calcular” para calcular o valor do orçamento,
as peças e materiais devem ser cadastrados em tela própria e após voltar para esta e calcular o novo valor e alterar a OS.
*/

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
  
/*-----------------------------SAIR-----------------------------*/   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
    }                                        
 /*-----------------------------SAIR-----------------------------*/   

 /*-----------------------------VOLTAR-----------------------------*/   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     new PrincipalGUI().setVisible(true);//que quer abrir  
   dispose(); 
    }                                        
 /*-----------------------------VOLTAR-----------------------------*/   
    

/*
Botão para pesquisar os dados da Ordem de Serviço, os mesmos são carregados nos campos do objeto “SolServ”
que recebeu os dados retornados do Banco de dados e deste para os campos de exibição na tela,
caso o identificador a ser pesquisado estiver vazio então é emitida mensagem de alerta
e não é permitido pesquisar com o mesmo vazio, caso a Ordem de Serviço estiver no status “Concluida”
então são habilitados o botão de faturar e o campo para inserir a data de encerramento:
*/
  
  
/*-------------------------PESQUISAR-------------------------------------*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        
    /*-------------------------PESQUISAR-------------------------------------*/
    
 /*
 Função para pesquisar os dados da Ordem de Serviço, os mesmos são carregados nos campos do objeto “SolServ”
 que recebeu os dados retornados do Banco de dados e deste para os campos de exibição na tela,
 o identificador é recebido pela função “campoRecebe” na chamada da interface,
 caso a Ordem de Serviço estiver no status “Concluida” então são habilitados o botão de faturar e o campo
 para inserir a data de encerramento:
  */

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
    
  /*
  Botão para alterar os dados da ordem de serviço, os mesmos são carregados dos campos para do objeto “SolServ”
  que altera estes dados no Banco de dados a partir do identificador da ordem de serviço informada,
  caso algum campo estiver vazio ou a data de validade fora dos limites então é emitida mensagem de alerta
  e não é permitido alterar com os mesmos vazios:
  */


    /*---------------------------ALTERAR--------------------------------------*/
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        
/*---------------------------ALTERAR--------------------------------------*/
    

//chama a tela de cadastro de peças passando por parâmetro o identificador da ordem de serviço relacionada
/*---------------------------PEÇAS--------------------------------------*/
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      PecasGUI janela = new PecasGUI(); //faz a instancia   
     janela.campoRecebe( Long.parseLong(jTextField1.getText())); // Chama o método que está na 'janelaPrincipal' 
     
    //dispose(); 
    janela.setVisible(true); // mostra a janelaPrincipal 
    }                                        
/*---------------------------PEÇAS--------------------------------------*/

/*calcula o valor do orçamendo da OS, pega o valor das peças/materiais e soma com
  o valor da hora do funcionário multiplicado pelo número de horas a serem gastas,
  o valor final de tudo é acrescido de 5% a título de iss:
  */
/*---------------------------CALCULA VALOR--------------------------------------*/
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    PecasDAO dao = new PecasDAO();
        Double somatorio = 0.0;
        String aux;
    somatorio = somatorio + (Double.parseDouble(jTextField5.getText())* Double.parseDouble(jTextField6.getText()));
    somatorio = somatorio + dao.getSomaPecas(Long.parseLong(jTextField1.getText()));
    somatorio = somatorio * 1.05;
    aux = truncateDouble(somatorio,2);
    jTextField11.setText(aux);
    }                                        
/*---------------------------CALCULA VALOR--------------------------------------*/

//verifica se existe fatura já cadastrada e informa para encerrar a OS caso exista, senão chama a interface FaturaGUI para cadastrar a fatura desta OS
/*---------------------------FATURA--------------------------------------*/
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Fatura fatura = new Fatura();
        FaturaDAO dao = new FaturaDAO();
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
    }                                        
  /*---------------------------FATURA--------------------------------------*/

    
 
/*
recebe id da OS e id do funcionário passados pela tela de TabelaServicosGUI e faz a pesquisa dos dados para mostrar no formulário:
*/
 /*-----------------------------RECEBER RESULTADO-----------------------------*/   
    public void campoRecebe(Long idOS, Long idFunc)
    {
     this.idOS=idOS;
     this.idFunc=idFunc;
       System.out.println(idFunc);
      pesquisar();
    }
 /*-----------------------------RECEBER RESULTADO-----------------------------*/     
    
    
//função para truncar o valor do cálculo do orçamento, retirada da internet:
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

    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
}


