package org.example.modelo;

/**
 * Esta classe é criada para compartilhar atributos entre classes semalhantes.
 * Chamamos isso de herança
 */
public class Titulo {
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
    public void avalia(double nota){
        somaAvaliacoes = somaAvaliacoes + nota;
        totalAvaliacoes++;
    }

    public double retornaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
    }
}
