/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Felipe Cardozo
 */
public class Tarefa {
    private int percentualConcluido;
    private String detalhamento;
    private Date dataLimite;
    private List<Item> itens;

    public Tarefa(){
        this.itens = new ArrayList<Item>();
    }
    public Tarefa(String detalhamento, Date dataLimite){
        this.detalhamento = detalhamento;
        this.dataLimite = dataLimite;
        this.itens = new ArrayList<Item>();
    }
    public Tarefa(String detalhamento){
        this.detalhamento = detalhamento;
        this.itens = new ArrayList<Item>();
    }
    
    public void createItem(int percentualCorrespondente, String descricao, Date dataExecucao){
        int percentualTotal = 0;
        for(Item item: itens){
            percentualTotal = percentualTotal + item.getPercentualCorrespondente();
        }
        percentualTotal = percentualTotal + percentualCorrespondente;
        
        if(percentualTotal <= 100){
            Item i = new Item(percentualCorrespondente, descricao, dataExecucao);
            this.itens.add(i);
            this.percentualConcluido += percentualCorrespondente;
        }
        //colocar uma exception aqui
    }
    public List<Item> getItens(){
        return this.itens;
    }
    public int getPercentualConcluido(){
        return this.percentualConcluido;
    }
    public String getDetalhamento(){
        return this.detalhamento;
    }
    public Date getDataLimite(){
        return this.dataLimite;
    }
    public void setPercentualConcluido(int percentualConcluido){
        this.percentualConcluido = percentualConcluido;
    }
    public void setDetalhamento(String detalhamento){
        this.detalhamento = detalhamento;
    }
    public void setDataLimite(Date dataLimite){
        this.dataLimite = dataLimite;
    }
    public void removeItem(Item item){
        this.itens.remove(item);
    }
    
    @Override
    public String toString() {
        return detalhamento;
    }
}
