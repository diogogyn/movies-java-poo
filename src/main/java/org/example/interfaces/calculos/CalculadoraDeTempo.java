package org.example.interfaces.calculos;

import org.example.interfaces.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /**
     * Sobrecarga de metodos
     * Deixarei comentado para exemplificar o polimorfismo
     */
//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    /**
     * Exemplo de sobrecarga de metodo para classes com herança
     * @param titulo
     */
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
