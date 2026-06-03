package controller;

import model.Usuario;
import java.util.ArrayList;

public class UsuarioController {

    private ArrayList<Usuario> usuarios;

    public UsuarioController() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }
}