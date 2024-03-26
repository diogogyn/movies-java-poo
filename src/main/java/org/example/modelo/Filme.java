package org.example.modelo;

/**
 * Uma classe é uma estrutura que define um tipo de objeto.
 * A classe é como um molde, que define quais são as características (atributos)
 * e comportamentos (métodos) que os objetos desse tipo vão possuir.
 * Por exemplo, podemos definir uma classe chamada Filme que tenha
 * os atributos nome e anoLancamento, além do método exibeFichaTecnica()
 */

/**
 * Em Java, os modificadores de acesso são palavras-chave que definem o nível de
 * * visibilidade de classes, atributos e métodos, sendo que eles ajudam a garantir
 * * a segurança e encapsulamento do código.
 * Public
 * O modificador de acesso public é o mais permissivo de todos.
 * Uma classe, atributo ou método declarado como public pode ser acessado por
 * qualquer classe em qualquer pacote. Ou seja, ele possui visibilidade pública
 * e pode ser utilizado livremente.
 */
public class Filme {
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private boolean incluidoNoPlano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }


//    public void setSomaAvaliacoes(double somaAvaliacoes) {
//        this.somaAvaliacoes = somaAvaliacoes;
//    }

    /**
     * “This”, traduzindo para o português (Isto/este/esta),
     * é usado para fazer referência aos atributos da classe,
     * especialmente em métodos que têm parâmetros com o mesmo nome do
     * atributo da classe em que estamos trabalhando.
     */
    public int getTotalAvaliacoes() {
        return this.totalAvaliacoes;
    }
    //removido. não pode ser alterado externamente
//    public void setTotalAvaliacoes(int totalAvaliacoes) {
//        this.totalAvaliacoes = totalAvaliacoes;
//    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

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
