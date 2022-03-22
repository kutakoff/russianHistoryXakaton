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

public class KrimHardQuizActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_krim_hard_quiz);
        flipper = findViewById(R.id.viewflipper);
        ImageView start_quiz = findViewById(R.id.start_quiz);
        ImageView button_back = findViewById(R.id.button_back);

        RadioButton firstCorrect = findViewById(R.id.first_prav);
        RadioButton firstIncorrect_1 = findViewById(R.id.first_neprav);
        RadioButton firstIncorrect_2 = findViewById(R.id.first_neprav_2);
        RadioButton firstIncorrect_3 = findViewById(R.id.first_neprav_3);
        ImageView firstCheck = findViewById(R.id.check);
        ImageView firstButtonNext = findViewById(R.id.firstNext);

        RadioButton secondCorrect = findViewById(R.id.second_prav);
        RadioButton secondIncorrect_1 = findViewById(R.id.second_neprav);
        RadioButton secondIncorrect_2 = findViewById(R.id.second_neprav_2);
        RadioButton secondIncorrect_3 = findViewById(R.id.second_neprav_3);
        ImageView secondCheck = findViewById(R.id.check_2);
        ImageView secondButtonNext = findViewById(R.id.secondNext);

        RadioButton thirdCorrect = findViewById(R.id.third_prav);
        RadioButton thirdIncorrect_1 = findViewById(R.id.third_neprav);
        RadioButton thirdIncorrect_2 = findViewById(R.id.third_neprav_2);
        RadioButton thirdIncorrect_3 = findViewById(R.id.third_neprav_3);
        ImageView thirdCheck = findViewById(R.id.check_3);
        ImageView thirdButtonNext = findViewById(R.id.thirdNext);

        RadioButton fourthCorrect = findViewById(R.id.fourth_prav);
        RadioButton fourthIncorrect_1 = findViewById(R.id.fourth_neprav);
        RadioButton fourthIncorrect_2 = findViewById(R.id.fourth_neprav_2);
        RadioButton fourthIncorrect_3 = findViewById(R.id.fourth_neprav_3);
        ImageView fourthCheck = findViewById(R.id.check_4);
        ImageView fourthButtonNext = findViewById(R.id.fourthNext);

        RadioButton fifthCorrect = findViewById(R.id.five_prav);
        RadioButton fifthIncorrect_1 = findViewById(R.id.five_neprav);
        RadioButton fifthIncorrect_2 = findViewById(R.id.five_neprav_2);
        RadioButton fifthIncorrect_3 = findViewById(R.id.five_neprav_3);
        ImageView fifthCheck = findViewById(R.id.check_5);
        ImageView fifthButtonNext = findViewById(R.id.fifthNext);

        RadioButton sixthCorrect = findViewById(R.id.six_prav);
        RadioButton sixthIncorrect_1 = findViewById(R.id.six_neprav);
        RadioButton sixthIncorrect_2 = findViewById(R.id.six_neprav_2);
        RadioButton sixthIncorrect_3 = findViewById(R.id.six_neprav_3);
        ImageView sixthCheck = findViewById(R.id.check_6);
        ImageView sixthButtonNext = findViewById(R.id.sixthNext);

        RadioButton seventhCorrect = findViewById(R.id.seven_prav);
        RadioButton seventhIncorrect_1 = findViewById(R.id.seven_neprav);
        RadioButton seventhIncorrect_2 = findViewById(R.id.seven_neprav_2);
        RadioButton seventhIncorrect_3 = findViewById(R.id.seven_neprav_3);
        ImageView seventhCheck = findViewById(R.id.check_7);
        ImageView seventhButtonNext = findViewById(R.id.seventhNext);

        RadioButton eightCorrect = findViewById(R.id.eight_prav);
        RadioButton eightIncorrect_1 = findViewById(R.id.eight_neprav);
        RadioButton eightIncorrect_2 = findViewById(R.id.eight_neprav_2);
        RadioButton eightIncorrect_3 = findViewById(R.id.eight_neprav_3);
        ImageView eightCheck = findViewById(R.id.check_8);
        ImageView eightButtonNext = findViewById(R.id.eightNext);

        RadioButton ninthCorrect = findViewById(R.id.nine_prav);
        RadioButton ninthIncorrect_1 = findViewById(R.id.nine_neprav);
        RadioButton ninthIncorrect_2 = findViewById(R.id.nine_neprav_2);
        RadioButton ninthIncorrect_3 = findViewById(R.id.nine_neprav_3);
        ImageView ninthCheck = findViewById(R.id.check_9);
        ImageView ninthButtonNext = findViewById(R.id.ninthNext);

        RadioButton tenthCorrect = findViewById(R.id.ten_prav);
        RadioButton tenthIncorrect_1 = findViewById(R.id.ten_neprav);
        RadioButton tenthIncorrect_2 = findViewById(R.id.ten_neprav_2);
        RadioButton tenthIncorrect_3 = findViewById(R.id.ten_neprav_3);
        ImageView tenthCheck = findViewById(R.id.check_10);
        ImageView tenthButtonNext = findViewById(R.id.tenthNext);

        Count.isHardQuiz = true;

        start_quiz.setOnClickListener(v -> SwipeRight());
        button_back.setOnClickListener(v -> onBackPressed());

        addQuestion(firstCorrect, firstIncorrect_1, firstIncorrect_2, firstIncorrect_3, firstCheck, firstButtonNext);
        addQuestion(secondCorrect, secondIncorrect_1, secondIncorrect_2, secondIncorrect_3, secondCheck, secondButtonNext);
        addQuestion(thirdCorrect, thirdIncorrect_1, thirdIncorrect_2, thirdIncorrect_3, thirdCheck, thirdButtonNext);
        addQuestion(fourthCorrect, fourthIncorrect_1, fourthIncorrect_2, fourthIncorrect_3, fourthCheck, fourthButtonNext);
        addQuestion(fifthCorrect, fifthIncorrect_1, fifthIncorrect_2, fifthIncorrect_3, fifthCheck, fifthButtonNext);
        addQuestion(sixthCorrect, sixthIncorrect_1, sixthIncorrect_2, sixthIncorrect_3, sixthCheck, sixthButtonNext);
        addQuestion(seventhCorrect, seventhIncorrect_1, seventhIncorrect_2, seventhIncorrect_3, seventhCheck, seventhButtonNext);
        addQuestion(eightCorrect, eightIncorrect_1, eightIncorrect_2, eightIncorrect_3, eightCheck, eightButtonNext);
        addQuestion(ninthCorrect, ninthIncorrect_1, ninthIncorrect_2, ninthIncorrect_3, ninthCheck, ninthButtonNext);
        addQuestion(tenthCorrect, tenthIncorrect_1, tenthIncorrect_2, tenthIncorrect_3, tenthCheck, tenthButtonNext);

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
    private void addQuestion(RadioButton correct, RadioButton incorrect_1, RadioButton incorrect_2, RadioButton incorrect_3, ImageView check, ImageView button_next) {
        correct.setOnClickListener(v -> isChecked(correct, check, button_next, incorrect_1, incorrect_2, incorrect_3));
        incorrect_1.setOnClickListener(v -> isChecked(incorrect_1, check, button_next, correct, incorrect_2, incorrect_3));
        incorrect_2.setOnClickListener(v -> isChecked(incorrect_2, check, button_next, incorrect_1, incorrect_3, correct));
        incorrect_3.setOnClickListener(v -> isChecked(incorrect_3, check, button_next, incorrect_1, incorrect_2, correct));
        check.setOnClickListener(v -> check(correct, incorrect_1, incorrect_2, incorrect_3, check, button_next));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void changeTextColor(RadioButton first, RadioButton second, RadioButton third) {

        ColorStateList colorStateList = new ColorStateList(
                new int[][] {
                        new int[]{-android.R.attr.state_enabled}, // Disabled
                        new int[]{android.R.attr.state_enabled}   // Enabled
                },
                new int[] {
                        Color.GRAY, // disabled
                        Color.WHITE   // enabled
                }
        );

        first.setEnabled(false);
        first.setTextColor(Color.GRAY);
        second.setEnabled(false);
        second.setTextColor(Color.GRAY);
        third.setEnabled(false);
        third.setTextColor(Color.GRAY);
        first.setButtonTintList(colorStateList);
        second.setButtonTintList(colorStateList);
        third.setButtonTintList(colorStateList);
    }

    private void isChecked(RadioButton choose, ImageView check, ImageView button_next, RadioButton first, RadioButton second, RadioButton third) {
        if (choose.isChecked()) {
            if (!button_next.isShown()) {
                check.setVisibility(View.VISIBLE);
            }
            first.setChecked(false);
            second.setChecked(false);
            third.setChecked(false);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void check(RadioButton correct, RadioButton incorrect_1, RadioButton incorrect_2, RadioButton incorrect_3, ImageView check, ImageView button_next) {
        if (correct.isChecked()) {
            Count.plussa();
            changeTextColor(incorrect_1, incorrect_2, incorrect_3);
            correct.setBackgroundColor(Color.GREEN);
        } else if (incorrect_1.isChecked()) {
            incorrect_1.setBackgroundColor(Color.RED);
            changeTextColor(correct, incorrect_2, incorrect_3);
        } else if (incorrect_2.isChecked()){
            incorrect_2.setBackgroundColor(Color.RED);
            changeTextColor(correct, incorrect_1, incorrect_3);
        } else {
            incorrect_3.setBackgroundColor(Color.RED);
            changeTextColor(correct, incorrect_1, incorrect_2);
        }
        check.setVisibility(View.INVISIBLE);
        button_next.setVisibility(View.VISIBLE);
        button_next.setOnClickListener(v1 -> {
            Count.count++;
            if (Count.count == 10) {
                startActivity(new Intent(KrimHardQuizActivity.this, ResultQuizActivity.class));
                Count.count = 0;
            } else {
                SwipeRight();
            }
        });
    }
}