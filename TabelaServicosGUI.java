/*
Classes GUI (Graphical User Interface ou Interface Gráfica de Usuário)
*/

package gui;

import javax.swing.*;
import java.awt.*;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.table.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;

//aqui se declara uma jtable para poder criar a mesma “na mão”:
public class TabelaServicosGUI extends javax.swing.JFrame {
    private Connection connection;
    String FuncionarioLogado;
    JTable aux;
    javax.swing.JFrame jframe; // Reservo uma instância que será recebida pelo método 'public void instancia()'.
    
  /*----------------------------------------------------------------------*/
    public TabelaServicosGUI() {         
    super("JTable");		
     initComponents();
    }
  /*----------------------------------------------------------------------*/
    
    // Esse método vai inserir o valor que é recebido pelo parâmetro.  
/*----------------------------------------------------------------------*/    
    public void campoRecebe(String Txt){      
String FuncionarioLogado = Txt; // e inserir em um campo de texto jTextField.  
    
    final DefaultTableModel modelo = new DefaultTableModel();    
    // constrói a tabela
    JTable tabela = new JTable(modelo);
   
    
    // Cria as colunas
    modelo.addColumn("id");
    modelo.addColumn("idcliente");
    modelo.addColumn("habilidade");
    modelo.addColumn("datasolicitacao");
    modelo.addColumn("status");
    modelo.addColumn("idfuncionario");
    modelo.addColumn("numhoras");
    modelo.addColumn("valorhora");
    modelo.addColumn("validade");       
    modelo.addColumn("descicao");  
    
    this.connection = new ConnectionFactory().getConnection(); 
    //String sql = "SELECT * FROM solserv";
    String sql = "SELECT A.* FROM solserv A, usuario B WHERE A.habilidade = B.habilidade AND B.nome = '" + FuncionarioLogado + "'"; 

    // procura as OS relacionadas a função do funcionário logado e vai inserindo nas linhas da tabela do formulário:
     try {
        PreparedStatement stmt = connection.prepareStatement(sql);  
        ResultSet rs = stmt.executeQuery();
      
      while(rs.next()){ 
        int id = rs.getInt("id");
        int idcliente = rs.getInt("idcliente");
        String habilidade = rs.getString("habilidade");
        String descricao = rs.getString("descricao");
        String datasolicitacao = rs.getString("datasolicitacao");
        String status = rs.getString("status");
        int idfuncionario = rs.getInt("idfuncionario");
        Double numhoras = rs.getDouble("numhoras");
        Double valorhora = rs.getDouble("valorhora");
        String validade = rs.getString("validade");
        
        int idade = rs.getInt("idcliente");
        modelo.addRow(new Object[]{new Integer(id), new Integer(idcliente), habilidade, datasolicitacao,
            status, new Integer(idfuncionario), new Double(numhoras),new Double(valorhora),
            validade, descricao   });
      }
           
      // fim procedimento para obter os dados
      } 
      catch(SQLException ex){
           System.out.println("SQLException: " + ex.getMessage());
           System.out.println("SQLState: " + ex.getSQLState());
           System.out.println("VendorError: " + ex.getErrorCode());
      }
      catch(Exception e){
        System.out.println("Problemas ao tentar conectar com o banco de dados");	
    }
    // fim MySQL
    
//dimensiona as colunas da tabela do formulário:
    tabela.setPreferredScrollableViewportSize(new Dimension(1300, 400));
    tabela.getColumnModel().getColumn(0).setPreferredWidth(50); 
    tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
    tabela.getColumnModel().getColumn(4).setPreferredWidth(200);
    tabela.getColumnModel().getColumn(5).setPreferredWidth(50);
    tabela.getColumnModel().getColumn(6).setPreferredWidth(50);
    tabela.getColumnModel().getColumn(7).setPreferredWidth(50);
    tabela.getColumnModel().getColumn(8).setPreferredWidth(100);
    tabela.getColumnModel().getColumn(9).setPreferredWidth(400);
	
     
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
			
    JScrollPane scrollPane = new JScrollPane(tabela);
    c.add(scrollPane);
    	
    setSize(1600, 600);
    setVisible(true);
    //initComponents();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    aux = tabela;
    }  
/*----------------------------------------------------------------------*/
/*
Chama a interface OrdemServicoGUI passando por parâmetro o id do funcionário e da OS selecionada através da linha/coluna da tabela:
*/
	
  /*----------------------------------------------------------------------*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int linhaSel = aux.getSelectedRow();     
       int colunaSel = aux.getSelectedColumn();  
           Long idOS, idFunc;
       idOS = Long.parseLong(aux.getValueAt(linhaSel, 0).toString());
       idFunc= Long.parseLong(aux.getValueAt(linhaSel, 5).toString());       
      OrdemServicoGUI janelaPrincipal = new OrdemServicoGUI(); //faz a instancia   
     janelaPrincipal.campoRecebe(idOS, idFunc); // Chama o método que está na 'janelaPrincipal' 
     
    //OrdemServicoGUI janela = (OrdemServicoGUI)this.jframe; // Aqui acontece toda mágica, e feito um CAST
     
    dispose(); 
    janelaPrincipal.setVisible(true); // mostra a janelaPrincipal 
    }                                        
/*----------------------------------------------------------------------*/
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

