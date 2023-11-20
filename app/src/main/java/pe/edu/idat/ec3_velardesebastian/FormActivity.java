package pe.edu.idat.ec3_velardesebastian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import pe.edu.idat.ec3_velardesebastian.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(this);
        binding.btnResenas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button) {

            String distValue = binding.editTextText.getText().toString();
            String fechInValue = binding.editTextText2.getText().toString();
            String fechFinValue = binding.editTextText3.getText().toString();

            if (validateCampoDist(distValue) && validateCampoFechaIn(fechInValue) && validateCampoFechaFin(fechFinValue)) {

                Intent intent = new Intent(FormActivity.this, ListFormActivity.class);
                intent.putExtra("distrito", distValue);
                intent.putExtra("fecha_inicial", fechInValue);
                intent.putExtra("fecha_final", fechFinValue);

                startActivity(intent);
            }
        } else if (v.getId() == R.id.btnResenas) {
            startActivity(new Intent(FormActivity.this,ListadoActivity.class));

        }

    }

    private boolean validateCampoDist(String dist) {
        if (dist.trim().isEmpty()) {
            showToast("Por favor, ingrese un valor para Distrito.");
            return false;
        }
        return true;
    }

    private boolean validateCampoFechaIn(String fechaIn) {
        if (fechaIn.trim().isEmpty()) {
            showToast("Por favor, ingrese un valor para Fecha Inicial.");
            return false;
        }
        return true;
    }

    private boolean validateCampoFechaFin(String fechaFin) {
        if (fechaFin.trim().isEmpty()) {
            showToast("Por favor, ingrese un valor para Fecha Final.");
            return false;
        }
        return true;
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}