package view;

import javax.swing.*;
import java.awt.*;

public class TelaEquipe extends JFrame {

    public TelaEquipe() {

        setTitle("Cadastro de Equipes");
        setSize(500, 350);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblNomeEquipe = new JLabel("Nome da Equipe:");
        JTextField txtNomeEquipe = new JTextField();

        JLabel lblDescricao = new JLabel("Descrição:");
        JTextField txtDescricao = new JTextField();

        JLabel lblMembros = new JLabel("Membros:");
        JTextField txtMembros = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        add(lblNomeEquipe);
        add(txtNomeEquipe);

        add(lblDescricao);
        add(txtDescricao);

        add(lblMembros);
        add(txtMembros);

        add(new JLabel(""));
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {

            String nomeEquipe = txtNomeEquipe.getText();
            String descricao = txtDescricao.getText();
            String membros = txtMembros.getText();

            JOptionPane.showMessageDialog(
                this,
                "Equipe: " + nomeEquipe +
                "\nDescrição: " + descricao +
                "\nMembros: " + membros
            );

            txtNomeEquipe.setText("");
            txtDescricao.setText("");
            txtMembros.setText("");
        });

        setVisible(true);
    }
}