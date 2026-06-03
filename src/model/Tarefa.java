package model;

public class Tarefa {

    private String id;
    private String titulo;
    private String status;
    private Usuario responsavel;

    public Tarefa(String id, String titulo, Usuario responsavel) {
        this.id = id;
        this.titulo = titulo;
        this.status = "Pendente";
        this.responsavel = responsavel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return titulo + " [" + status + "] Resp: "
                + (responsavel != null ? responsavel.getNome() : "Nenhum");
    }
}
