package org.example.modelo;

/**
 * Uma classe é uma estrutura que define um tipo de objeto.
 * A classe é como um molde, que define quais são as características (atributos)
 * e comportamentos (métodos) que os objetos desse tipo vão possuir.
 * Por exemplo, podemos definir uma classe chamada Filme que tenha
 * os atributos nome e anoLancamento, além do método exibeFichaTecnica()
 */
public class Filme {
    public String nome;
    public int anoLancamento;
    public int duracaoEmMinutos;
    public double somaAvaliacoes;
    public int totalAvaliacoes;
    public boolean incluidoNoPlano;


    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes = somaAvaliacoes + nota;
        totalAvaliacoes++;
    }

    public double retornaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
