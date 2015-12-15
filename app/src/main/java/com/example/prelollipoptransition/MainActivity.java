package com.example.prelollipoptransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView mImg;
    private View mViewBottom;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImg= (ImageView) findViewById(R.id.image);
        mViewBottom =findViewById(R.id.image_bottom);
        findViewById(R.id.imageView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final Intent intent = new Intent(MainActivity.this, SubActivity.class);
//                ActivityTransitionLauncher
//                        .with(MainActivity.this)
//                        .from(v)
//                        .launch(intent);
                Intent intentDog= new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intentDog, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,Pair.create(v,"dog"), Pair.create(mViewBottom,"cat")).toBundle());
            }
        });
    }
}