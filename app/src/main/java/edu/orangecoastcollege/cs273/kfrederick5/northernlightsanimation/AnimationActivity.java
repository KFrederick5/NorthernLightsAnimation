package edu.orangecoastcollege.cs273.kfrederick5.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AnimationActivity extends AppCompatActivity {

    private ImageView lightsImageView;
    private LinearLayout activity_animation;

    private AnimationDrawable frameAnim;
    private Animation rotateAnim;
    private Animation shakeAnim;
    private Animation pulseAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        lightsImageView = (ImageView) findViewById(R.id.lightsImageView);
        activity_animation = (LinearLayout) findViewById(R.id.activity_animation);



    }

    public void frameButton(View view)
    {
        lightsImageView.setBackgroundResource(R.drawable.frame_anim);
        frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        if(frameAnim.isRunning())
            frameAnim.stop();
        else
            frameAnim.start();
    }

    public void rotateButton(View view)
    {
        rotateAnim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        if(rotateAnim.hasStarted() && rotateAnim != null) {
            lightsImageView.clearAnimation();
            activity_animation.clearAnimation();
            rotateAnim = null;
        }
        else {
            lightsImageView.startAnimation(rotateAnim);
            activity_animation.startAnimation(rotateAnim);
        }

    }

    public void shakeButton(View view)
    {
        shakeAnim = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
        if(shakeAnim.hasStarted() && rotateAnim != null) {
            lightsImageView.clearAnimation();
            shakeAnim = null;
        }
        else
            lightsImageView.startAnimation(shakeAnim);
    }

    public void pulseButton(View view)
    {
        pulseAnim = AnimationUtils.loadAnimation(this, R.anim.pulse_anim);
        if(pulseAnim.hasStarted() && pulseAnim != null){
            lightsImageView.clearAnimation();
            pulseAnim = null;
        }
        else {
            lightsImageView.startAnimation(pulseAnim);
        }
    }
}
