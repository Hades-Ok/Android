package com.labs.javlab2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_anima);

        if(false) {
            ObjectAnimator anx = ObjectAnimator.ofFloat(btn, "translationX", -555f);
            anx.setDuration(2200);

            ObjectAnimator any = ObjectAnimator.ofFloat(btn, "translationY", 400f);
            any.setDuration(1400);

            AnimatorSet set = new AnimatorSet();
            set.play(any).before(anx);

            ValueAnimator fadeAnim = ObjectAnimator.ofFloat(btn, "alpha", 1f, 0f);
            fadeAnim.setDuration(1000);

            AnimatorSet set2 = new AnimatorSet();
            set2.play(set).before(fadeAnim);
            set2.start();
        }
        else{
            btn.setAlpha(0);
            btn.animate().translationX(50f).alpha(.5f).y(100f).alpha(1)
                    .scaleX(.5f).scaleY(0.5f).rotationBy(45).setDuration(15000).start();
        }

        View txtv = findViewById(R.id.txt_anima);
        Keyframe kf0 = Keyframe.ofFloat(0f, 0f);
        Keyframe kf1 = Keyframe.ofFloat(0.5f, 360f);
        Keyframe kf2 = Keyframe.ofFloat(1f, 0f);
        PropertyValuesHolder pvhRotation = PropertyValuesHolder.ofKeyframe("rotation", kf0, kf1, kf2);
        ObjectAnimator rotationAnim = ObjectAnimator.ofPropertyValuesHolder(txtv, pvhRotation);
        rotationAnim.setDuration(5000);
        rotationAnim.start();
    }
}