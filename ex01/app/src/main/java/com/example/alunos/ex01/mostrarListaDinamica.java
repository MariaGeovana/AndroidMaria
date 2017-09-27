package com.example.alunos.ex01;

import android.app.ListActivity;
import android.os.Bundle;

import com.example.alunos.ex01.adapter.PessoaAdapter;
import com.example.alunos.ex01.model.Pessoa;

import java.util.ArrayList;

public class mostrarListaDinamica extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mostrar_lista_dinamica);
        //ListView listview = (ListView) findViewById(R.id.listview);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(new Pessoa("Pedro","3690-1234",12));
        lista.add(new Pessoa("Joao","3690-4321",18));
        setListAdapter(new PessoaAdapter(this, lista));
    }
}