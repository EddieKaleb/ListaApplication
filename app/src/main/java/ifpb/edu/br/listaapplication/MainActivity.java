package ifpb.edu.br.listaapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    List<String> nomes;
    ListView nomesList;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nome = (EditText) findViewById(R.id.nomeEditText);
        nomesList = (ListView) findViewById(R.id.nomesListView);

        nome.addTextChangedListener(new TextWatcherNomes(this));

        nomes = new ArrayList<String>();
        nomes.add("eddie");
        nomes.add("ederson");
        nomes.add("vini");
        nomes.add("victor");
        nomes.add("igor");
        nomes.add("iagox");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);

        nomesList.setAdapter(adapter);
    }

}
