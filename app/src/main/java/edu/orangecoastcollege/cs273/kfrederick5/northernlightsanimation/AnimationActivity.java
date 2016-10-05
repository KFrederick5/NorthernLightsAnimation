package edu.orangecoastcollege.cs273.kfrederick5.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    private ImageView lightsImageView;

    private AnimationDrawable frameAnim;
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation pulseAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        lightsImageView = (ImageView) findViewById(R.id.lightsImageView);



    }

    public AnimationDrawable frameButton(View view)
    {
        lightsImageView.setBackgroundResource(R.drawable.frame_anim);
        frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        frameAnim.start();
    }

    public Animation rotateButton(View view)
    {
        rotateAnim = (Animation) lightsImageView.getBackground();

    }

    public Animation shakeButton(View view)
    {

    }

    public Animation pulseButton(View view)
    {

    }
}
