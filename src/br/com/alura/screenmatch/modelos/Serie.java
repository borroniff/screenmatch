package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    //atributos//
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


    //getters//
    public int getTemporadas() {
        return temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }


    //setters//
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //metodos//

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
