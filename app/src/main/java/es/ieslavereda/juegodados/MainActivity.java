package es.ieslavereda.juegodados;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button lanzarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView = findViewById(R.id.imageView);
        lanzarButton = findViewById(R.id.lanzarButton);
//        imageView.setImageResource(R.mipmap.ic_cuatro_foreground);
        Random numeroRandom = new Random();

        lanzarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = numeroRandom.nextInt(6);
                imageView.setImageResource(Dado.values()[numero].getImagen());
            }
        });


    }
}