/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank.RenovacaoBeneficiario;

/**
 *
 * @author wladyson
 */
public class Verificacao {
    String txtNomePendencia;
    String txtCPFPendencia;
    String txtRGPendencia;
    String lblObservacoes;
    String Pendencia;
    String DescricaoPendencia;

    public String getDescricaoPendencia() {
        return DescricaoPendencia;
    }

    public void setDescricaoPendencia(String DescricaoPendencia) {
        this.DescricaoPendencia = DescricaoPendencia;
    }

    public String getPendencia() {
        return Pendencia;
    }

    public void setPendencia(String Pendencia) {
        this.Pendencia = Pendencia;
    }
    //construtor
    public Verificacao() {
    }

    public String getTxtNomePendencia() {
        return txtNomePendencia;
    }

    public void setTxtNomePendencia(String txtNomePendencia) {
        this.txtNomePendencia = txtNomePendencia;
    }

    public String getTxtCPFPendencia() {
        return txtCPFPendencia;
    }

    public void setTxtCPFPendencia(String txtCPFPendencia) {
        this.txtCPFPendencia = txtCPFPendencia;
    }

    public String getTxtRGPendencia() {
        return txtRGPendencia;
    }

    public void setTxtRGPendencia(String txtRGPendencia) {
        this.txtRGPendencia = txtRGPendencia;
    }

    public String getLblObservacoes() {
        return lblObservacoes;
    }

    public void setLblObservacoes(String lblObservacoes) {
        this.lblObservacoes = lblObservacoes;
    }
    
}
