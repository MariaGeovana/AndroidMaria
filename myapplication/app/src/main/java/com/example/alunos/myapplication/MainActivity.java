package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.alunos.myapplication.model.Pessoa;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void showList(View v) {
        Intent it = new Intent(this, mostraListaDinamica.class);
        startActivity(it);
    }
    public void salvarLista(View v){
        EditText nome1 = (EditText)findViewById(R.id.editNome);
        String nome = nome1.getText().toString();

        EditText tel1 = (EditText)findViewById(R.id.editTel);
        String tel = tel1.getText().toString();

        EditText idade1 = (EditText)findViewById(R.id.editIdade);
        String idade  = idade1.getText().toString();

        if(nome.compareTo("")!=0){
            if(tel.compareTo("")!=0){
                if(idade.compareTo("")!=0){
                    int idade = Integer.parseInt(idade.getText().toString());
                    lista.add(new Pessoa(nome, tel, idade));

                    nome.setText("");
                    tel.setText("");
                    idade.setText("");
            }
        }
    }
}
