package cm.GL2b.myfirstappgl2b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import cm.GL2b.myfirstappgl2b.modele.Module;

public class ModuleDialog extends Dialog {
    private Module module;
    public ModuleDialog(Context context, Module module){
        super(context);
        this.module=module;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_dialog);

        TextView tvnom = (TextView) findViewById(R.id.txvnom);
        TextView tvCredit=(TextView) findViewById(R.id.txvCredit);
        TextView tvDescription = (TextView) findViewById(R.id.txvDescription);

        tvnom.setText(this.module.getName());
        tvCredit.setText(this.module.getCredit()+"");
        tvDescription.setText(this.module.getDescription());
    }
}
