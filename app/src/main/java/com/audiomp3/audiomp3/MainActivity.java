package com.audiomp3.audiomp3;

import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtUsuario)
    EditText txtUsuario;
    @BindView(R.id.txtPassword)
    EditText txtPassword;
    @BindView(R.id.btnIniciar)
    Button btnIniciar;
    @BindView(R.id.progresBar)
    ContentLoadingProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }

    @OnClick(R.id.btnIniciar)
    public void inicar(){
        txtUsuario.setText("Boton");
        progressBar.setVisibility(View.VISIBLE);
    }
}