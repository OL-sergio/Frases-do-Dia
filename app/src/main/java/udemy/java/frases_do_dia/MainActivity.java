package udemy.java.frases_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Frase1",
                "Frase2",
                "Frase3",
                "Frase4"

        };
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textView_Resultado);
        texto.setText(frases[numero]);
    }
}