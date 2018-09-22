/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Felipe Cardozo
 */
public class Item {
    private String descricao;
    private Date dataExecucao;
    private int percentualCorrespondente;
    
    public Item(int percentualCorrespondente, String descricao, Date dataExecucao){
        this.percentualCorrespondente = percentualCorrespondente;
        this.descricao = descricao;
        this.dataExecucao = dataExecucao;
    }
    public int getPercentualCorrespondente(){
        return this.percentualCorrespondente;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public Date getDataExecucao(){
        return this.dataExecucao;
    }
    public void setPercentualCorrespondente(int percentualCorrespondente){
        this.percentualCorrespondente = percentualCorrespondente;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setDataExecucao(Date dataExecucao){
        this.dataExecucao = dataExecucao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
