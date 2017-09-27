package com.example.alunos.ex01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alunos.ex01.R;
import com.example.alunos.ex01.model.Pessoa;

import java.util.List;

/**
 * Created by alunos on 13/09/17.
 */

public class PessoaAdapter extends BaseAdapter{
    private Context context;
    private List<Pessoa> lista;


    public PessoaAdapter(Context context, List<Pessoa> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int posicao) {
        Pessoa obj = lista.get(posicao);
        return obj;
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        Pessoa obj = lista.get(posicao);
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.row_layout, null);
        TextView textNome = (TextView)
                v.findViewById(R.id.textNome);
        textNome.setText(obj.getNome​());
        TextView textTelefone = (TextView)
                v.findViewById(R.id.textTelefone);
        textTelefone.setText(obj.getTelefone​());
        TextView textIdade = (TextView)
                v.findViewById(R.id.textIdade);
        textIdade.setText(String.valueOf(obj.getIdade​()));
        return v;
    }
}