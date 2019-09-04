package Sanchez.Jimenez.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextPass, editTextNombre;
    button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        // match con los widget
        editTextNombre = findViewById(R.id.etNombre);
        editTextPass = findViewById(R.id.editTextPass);
        botonIngreso = findViewById(R.id.botonIngreso);

        ((View) botonIngreso).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = editTextNombre.getText().toString();
                String passwrd = editTextPass.getText().toString();
                if (nombreUsuario.isEmpty()|| passwrd.isEmpty()) {
                    // nombre de usuario vacío
                    mensajito("El usuario o contraseña están vacíos");
                } else {
                    if (nombreUsuario.equals("Ricky") && passwrd.equals("1234")){
                        mensajito("BIENVENIDO!!");
                    }else {
                        mensajito("Los datos son erróneos");
                    }
                }
            }
        });
    }
    public void mensajito(String mensaje){
        Toast.makeText( this,mensaje,Toast.LENGTH_LONG).show();
    }
}
