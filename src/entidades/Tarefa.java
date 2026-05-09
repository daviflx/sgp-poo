package entidades;

import java.time.LocalDate;

import enums.PrioridadeTarefa;
import enums.StatusTarefa;

public class Tarefa {
    private long id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private PrioridadeTarefa prioridade;
    private StatusTarefa status;
    private Usuario usuario;
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public Tarefa(Usuario usuario, Projeto projeto) {
        this.usuario = usuario;
        this.projeto = projeto;
    }
    private Projeto projeto;
    public Tarefa() {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.prioridade = prioridade;
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public LocalDate getDataConclusao() {
        return dataConclusao;
    }
    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
    public PrioridadeTarefa getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(PrioridadeTarefa prioridade) {
        this.prioridade = prioridade;
    }
    public StatusTarefa getStatus() {
        return status;
    }
    public void setStatus(StatusTarefa status) {
        this.status = status;
    }
}
