package com.example.alunos.myapplication.model;

/**
 * Created by alunos on 13/09/17.
 */

public class Pessoa {
    private String nome;
    private String telefone;
    private int idade;

    public Pessoa(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public void setNome​(String nome) {
        this.nome = nome;
    }


    public void setTelefone​(String telefone) {
        this.telefone = telefone;
    }


    public void setIdade​(int idade) {
        this.idade = idade;
    }


    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }
}
