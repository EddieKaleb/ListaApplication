package ifpb.edu.br.listaapplication;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by eddie on 20/09/16.
 */
public class TextWatcherNomes implements TextWatcher{

    MainActivity main;

    public TextWatcherNomes(MainActivity main){
        this.main = main;
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        main.adapter.getFilter().filter(s);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
