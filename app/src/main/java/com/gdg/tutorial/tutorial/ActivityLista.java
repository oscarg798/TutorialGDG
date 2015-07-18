package com.gdg.tutorial.tutorial;

import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ActivityLista extends ActionBarActivity {

    private ListView lvLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_lista);
        lvLista = (ListView) findViewById(R.id.lv_lista);


        List<Pais> listaPaises = new ArrayList<>();

        Pais pais = new Pais();
        pais.setName(getString(R.string.colombia_label));
        pais.setDescription("Gente Bonita");
        pais.setFlag(BitmapFactory.decodeResource(getResources(), R.drawable.colombia));
        listaPaises.add(pais);

        pais = new Pais();
        pais.setName(getString(R.string.argentina_label));
        pais.setDescription("Gente Amable");
        pais.setFlag(BitmapFactory.decodeResource(getResources(), R.drawable.argentina));
        listaPaises.add(pais);

        pais = new Pais();
        pais.setName(getString(R.string.brasil_label));
        pais.setDescription("Buen Futbol");
        pais.setFlag(BitmapFactory.decodeResource(getResources(), R.drawable.brasil));
        listaPaises.add(pais);


        PaisCustomAdapter paisCustomAdapter = new PaisCustomAdapter(listaPaises,
                getApplicationContext());

        lvLista.setAdapter(paisCustomAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_lista, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
