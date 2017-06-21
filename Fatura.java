package modelo;
public class Fatura {
    Long id;
    Long idOS;
    Double valor;
    String formapagamento;
    String instituicao;
    
    public Fatura(){
    this.id=0l;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdOS() {
        return idOS;
    }

    public void setIdOS(Long idOS) {
        this.idOS = idOS;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public void setFormaPagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }    
    public String getFormaPagamento() {
        return formapagamento;
    }          



    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
  
}
