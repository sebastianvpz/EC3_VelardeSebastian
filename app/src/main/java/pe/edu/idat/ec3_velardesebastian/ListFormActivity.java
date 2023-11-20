package pe.edu.idat.ec3_velardesebastian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListFormActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_form);


        listView = findViewById(R.id.lvForm);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String distrito = extras.getString("distrito");
            String fechaInicial = extras.getString("fecha_inicial");
            String fechaFinal = extras.getString("fecha_final");

            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Distrito: " + distrito);
            dataList.add("Fecha Inicial: " + fechaInicial);
            dataList.add("Fecha Final: " + fechaFinal);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
            listView.setAdapter(adapter);
        }
    }
}