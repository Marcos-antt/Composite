package org.example;

public class TesteComposite {
    public static void main(String[] args) {
        Componente folha1 = new Folha("Folha 1");
        Componente folha2 = new Folha("Folha 2");
        Componente folha3 = new Folha("Folha 3");

        Componente composite1 = new Composite("Composite 1");
        ((Composite) composite1).adicionarFilho(folha1);
        ((Composite) composite1).adicionarFilho(folha2);

        Componente composite2 = new Composite("Composite 2");
        ((Composite) composite2).adicionarFilho(folha3);

        ((Composite) composite1).adicionarFilho(composite2);

        composite1.mostrarNome();
    }
}
