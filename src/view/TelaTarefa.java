package view;

import javax.swing.*;
import java.awt.*;

public class TelaTarefa extends JFrame {

    public TelaTarefa() {

        setTitle("Cadastro de Tarefas");
        setSize(400, 250);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNomeTarefa = new JLabel("Nome da Tarefa:");
        JTextField txtNomeTarefa = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        add(lblNomeTarefa);
        add(txtNomeTarefa);

        add(new JLabel(""));
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {

            String nomeTarefa = txtNomeTarefa.getText();

            JOptionPane.showMessageDialog(
                this,
                "Tarefa cadastrada:\n" + nomeTarefa
            );

            txtNomeTarefa.setText("");

        });

        setVisible(true);
    }
}