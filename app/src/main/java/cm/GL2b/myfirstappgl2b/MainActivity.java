package cm.GL2b.myfirstappgl2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        private EditText edUsername;
        private EditText edPassword;
        private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recuperation des elements XML()
        edUsername=(EditText) findViewById(R.id.edtUsername);
        edPassword=(EditText) findViewById(R.id.edtPassword);
        btLogin=(Button) findViewById(R.id.btnLogin);



        // ajouter le listerner sur btlogin

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= edUsername.getText().toString();
                String password= edPassword.getText().toString();

                if(username.equals("abcd") && password.equals("EFGH")){
                    Toast.makeText(MainActivity.this, "connexion reussi", Toast.LENGTH_SHORT).show();
                    Log.i("connexion" ,"connexion reussi");
                    //construire une intentension explicite

                    Intent i = new Intent(MainActivity.this,Accueil.class);

                    //construction d'un bundle(permet de stocker les infos qui seront transmis a une autre activity)
                    Bundle b= new Bundle();
                    //ajoueter les donnees
                    b.putString("usr",username);
                    b.putString("pwd",password);

                    i.putExtras(b);

                    //demarrage de l'intenetion

                    startActivity(i);
            }
                else {
                    Toast.makeText(MainActivity.this, "connexion echouer", Toast.LENGTH_SHORT).show();
                    Log.e("connexion","connexion echouer");
                }
            }
        });



    }
}