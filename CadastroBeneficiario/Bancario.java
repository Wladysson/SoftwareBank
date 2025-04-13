/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank.CadastroBeneficiario;

/**
 *
 * @author wladyson
 */
public class Bancario {
    String Agencia;
    String Codigo;
    String NumConta;
    String NomeConta;
    String CodBic;
    String IBAN;
    String CNPJ;
    String Operaçao;
    String TipoConta;
    String TipoConvenio;
    String Observacao;

    public String getOperaçao() {
        return Operaçao;
    }

    public void setOperaçao(String Operaçao) {
        this.Operaçao = Operaçao;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNumConta() {
        return NumConta;
    }

    public void setNumConta(String NumConta) {
        this.NumConta = NumConta;
    }

    public String getNomeConta() {
        return NomeConta;
    }

    public void setNomeConta(String NomeConta) {
        this.NomeConta = NomeConta;
    }

    public String getCodBic() {
        return CodBic;
    }

    public void setCodBic(String CodBic) {
        this.CodBic = CodBic;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
     public String getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(String TipoConta) {
        this.TipoConta = TipoConta;
    }

    public String getTipoConvenio() {
        return TipoConvenio;
    }

    public void setTipoConvenio(String TipoConvenio) {
        this.TipoConvenio = TipoConvenio;
    }
    
    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public Bancario() {
    }
}
