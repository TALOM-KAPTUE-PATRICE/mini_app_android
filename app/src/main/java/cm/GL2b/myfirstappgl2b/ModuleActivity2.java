package cm.GL2b.myfirstappgl2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import cm.GL2b.myfirstappgl2b.modele.Module;

public class ModuleActivity2 extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        gridView = findViewById(R.id.grdMod);
        ArrayList<Module> array= new ArrayList<>();
        Module m1= new Module(1,"DAM","Applications mobiles","je suis talom",5);
        array.add(m1);
        Module m2= new Module(2,"IS","Intelligence artificielle","je suis talom",20);
        array.add(m2);
        Module m3= new Module(3,"COMP","Compilation","je suis math.h",12);
        array.add(m3);
        Module m4= new Module(4,"PARA","Paradigme de la programmation","le senior",17);
        array.add(m4);
        Module m5= new Module(5,"RO","Recherche operationnelle","affectation des taches",14);
        array.add(m5);

        ModuleAdapter adapter = new ModuleAdapter(this,
                R.layout.item_module,
                array);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ModuleDialog dialog= new ModuleDialog(ModuleActivity2.this,array.get(position));
                dialog.show();
            }
        });

    }
}