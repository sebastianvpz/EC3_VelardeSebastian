package pe.edu.idat.ec3_velardesebastian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import pe.edu.idat.ec3_velardesebastian.databinding.ActivityListadoBinding;

public class ListadoActivity extends AppCompatActivity {

    private ActivityListadoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView = binding.rvListado;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new OpinionAdapter(getData()));
    }
    private List<Opinion> getData() {
        List<Opinion> data = new ArrayList<>();
        int imagenResource = R.drawable.ic_launcher_foreground;

        // Datos de prueba
        data.add(new Opinion("Usuario1", "Muy caro",imagenResource));
        data.add(new Opinion("Usuario2", "Perfectamente en tiempo",imagenResource));
        data.add(new Opinion("Usuario3", "Muy caro",imagenResource));
        data.add(new Opinion("Usuario4", "Muy caro",imagenResource));
        data.add(new Opinion("Usuario5", "Perfectamente en tiempo",imagenResource));
        data.add(new Opinion("Usuario6", "Perfectamente en tiempo",imagenResource));
        data.add(new Opinion("Usuario7", "Muy caro",imagenResource));
        data.add(new Opinion("Usuario8", "Perfectamente en tiempo",imagenResource));
        data.add(new Opinion("Usuario9", "Muy caro",imagenResource));
        data.add(new Opinion("Usuario10", "Perfectamente en tiempo",imagenResource));

        return data;
    }
}