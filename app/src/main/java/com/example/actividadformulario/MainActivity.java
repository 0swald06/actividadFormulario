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
        //Busco elementos
        mBinding.EditName.getText().toString();
        mBinding.EditApellido.getText().toString();
        mBinding.EditCorreo.getText().toString();
        mBinding.EditContraseA.getText().toString();
        mBinding.EditReContraseA.getText().toString();

        mBinding.Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mBinding.EditName.getText().toString();
                String apellido=mBinding.EditApellido.getText().toString();
                String correo=mBinding.EditCorreo.getText().toString();
                String contrasela1=mBinding.EditContraseA.getText().toString();
                String contrasela2=mBinding.EditReContraseA.getText().toString();
                Log.d("prueba"," "+name+apellido);
                Toast.makeText(MainActivity.this,"Hola "+name+" "+correo,Toast.LENGTH_SHORT).show();
                passSecond(name,apellido,correo);
            }
        });

    }
    private void passSecond(String name,String apellido, String correo){
            Intent passSecond= new Intent(MainActivity.this,MainActivity2.class);
            Log.d("Prueba 2 ", " "+ name+" " +apellido);
            passSecond.putExtra("Name", name);
             passSecond.putExtra("Apellido", apellido);
             passSecond.putExtra("Correo", correo);

             startActivity(passSecond);
    }
}