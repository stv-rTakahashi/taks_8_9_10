package com.example.task8910;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        final Random r = new Random();

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Image;
                Image = r.nextInt(5);

                int imageId;
                switch (Image){
                    case 0:
                        imageId = R.drawable.deusexmachina;
                        break;
                    case 1:
                        imageId = R.drawable.dizzy;
                        break;
                    case 2:
                        imageId = R.drawable.rwrite;
                        break;
                    case 3:
                        imageId = R.drawable.vermilion;
                        break;
                    default:
                        imageId = R.drawable.awakening;
                        break;
                }

                imageView.setImageResource(imageId);

            }
        });


    }
}
