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
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
