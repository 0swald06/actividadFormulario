package com.example.actividadformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.actividadformulario.databinding.ActivityMain2Binding;
import com.example.actividadformulario.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        Intent intent = getIntent();
        Log.d("Prueba 3 ", intent.getStringExtra("Name") );
        if (intent!=null){

            mBinding.valor2.setText(intent.getStringExtra("Name"));
            mBinding.valor4.setText(intent.getStringExtra("Correo"));

        }
    }
}