package modelo;

//herda atributos e métodos da superclasse Pessoa e implementa o atributo e método diferente
public class Usuario extends Pessoa{

    String habilidade;
    
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }    
    public String getHabilidade() {
        return habilidade;
    }          

}
