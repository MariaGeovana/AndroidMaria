package com.example.alunos.myapplication.model;

/**
 * Created by alunos on 13/09/17.
 */

import android.os.Parcel;
import android.os.Parcelable;


public class Pessoa implements Parcelable {
    private String nome;
    private String telefone;
    private int idade;
    public Pessoa(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    protected Pessoa(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        idade = in.readInt();
    }
    public static final Creator<Pessoa> CREATOR = new Creator<Pessoa>() {
        @Override
        public Pessoa createFromParcel(Parcel in) {
            return new Pessoa(in);
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
    protected Pessoa(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        idade = in.readInt();
    }

}
