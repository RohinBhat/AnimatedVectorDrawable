package com.example.animatedvectordrawable;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView heart, sign, music, eye, drop, nav, search, heart2, arrow, search2;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heart = findViewById(R.id.heart);
        sign = findViewById(R.id.sign);
        music = findViewById(R.id.music);
        eye = findViewById(R.id.eye);
        drop = findViewById(R.id.drop);
        nav = findViewById(R.id.nav);
        search = findViewById(R.id.search);
        heart2 = findViewById(R.id.heart2);
        arrow = findViewById(R.id.arrow);
        search2 = findViewById(R.id.search2);

        final AnimatedVectorDrawable heart_like = (AnimatedVectorDrawable)
                getDrawable(R.drawable.heart_like);
        final AnimatedVectorDrawable heart_unlike = (AnimatedVectorDrawable)
                getDrawable(R.drawable.heart_unlike);

        final AnimatedVectorDrawable plus_to_minus = (AnimatedVectorDrawable)
                getDrawable(R.drawable.plus_to_minus);
        final AnimatedVectorDrawable minus_to_plus = (AnimatedVectorDrawable)
                getDrawable(R.drawable.minus_to_plus);

        final AnimatedVectorDrawable play_to_pause = (AnimatedVectorDrawable)
                getDrawable(R.drawable.play_to_pause);
        final AnimatedVectorDrawable pause_to_play = (AnimatedVectorDrawable)
                getDrawable(R.drawable.pause_to_play);

        final AnimatedVectorDrawable visible_to_invisible = (AnimatedVectorDrawable)
                getDrawable(R.drawable.visible_to_invisible);
        final AnimatedVectorDrawable invisible_to_visible = (AnimatedVectorDrawable)
                getDrawable(R.drawable.invisible_to_visible);

        final AnimatedVectorDrawable drop_to_close = (AnimatedVectorDrawable)
                getDrawable(R.drawable.drop_to_close);
        final AnimatedVectorDrawable close_to_drop = (AnimatedVectorDrawable)
                getDrawable(R.drawable.close_to_drop);

        final AnimatedVectorDrawable hamburger_to_back = (AnimatedVectorDrawable)
                getDrawable(R.drawable.hamburger_to_back);
        final AnimatedVectorDrawable back_to_hamburger = (AnimatedVectorDrawable)
                getDrawable(R.drawable.back_to_hamburger);

        final AnimatedVectorDrawable search_to_close = (AnimatedVectorDrawable)
                getDrawable(R.drawable.search_to_close);
        final AnimatedVectorDrawable close_to_search = (AnimatedVectorDrawable)
                getDrawable(R.drawable.close_to_search);

        final AnimatedVectorDrawable heartfill = (AnimatedVectorDrawable)
                getDrawable(R.drawable.heartfill);
        final AnimatedVectorDrawable heartbreak = (AnimatedVectorDrawable)
                getDrawable(R.drawable.heartbreak);

        final AnimatedVectorDrawable down_to_up = (AnimatedVectorDrawable)
                getDrawable(R.drawable.down_to_up);
        final AnimatedVectorDrawable up_to_down = (AnimatedVectorDrawable)
                getDrawable(R.drawable.up_to_down);

        final AnimatedVectorDrawable search_to_back = (AnimatedVectorDrawable)
                getDrawable(R.drawable.search_to_back);
        final AnimatedVectorDrawable back_to_search = (AnimatedVectorDrawable)
                getDrawable(R.drawable.back_to_search);

        heart.setImageDrawable(heart_like);
        heart.setSelected(false);

        sign.setImageDrawable(plus_to_minus);
        sign.setSelected(false);

        music.setImageDrawable(play_to_pause);
        music.setSelected(false);

        eye.setImageDrawable(invisible_to_visible);
        eye.setSelected(false);

        drop.setImageResource(R.drawable.drop);
        drop.setSelected(false);

        nav.setImageDrawable(hamburger_to_back);
        nav.setSelected(false);

        search.setImageDrawable(search_to_close);
        search.setSelected(false);

        heart2.setImageDrawable(heartfill);
        heart2.setSelected(false);

        arrow.setImageDrawable(down_to_up);
        arrow.setSelected(false);

        search2.setImageDrawable(search_to_back);
        search2.setSelected(false);

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (heart.isSelected()) {
                    heart.setImageDrawable(heart_unlike);
                    heart.setSelected(false);
                } else {
                    heart.setImageDrawable(heart_like);
                    heart.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) heart.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sign.isSelected()) {
                    sign.setImageDrawable(minus_to_plus);
                    sign.setSelected(false);
                } else {
                    sign.setImageDrawable(plus_to_minus);
                    sign.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) sign.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (music.isSelected()) {
                    music.setImageDrawable(pause_to_play);
                    music.setSelected(false);
                } else {
                    music.setImageDrawable(play_to_pause);
                    music.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) music.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eye.isSelected()) {
                    eye.setImageDrawable(visible_to_invisible);
                    eye.setSelected(false);
                } else {
                    eye.setImageDrawable(invisible_to_visible);
                    eye.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) eye.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drop.isSelected()) {
                    drop.setImageDrawable(close_to_drop);
                    drop.setSelected(false);
                } else {
                    drop.setImageDrawable(drop_to_close);
                    drop.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drop.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nav.isSelected()) {
                    nav.setImageDrawable(back_to_hamburger);
                    nav.setSelected(false);
                } else {
                    nav.setImageDrawable(hamburger_to_back);
                    nav.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) nav.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (search.isSelected()) {
                    search.setImageDrawable(close_to_search);
                    search.setSelected(false);
                } else {
                    search.setImageDrawable(search_to_close);
                    search.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) search.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        heart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (heart2.isSelected()) {
                    heart2.setImageDrawable(heartbreak);
                    heart2.setSelected(false);
                } else {
                    heart2.setImageDrawable(heartfill);
                    heart2.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) heart2.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrow.isSelected()) {
                    arrow.setImageDrawable(up_to_down);
                    arrow.setSelected(false);
                } else {
                    arrow.setImageDrawable(down_to_up);
                    arrow.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) arrow.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });

        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (search2.isSelected()) {
                    search2.setImageDrawable(back_to_search);
                    search2.setSelected(false);
                } else {
                    search2.setImageDrawable(search_to_back);
                    search2.setSelected(true);
                }

                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) search2.getDrawable();
                Drawable drawable = animatedVectorDrawable.getCurrent();

                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });
    }
}
