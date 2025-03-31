package es.ieslavereda.juegodados;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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
    private Button lanzarButton, lanzarTodosButton;
    private ImageButton imageButton1, imageButton2, imageButton3;

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
        lanzarTodosButton = findViewById(R.id.todosDadosButton);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);



        lanzarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(Dado.values()[numeroAzar()].getImagen());
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageButton1.setImageResource(Dado.values()[numeroAzar()].getImagen());
            }
        });

        imageButton2.setOnClickListener(view -> {
            imageButton2.setImageResource(Dado.values()[numeroAzar()].getImagen());
        });

        imageButton3.setOnClickListener(view -> {
            imageButton3.setImageResource(Dado.values()[numeroAzar()].getImagen());
        });

        lanzarTodosButton.setOnClickListener(view -> {
            imageButton1.callOnClick();
            imageButton2.setImageResource(Dado.values()[numeroAzar()].getImagen());
            imageButton3.callOnClick();
        });

    }

    private int numeroAzar(){
        Random numeroRandom = new Random();
        return numeroRandom.nextInt(6);
    }

}