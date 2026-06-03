package model;

import java.util.ArrayList;

public class Projeto {

    private String id;
    private String nome;
    private Equipe equipe;
    private ArrayList<Tarefa> tarefas;

    public Projeto(String id, String nome, Equipe equipe) {
        this.id = id;
        this.nome = nome;
        this.equipe = equipe;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    @Override
    public String toString() {
        return nome + " | Equipe: "
                + (equipe != null ? equipe.getNome() : "Nenhuma");
    }
}