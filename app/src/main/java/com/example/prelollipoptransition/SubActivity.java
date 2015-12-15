package com.example.prelollipoptransition;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.kogitune.activity_transition.ActivityTransition;
import com.kogitune.activity_transition.ExitActivityTransition;


public class SubActivity extends Activity {
    private ImageView mImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
//        getWindow().setSharedElementReturnTransition(new Explode());
        setContentView(R.layout.activity_sub);
        mImg= (ImageView) findViewById(R.id.sub_imageView);

        mImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mImg.setTransitionName("cat");
                mImg.setImageResource(R.mipmap.cat);
//                finishAfterTransition();
            }
        });
    }

}
