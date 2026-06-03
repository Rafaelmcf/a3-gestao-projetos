package model;

import java.util.ArrayList;

public class Equipe {

    private String id;
    private String nome;
    private ArrayList<Usuario> membros;

    public Equipe(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
    membros.add(usuario);
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuario> getMembros() {
        return membros;
    }

    @Override
    public String toString() {
        return nome + " (" + membros.size() + " membros)";
    }
}
