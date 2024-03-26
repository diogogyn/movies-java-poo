package org.example;

import org.example.modelo.Filme;

public class Main {
    public static void main(String[] args) {
        /*um objeto, é uma instância de uma classe, sendo por meio dele que
        conseguimos representar informações na aplicação, pois a classe serve
        apenas para padronizar os objetos, mas não para representar um objeto
        em si. Para criar um objeto em Java, precisamos utilizar a palavra
        reservada new seguida do nome da classe e de parênteses vazios.
        Por exemplo, para criar um objeto do tipo Filme, podemos escrever o seguinte código:*/
        Filme filme = new Filme();
        filme.setNome("Shrek");
        filme.setAnoLancamento(2001);
        filme.setDuracaoEmMinutos(180);
        System.out.println(filme);

        filme.exibeFichaTecnica();

        filme.avalia(8);
        filme.avalia(5);

        System.out.println(filme.getSomaAvaliacoes());
        System.out.println(filme.getTotalAvaliacoes());
        System.out.println(filme.retornaMedia());
        //--------------------------------------------------
        /*
        Podemos criar vários objetos do tipo Pessoa,
        sendo que todos eles terão os mesmos atributos e métodos,
        já que são da mesma classe, mas cada um pode possuir informações
        distintas. Por exemplo:
        * */
        Filme segundoFilme = new Filme();
    }
}