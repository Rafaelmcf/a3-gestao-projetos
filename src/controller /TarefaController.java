package controller;

import model.Tarefa;
import java.util.ArrayList;

public class TarefaController {

    private ArrayList<Tarefa> tarefas;

    public TarefaController() {
        tarefas = new ArrayList<>();
    }

    public void cadastrarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public ArrayList<Tarefa> listarTarefas() {
        return tarefas;
    }
}