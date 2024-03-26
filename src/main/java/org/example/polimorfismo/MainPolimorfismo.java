package org.example.polimorfismo;

import org.example.polimorfismo.calculos.CalculadoraDeTempo;
import org.example.polimorfismo.modelo.Filme;
import org.example.polimorfismo.modelo.Serie;


public class MainPolimorfismo {
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
        filme.setDuracaoEmMinutos(100);
        filme.avalia(8);
        filme.avalia(5);

        filme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());
        System.out.println("-------------------------------------------------------------------");
        //--------------------------------------------------
        Serie prisonBreak = new Serie();
        prisonBreak.setNome("Prison break");
        prisonBreak.setAnoLancamento(2007);
        prisonBreak.setTemporadas(5);
        prisonBreak.setMinutosPorEpisodio(90);
        prisonBreak.setEpisodiosPorTemporada(10);
        prisonBreak.exibeFichaTecnica();
        System.out.println("Duração da serie: " + prisonBreak.getDuracaoEmMinutos());
        System.out.println("-------------------------------------------------------------------");
        //--------------------------------------------------
        /*
        Podemos criar vários objetos do tipo Pessoa,
        sendo que todos eles terão os mesmos atributos e métodos,
        já que são da mesma classe, mas cada um pode possuir informações
        distintas. Por exemplo:
        * */
        Filme segundoFilme = new Filme();
        segundoFilme.setNome("Piratas do Vale do Silicio");
        segundoFilme.setAnoLancamento(1993);
        segundoFilme.setDuracaoEmMinutos(200);
        segundoFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());
        //--------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        calculadoraDeTempo.inclui(segundoFilme);
        calculadoraDeTempo.inclui(prisonBreak);
        System.out.println("Tempo total: " + calculadoraDeTempo.getTempoTotal());
        //--------------------------------------------------

    }
}