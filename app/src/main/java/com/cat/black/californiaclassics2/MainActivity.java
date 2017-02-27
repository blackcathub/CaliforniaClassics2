package com.cat.black.californiaclassics2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout fs_layer = (RelativeLayout) findViewById(R.id.fullscr_layer);
        final ImageView fs_img = (ImageView) findViewById(R.id.fullscr_img);

        final View mini1 = findViewById(R.id.mini_b1);
        mini1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                fs_img.setImageResource(R.drawable.full_img1);
                fs_layer.setVisibility(View.VISIBLE);
            }
        });

        final View mini2 = findViewById(R.id.mini_b2);
        mini2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                fs_img.setImageResource(R.drawable.full_img2);
                fs_layer.setVisibility(View.VISIBLE);
            }
        });

        final View mini3 = findViewById(R.id.mini_b3);
        mini3.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                fs_img.setImageResource(R.drawable.full_img3);
                fs_layer.setVisibility(View.VISIBLE);
            }
        });

        final View mini4 = findViewById(R.id.mini_b4);
        mini4.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                fs_img.setImageResource(R.drawable.full_img4);
                fs_layer.setVisibility(View.VISIBLE);
            }
        });

        final View mini5 = findViewById(R.id.mini_b5);
        mini5.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                fs_img.setImageResource(R.drawable.full_img5);
                fs_layer.setVisibility(View.VISIBLE);
            }
        });
    }

    public void openFacebook(View v){
        ImageButton fbbut = (ImageButton)findViewById(R.id.fb_button);
        final Animation fadeAlpha = AnimationUtils.loadAnimation(this, R.anim.fade);
        fbbut.startAnimation(fadeAlpha);
        fadeAlpha.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                Uri fbUrl = Uri.parse("http://www.facebook.com/ClassicCarRestorationClub");
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("fb://facewebmodal/f?href="+fbUrl)));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, fbUrl));
                }
            }
        });
    }

    public void openYoutube(View v){
        ImageButton ytbut = (ImageButton)findViewById(R.id.yt_button);
        final Animation fadeAlpha = AnimationUtils.loadAnimation(this, R.anim.fade);
        ytbut.startAnimation(fadeAlpha);
        fadeAlpha.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                Uri ytUrl = Uri.parse("https://www.youtube.com/watch?v=n0zxzWbOdaA");
                String id = "n0zxzWbOdaA";
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("vnd.youtube:"+id)));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, ytUrl));
                }
            }
        });
    }

    public void openGplus(View v){
        ImageButton gpbut = (ImageButton)findViewById(R.id.gp_button);
        final Animation fadeAlpha = AnimationUtils.loadAnimation(this, R.anim.fade);
        gpbut.startAnimation(fadeAlpha);
        fadeAlpha.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                String id = "103047937395360724371";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/"+id)));
            }
        });
    }

    public void openWeb(View v){
        ImageButton crbut = (ImageButton)findViewById(R.id.cr_button);
        final Animation fadeAlpha = AnimationUtils.loadAnimation(this, R.anim.fade);
        crbut.startAnimation(fadeAlpha);
        fadeAlpha.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                String www = "https://www.classiccarrestorationclub.com/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(www)));
            }
        });
    }

    public void openGmaps(View v) {
        ImageButton mpbut = (ImageButton)findViewById(R.id.mp_button);
        final Animation fadeAlpha = AnimationUtils.loadAnimation(this, R.anim.fade);
        mpbut.startAnimation(fadeAlpha);
        fadeAlpha.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationRepeat(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                Uri gmmIntentUri = Uri.parse("geo:33.8112,-116.4992?z=15.5");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }

    @Override
    public void onBackPressed () {
        final RelativeLayout fs_layer = (RelativeLayout) findViewById(R.id.fullscr_layer);
        final ImageView fs_img = (ImageView) findViewById(R.id.fullscr_img);

        if (fs_layer.getVisibility() == View.VISIBLE) {
            fs_layer.setVisibility(View.GONE);
            fs_img.setImageDrawable(null);
        } else {
            super.onBackPressed();
        }
    }
}
