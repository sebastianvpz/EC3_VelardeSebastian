package pe.edu.idat.ec3_velardesebastian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import pe.edu.idat.ec3_velardesebastian.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String user = String.valueOf(binding.txtUser.getText());
        String password = String.valueOf(binding.txtPassword.getText());

        if (isValidInput(user, password)) {
            if (user.equalsIgnoreCase("sebastian") && password.equals("SYS123")) {
                startActivity(new Intent(MainActivity.this, FormActivity.class));
            } else {
                showToast("Usuario o contraseña incorrectos");
            }
        } else {
            showToast("Por favor, complete ambos campos");
        }


    }

    private boolean isValidInput(String user, String password) {
        // Realiza validaciones básicas, verifica que los campos no estén vacíos
        return !user.trim().isEmpty() && !password.trim().isEmpty();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}