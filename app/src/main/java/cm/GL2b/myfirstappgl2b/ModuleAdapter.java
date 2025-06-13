package cm.GL2b.myfirstappgl2b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cm.GL2b.myfirstappgl2b.modele.Module;

public class ModuleAdapter extends ArrayAdapter<Module> {
   Activity activity;
   int itemsResource;
   List<Module> items;

    public ModuleAdapter( Activity activity, int itemsResource, List<Module> items) {
        super(activity, itemsResource, items);
        this.activity = activity;
        this.itemsResource = itemsResource;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View layout = convertView;
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemsResource, parent, false);
        }
        TextView tvCredit= (TextView) layout.findViewById(R.id.txv5);
        TextView tvAcronyme= (TextView) layout.findViewById(R.id.txvDam);
        TextView App =(TextView) layout.findViewById(R.id.txvApp);
        tvCredit.setText(items.get(position).getCredit() +"");
        tvAcronyme.setText(items.get(position).getAccronym());
        App.setText(items.get(position).getDescription());
        return layout;

    }
}
