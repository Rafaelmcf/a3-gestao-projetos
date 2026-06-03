package controller;

import model.Projeto;
import java.util.ArrayList;

public class ProjetoController {

    private ArrayList<Projeto> projetos;

    public ProjetoController() {
        projetos = new ArrayList<>();
    }

    public void cadastrarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public ArrayList<Projeto> listarProjetos() {
        return projetos;
    }
}
