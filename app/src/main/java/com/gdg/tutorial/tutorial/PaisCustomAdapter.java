package com.gdg.tutorial.tutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by oscargallon on 18/07/15.
 */
public class PaisCustomAdapter extends BaseAdapter {

    private List<Pais> listaPaises;
    private Context context;

    public PaisCustomAdapter(List<Pais> listaPaises, Context context) {
        this.listaPaises = listaPaises;
        this.context = context;
    }

    /**
     * Devuelve el numero de objetos
     * que tiene el adaptador
     *
     * @return
     */
    @Override
    public int getCount() {
        return this.listaPaises.size();
    }

    /**
     * Devuelve un objeto en una posicion
     * especifica
     *
     * @param i
     * @return
     */
    @Override
    public Pais getItem(int i) {
        return this.listaPaises.get(i);
    }

    /**
     * Devuelve la posicion de un objeto
     *
     * @param i
     * @return
     */
    @Override
    public long getItemId(int i) {
        return this.listaPaises.indexOf(getItem(i));
    }

    /**
     * Menejador de la vista
     *
     * @param i
     * @param convertView
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(context.LAYOUT_INFLATER_SERVICE);

        ViewHolder holder;

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.custom_list_view_adapter, null);

            holder = new ViewHolder();

            holder.ivFlag = (ImageView) convertView.findViewById(R.id.iv_flag);

            holder.txtName = (TextView) convertView.findViewById(R.id.txt_name);

            holder.txtDescription = (TextView) convertView.findViewById(R.id.txt_description);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();


        }

        Pais pais = getItem(i);

        holder.ivFlag.setImageBitmap(pais.getFlag());
        holder.txtName.setText(pais.getName());
        holder.txtDescription.setText(pais.getDescription());


        return convertView;

    }

    public class ViewHolder {
        private ImageView ivFlag;
        private TextView txtName;
        private TextView txtDescription;
    }
}
