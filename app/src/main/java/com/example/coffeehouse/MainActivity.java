package com.example.coffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView display_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display_img = findViewById(R.id.display_img);
    }
    public void displayImage(View view){
        switch (view.getId()){
            case R.id.image1:
                display_img.setImageResource(R.drawable.coffee1);
                break;
            case R.id.image2:
                display_img.setImageResource(R.drawable.coffee2);
                break;
            case R.id.image3:
                display_img.setImageResource(R.drawable.coffee3);
                break;
            case R.id.image4:
                display_img.setImageResource(R.drawable.coffee4);
                break;
            default: break;
        }
    }

}
