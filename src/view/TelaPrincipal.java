package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {

        setTitle("Sistema de Gestão de Projetos");

        setSize(500, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnUsuarios = new JButton("Usuários");

        JButton btnEquipes = new JButton("Equipes");

        JButton btnTarefas = new JButton("Tarefas");

        JButton btnProjetos = new JButton("Projetos");

        add(btnUsuarios);

        add(btnEquipes);

        add(btnTarefas);

                add(btnProjetos);

       btnUsuarios.addActionListener(e -> {
    new TelaUsuario();
});
        btnEquipes.addActionListener(e -> {
            new TelaEquipe();
});
btnTarefas.addActionListener(e -> {
    new TelaTarefa();
});

btnProjetos.addActionListener(e -> {
    System.out.println("BOTAO PROJETOS CLICADO");
    new TelaProjeto();
});

    }
}