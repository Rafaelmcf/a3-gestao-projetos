package view;

import javax.swing.*;
import java.awt.*;

public class TelaProjeto extends JFrame {

    public TelaProjeto() {

        setTitle("Cadastro de Projetos");
        setSize(600, 450);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(7, 2, 10, 10));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblDescricao = new JLabel("Descrição:");
        JTextField txtDescricao = new JTextField();

        JLabel lblDataInicio = new JLabel("Data Início:");
        JTextField txtDataInicio = new JTextField();

        JLabel lblDataFim = new JLabel("Data Fim:");
        JTextField txtDataFim = new JTextField();

        JLabel lblStatus = new JLabel("Status:");
        JTextField txtStatus = new JTextField();

        JLabel lblGerente = new JLabel("Gerente Responsável:");
        JTextField txtGerente = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        add(lblNome);
        add(txtNome);

        add(lblDescricao);
        add(txtDescricao);

        add(lblDataInicio);
        add(txtDataInicio);

        add(lblDataFim);
        add(txtDataFim);

        add(lblStatus);
        add(txtStatus);

        add(lblGerente);
        add(txtGerente);

        add(new JLabel(""));
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {

            String nome = txtNome.getText();
            String descricao = txtDescricao.getText();
            String dataInicio = txtDataInicio.getText();
            String dataFim = txtDataFim.getText();
            String status = txtStatus.getText();
            String gerente = txtGerente.getText();

            JOptionPane.showMessageDialog(
                this,
                "Projeto cadastrado:\n\n" +
                "Nome: " + nome +
                "\nDescrição: " + descricao +
                "\nData Início: " + dataInicio +
                "\nData Fim: " + dataFim +
                "\nStatus: " + status +
                "\nGerente: " + gerente
            );

            txtNome.setText("");
            txtDescricao.setText("");
            txtDataInicio.setText("");
            txtDataFim.setText("");
            txtStatus.setText("");
            txtGerente.setText("");
        });

        setVisible(true);
    }
}
