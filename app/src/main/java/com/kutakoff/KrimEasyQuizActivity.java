package com.kutakoff;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ViewFlipper;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class KrimEasyQuizActivity extends AppCompatActivity {

    ViewFlipper flipper;
    Animation animFlipInForward;
    Animation animFlipOutForward;
    Animation animFlipInBackward;
    Animation animFlipOutBackward;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        setContentView(R.layout.activity_krim_easy_quiz);
        flipper = findViewById(R.id.viewflipper);
        ImageView start_quiz = findViewById(R.id.start_quiz);
        ImageView button_back = findViewById(R.id.button_back);

        RadioButton firstCorrect = findViewById(R.id.first_prav);
        RadioButton firstIncorrect_1 = findViewById(R.id.first_neprav);
        RadioButton firstIncorrect_2 = findViewById(R.id.first_neprav_2);
        ImageView firstCheck = findViewById(R.id.check);
        ImageView firstButtonNext = findViewById(R.id.firstNext);

        RadioButton secondCorrect = findViewById(R.id.second_prav);
        RadioButton secondIncorrect_1 = findViewById(R.id.second_neprav);
        RadioButton secondIncorrect_2 = findViewById(R.id.second_neprav_2);
        ImageView secondCheck = findViewById(R.id.check_2);
        ImageView secondButtonNext = findViewById(R.id.secondNext);

        RadioButton thirdCorrect = findViewById(R.id.third_prav);
        RadioButton thirdIncorrect_1 = findViewById(R.id.third_neprav);
        RadioButton thirdIncorrect_2 = findViewById(R.id.third_neprav_2);
        ImageView thirdCheck = findViewById(R.id.check_3);
        ImageView thirdButtonNext = findViewById(R.id.thirdNext);

        RadioButton fourthCorrect = findViewById(R.id.fourth_prav);
        RadioButton fourthIncorrect_1 = findViewById(R.id.fourth_neprav);
        RadioButton fourthIncorrect_2 = findViewById(R.id.fourth_neprav_2);
        ImageView fourthCheck = findViewById(R.id.check_4);
        ImageView fourthButtonNext = findViewById(R.id.fourthNext);

        RadioButton fifthCorrect = findViewById(R.id.five_prav);
        RadioButton fifthIncorrect_1 = findViewById(R.id.five_neprav);
        RadioButton fifthIncorrect_2 = findViewById(R.id.five_neprav_2);
        ImageView fifthCheck = findViewById(R.id.check_5);
        ImageView fifthButtonNext = findViewById(R.id.fifthNext);

        RadioButton sixCorrect = findViewById(R.id.six_prav);
        RadioButton sixIncorrect_1 = findViewById(R.id.six_neprav);
        RadioButton sixIncorrect_2 = findViewById(R.id.six_neprav_2);
        ImageView sixCheck = findViewById(R.id.check_6);
        ImageView sixthButtonNext = findViewById(R.id.sixthNext);

        Count.isSpecialQUiz = true;

        start_quiz.setOnClickListener(v -> SwipeRight());
        button_back.setOnClickListener(v -> onBackPressed());

        addQuestion(firstCorrect, firstIncorrect_1, firstIncorrect_2, firstCheck, firstButtonNext);
        addQuestion(secondCorrect, secondIncorrect_1, secondIncorrect_2, secondCheck, secondButtonNext);
        addQuestion(thirdCorrect, thirdIncorrect_1, thirdIncorrect_2, thirdCheck, thirdButtonNext);
        addQuestion(fourthCorrect, fourthIncorrect_1, fourthIncorrect_2, fourthCheck, fourthButtonNext);
        addQuestion(fifthCorrect, fifthIncorrect_1, fifthIncorrect_2, fifthCheck, fifthButtonNext);
        addQuestion(sixCorrect, sixIncorrect_1, sixIncorrect_2, sixCheck, sixthButtonNext);

        animFlipInForward = AnimationUtils.loadAnimation(this, R.anim.flipin);
        animFlipOutForward = AnimationUtils.loadAnimation(this, R.anim.flipout);
        animFlipInBackward = AnimationUtils.loadAnimation(this, R.anim.flipin_reverse);
        animFlipOutBackward = AnimationUtils.loadAnimation(this, R.anim.flipout_reverse);
    }

    private void SwipeRight() {
        flipper.setInAnimation(animFlipInForward);
        flipper.setOutAnimation(animFlipOutForward);
        flipper.showNext();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void addQuestion(RadioButton correct, RadioButton incorrect_1, RadioButton incorrect_2, ImageView check, ImageView button_next) {
        correct.setOnClickListener(v -> isChecked(correct, check, button_next, incorrect_1, incorrect_2));
        incorrect_1.setOnClickListener(v -> isChecked(incorrect_1, check, button_next, correct, incorrect_2));
        incorrect_2.setOnClickListener(v -> isChecked(incorrect_2, check, button_next, incorrect_1, correct));
        check.setOnClickListener(v -> check(correct, incorrect_1, incorrect_2, check, button_next));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void changeTextColor(RadioButton first, RadioButton second) {

        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_enabled}, // Disabled
                        new int[]{android.R.attr.state_enabled}   // Enabled
                },
                new int[]{
                        Color.GRAY, // disabled
                        Color.WHITE   // enabled
                }
        );

        first.setEnabled(false);
        first.setTextColor(Color.GRAY);
        second.setEnabled(false);
        second.setTextColor(Color.GRAY);
        first.setButtonTintList(colorStateList);
        second.setButtonTintList(colorStateList);
    }

    private void isChecked(RadioButton choose, ImageView check, ImageView button_next, RadioButton first, RadioButton second) {
        if (choose.isChecked()) {
            if (!button_next.isShown()) {
                check.setVisibility(View.VISIBLE);
            }
            first.setChecked(false);
            second.setChecked(false);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void check(RadioButton correct, RadioButton incorrect_1, RadioButton incorrect_2, ImageView check, ImageView button_next) {
        if (correct.isChecked()) {
            Count.plussa();
            changeTextColor(incorrect_1, incorrect_2);
            correct.setBackgroundColor(Color.GREEN);
        } else if (incorrect_1.isChecked()) {
            incorrect_1.setBackgroundColor(Color.RED);
            changeTextColor(correct, incorrect_2);
        } else {
            incorrect_2.setBackgroundColor(Color.RED);
            changeTextColor(correct, incorrect_1);
        }
        check.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.VISIBLE);
        button_next.setOnClickListener(v1 -> {
            Count.count++;
            if (Count.count == 6) {
                startActivity(new Intent(KrimEasyQuizActivity.this, ResultQuizActivity.class));
                Count.count = 0;
            } else {
                SwipeRight();
            }
        });
    }

/*    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Вы действительно хотите выйти из квиза? Весь прогресс будет утерян.")
                .setCancelable(false)
                .setPositiveButton("Да", (dialog, id) -> Count.count = 0).setPositiveButton("Да", (dialog, id) -> Count.a = 0).setPositiveButton("Да", (dialog, id) -> finish()).setNegativeButton("Нет", null).show();
    }*/
}