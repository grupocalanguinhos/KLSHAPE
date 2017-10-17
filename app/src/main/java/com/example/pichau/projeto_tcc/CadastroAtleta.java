package com.example.pichau.projeto_tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CadastroAtleta extends AppCompatActivity {

    EditText et_nome,et_idade, et_rg, et_cpf, et_endereco, et_email, et_senha;


    ImageButton btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_atleta);
        et_nome = (EditText) findViewById(R.id.et_nome);
        et_idade = (EditText) findViewById(R.id.et_idade);
        et_rg = (EditText) findViewById(R.id.et_rg);
        et_cpf = (EditText) findViewById(R.id.et_cpf);
        et_endereco = (EditText) findViewById(R.id.et_endereco);
        et_email = (EditText) findViewById(R.id.et_email);
        et_senha = (EditText) findViewById(R.id.et_senha);
        btn4 = (ImageButton) findViewById(R.id.btn4);

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                CRUD crud = new CRUD(getBaseContext());
                String nome = et_nome.getText().toString();
                String idade= et_idade.getText().toString();
                String rg= et_rg.getText().toString();
                String cpf= et_cpf.getText().toString();
                String endereco= et_endereco.getText().toString();
                String email= et_email.getText().toString();
                String senha= et_senha.getText().toString();
                String resultado=crud.inserir(nome, idade, rg, cpf, endereco, email, senha);
                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });






    }
}