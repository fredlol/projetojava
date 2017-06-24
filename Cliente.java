package modelo;

//herda atributos e métodos da superclasse Pessoa e implementa o atributos e método diferentes
public class Cliente extends Pessoa{

    String datanascimento;
    String endereco;
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
    public String getEndereco() {
        return endereco;
    }          

    
    public String getDataNascimento() {
        return datanascimento;
    }

    public void setDataNascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }    
    
}
