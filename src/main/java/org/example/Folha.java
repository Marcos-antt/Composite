package org.example;

public class Folha implements Componente {
    private String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarNome() {
        System.out.println("Folha: " + nome);
    }

    @Override
    public void mostarNome() {

    }

    @Override
    public void adicionarFilho(Componente composite2) {

    }
}
