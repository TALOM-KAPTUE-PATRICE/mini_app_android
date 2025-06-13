package cm.GL2b.myfirstappgl2b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Accueil extends AppCompatActivity {

    private TextView tvAccueil;
    private Spinner spChoix;
    private Button btnMod;
    private Button btnMod1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        //recuperer l'intention et du bundle

         Intent i = getIntent();
          Bundle b = i.getExtras();
          // recuperation des donnees  a partir du bundle
        assert b != null;
          String username=b.getString("usr");
          String password=b.getString("pwd");
          //recuperation de l'element par son id

          tvAccueil=(TextView) findViewById(R.id.txvAccueil);
          tvAccueil.setText("bienvenue " + username + ",votre mot de passe est :"+password);

          //recuperer le spinner du xml
         spChoix=(Spinner) findViewById(R.id.spnPlanete);

         String[] planetes ={"mercure","venus","terre","mars","jupiter","neptune","saturne"};
        //construire l'adaptateur

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planetes);

        //brancher bl'adaptateur
        spChoix.setAdapter(adapter);

        btnMod=(Button) findViewById(R.id.btnModules);

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //contruire l'intention

                Intent intent = new Intent(Accueil.this,ModuleActivity.class);
                //demarrage de l'activite

                startActivity(intent);
            }

        });
        btnMod1=(Button) findViewById(R.id.btnModule2);

        btnMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //contruire l'intention

                Intent intent = new Intent(Accueil.this,ModuleActivity2.class);
                //demarrage de l'activite

                startActivity(intent);
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_module,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int n = item.getItemId();

        if(n==R.id.createModule){
            Intent i = new Intent(Accueil.this,AjoutModule.class);
            startActivity(i);


        }
        return super.onOptionsItemSelected(item);
    }
}