package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    //atributos//
    private int numero;
    private Serie serie;
    private String nome;
    private int totalDeVisualizacoes;

    //getters//
    public int getNumero() {
        return numero;
    }
    public Serie getSerie() {
        return serie;
    }
    public String getNome() {
        return nome;
    }
    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    //setters//
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
