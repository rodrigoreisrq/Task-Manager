package com.reis.Manager;

public class Tasks {
    //Atributos
    private static int contadorId = 1;
    private int id;
    private String nome;
    private String descricao;
    private String data;
    private Status status;

    public Tasks(String nome, String descricao, String data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.status = Status.NAO_INICIADO;
        this.id = contadorId++;

    }

    @Override
    public String toString() {
        return "ID: " + id + "| nome: " + nome + " | status: " + status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }
    public int getId(){
        return id;
    }
    public static void setContadorId(int contadorId){
        Tasks.contadorId = contadorId;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }
}




