package cm.GL2b.myfirstappgl2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class ModuleActivity extends AppCompatActivity {
    private GridView gvModules;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        //recupreer la gridview du xml

        gvModules=(GridView) findViewById(R.id.grvModules);
//        collection des donnees
        String[] modules={"applications mobiles","genie logiciel","reseaux","base de donnees","intelligence artificielle"};
        //construction de l'adaptateur

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,modules);

        //brancher l'adaptateur

        gvModules.setAdapter(adapter);
        //LISTENNER DU CLIC SUR LA GRIDVIEW

        gvModules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ModuleActivity.this,modules[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}