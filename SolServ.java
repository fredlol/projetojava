package modelo;

import java.util.Date;

public class SolServ {
    Long id;
    Long idcliente ;
    String habilidade;
    String descricao;
    String status;
    String datasolicitacao;
    Long idfuncionario;
    Double numhoras;
    Double valorhora;
    String nomecliente;
    String nomefuncionario;
    String aprovado;
    Double valor;
    Long vencimento;
    String dataencerramento;

    
    public String getDataEncerramento() {
        return dataencerramento;
    }

    public void setDataEncerramento(String dataencerramento) {
        this.dataencerramento = dataencerramento;
    }


    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }
    
        public String getNomeCliente() {
        return nomecliente;
    }

    public void setNomeCliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
    
        public String getNomeFuncionario() {
        return nomefuncionario;
    }

    public void setNomeFuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }    
    
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }    
    public String getHabilidade() {
        return habilidade;
    }      
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
      public String getDataSolicitacao() {
        return datasolicitacao;
    }

    public void setDataSolicitacao(String datasolicitacao) {
        this.datasolicitacao = datasolicitacao;
    }
    
    public Long getIdFuncionario() {
        return idfuncionario;
    }

    public void setIdFuncionario(Long idfuncionario) {
        this.idfuncionario = idfuncionario;
    }
    
    public double getNumHoras() {
        return numhoras;
    }

    public void setNumHoras(double numhoras) {
        this.numhoras = numhoras;
    }
    
        public double getValorHoras() {
        return valorhora;
    }

    public void setValorHoras(double valorhora) {
        this.valorhora = valorhora;
    }
    
    public String getAprovado() {
        return aprovado;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }
    
    public void setValorTotal(double valor) {
        this.valor = valor;
    }
    
        public double getValorTotal() {
        return valor;
    } 
        
    public Long getVencimento() {
    return vencimento;
    }

    public void setVencimento(Long vencimento) {
        this.vencimento = vencimento;
    }
  
}
