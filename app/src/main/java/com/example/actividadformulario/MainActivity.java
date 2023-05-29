package com.example.actividadformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.actividadformulario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding mBinding;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            mBinding=ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(mBinding.getRoot());

            //Enviar datos
        Intent passSecond = getIntent();
        mBinding.name.setText();
        mBinding.editApellido.setText();
        mBinding.editCorreo.setText();
        mBinding.textContraseA1.setText();
        mBinding.textContraseA2.setText();

        mBinding.Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mBinding.name.getText().toString();
                String apellido=mBinding.editApellido.getText().toString();
                String correo=mBinding.editCorreo.getText().toString();
                String contrasela1=mBinding.textContraseA1.getText().toString();
                String contrasela2=mBinding.textContraseA2.getText().toString();
                Log.d("prueba",""+name+apellido);
                Toast.makeText(MainActivity.this,"Hola"+name+" "+correo,Toast.LENGTH_SHORT).show();
                passSecond(name,apellido,correo);
            }
        });

    }
    private void passSecond(String name,String apellido, String correo){
            Intent passSecond= new Intent(MainActivity.this,MainActivity2.class);

    }
}