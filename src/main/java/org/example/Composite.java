package org.example;
import java.util.List;
import java.util.ArrayList;

public class Composite implements Componente{
    private String nome;
    private List<Componente> filhos = new ArrayList<>();

    public Composite(String nome) {
        this.nome = nome;
    }

    public void adicionarFilho(Componente componente) {
        filhos.add(componente);
    }

    public void removerFilho(Componente componente) {
        filhos.remove(componente);
    }

    @Override
    public void mostrarNome() {
        System.out.println("Composite: " + nome);
        for (Componente componente : filhos) {
            componente.mostrarNome();
        }
    }

    @Override
    public void mostarNome() {

    }
}
