package controller;

import model.Equipe;
import java.util.ArrayList;

public class EquipeController {

    private ArrayList<Equipe> equipes;

    public EquipeController() {
        equipes = new ArrayList<>();
    }

    public void cadastrarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public ArrayList<Equipe> listarEquipes() {
        return equipes;
    }
}