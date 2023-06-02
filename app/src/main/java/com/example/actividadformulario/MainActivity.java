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

                if(name.length()==0){
                    Toast.makeText(MainActivity.this,"Debe ingresar un nombre",Toast.LENGTH_SHORT).show();
                } else if (apellido.length()==0) {
                    Toast.makeText(MainActivity.this,"Debe ingresar un apellido",Toast.LENGTH_SHORT).show();

                }else if (correo.length()==0) {
                    Toast.makeText(MainActivity.this,"Debe ingresar un correo",Toast.LENGTH_SHORT).show();

                }else if (contrasela1.length()==0) {
                    Toast.makeText(MainActivity.this,"Debe ingresar una contraseña",Toast.LENGTH_SHORT).show();

                }else if (contrasela2.length()==0) {
                    Toast.makeText(MainActivity.this,"Debe repetir contraseña",Toast.LENGTH_SHORT).show();

                }else if (contrasela2!=contrasela1) {
                    Toast.makeText(MainActivity.this,"Debe ingresar una contraseña correcta",Toast.LENGTH_SHORT).show();

                }else{
                    passSecond(name,apellido,correo);
                }
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