package view;

import javax.swing.*;
import java.awt.*;

public class TelaUsuario extends JFrame {

    public TelaUsuario() {

        setTitle("Cadastro de Usuários");
        setSize(500, 400);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(8, 2, 10, 10));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblCpf = new JLabel("CPF:");
        JTextField txtCpf = new JTextField();

        JLabel lblEmail = new JLabel("E-mail:");
        JTextField txtEmail = new JTextField();

        JLabel lblCargo = new JLabel("Cargo:");
        JTextField txtCargo = new JTextField();

        JLabel lblLogin = new JLabel("Login:");
        JTextField txtLogin = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        JTextField txtSenha = new JTextField();

        JLabel lblPerfil = new JLabel("Perfil:");
        JTextField txtPerfil = new JTextField();

        JButton btnSalvar = new JButton("Salvar");

        add(lblNome);
        add(txtNome);

        add(lblCpf);
        add(txtCpf);

        add(lblEmail);
        add(txtEmail);

        add(lblCargo);
        add(txtCargo);

        add(lblLogin);
        add(txtLogin);

        add(lblSenha);
        add(txtSenha);

        add(lblPerfil);
        add(txtPerfil);

        add(new JLabel(""));
        add(btnSalvar);

        btnSalvar.addActionListener(e -> {

            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String email = txtEmail.getText();
            String cargo = txtCargo.getText();
            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            String perfil = txtPerfil.getText();

            JOptionPane.showMessageDialog(
                this,
                "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nE-mail: " + email +
                "\nCargo: " + cargo +
                "\nLogin: " + login +
                "\nSenha: " + senha +
                "\nPerfil: " + perfil +
                "\n\nUsuário salvo com sucesso!"
            );

            txtNome.setText("");
            txtCpf.setText("");
            txtEmail.setText("");
            txtCargo.setText("");
            txtLogin.setText("");
            txtSenha.setText("");
            txtPerfil.setText("");
        });

        setVisible(true);
    }
}
