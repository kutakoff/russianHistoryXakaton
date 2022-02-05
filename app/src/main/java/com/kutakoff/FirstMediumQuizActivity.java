package com.kutakoff;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatActivity;

public class FirstMediumQuizActivity extends AppCompatActivity {

    ViewFlipper flipper;
    Animation animFlipInForward;
    Animation animFlipOutForward;
    Animation animFlipInBackward;
    Animation animFlipOutBackward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_first_sred_quiz);
        flipper = findViewById(R.id.viewflipper);
        ImageView start_quiz = findViewById(R.id.start_quiz);
        ImageView button_back = findViewById(R.id.button_back);
        TextView textResult_1 = findViewById(R.id.firstTextResult);
        TextView textResult_2 = findViewById(R.id.secondTextResult);
        TextView textResult_3 = findViewById(R.id.thirdTextResult);
        TextView textResult_4 = findViewById(R.id.fourthTextResult);
        TextView textResult_5 = findViewById(R.id.fifthTextResult);

        RadioButton firstCorrect = findViewById(R.id.first_prav);
        RadioButton firstIncorrect_1 = findViewById(R.id.first_neprav);
        RadioButton firstIncorrect_2 = findViewById(R.id.first_neprav_2);
        RadioButton firstIncorrect_3 = findViewById(R.id.first_neprav_3);
        Button firstCheck = findViewById(R.id.check);
        ImageView firstButtonNext = findViewById(R.id.firstNext);

        RadioButton secondCorrect = findViewById(R.id.second_prav);
        RadioButton secondIncorrect_1 = findViewById(R.id.second_neprav);
        RadioButton secondIncorrect_2 = findViewById(R.id.second_neprav_2);
        RadioButton secondIncorrect_3 = findViewById(R.id.second_neprav_3);
        Button secondCheck = findViewById(R.id.check_2);
        ImageView secondButtonNext = findViewById(R.id.secondNext);

        RadioButton thirdCorrect = findViewById(R.id.third_prav);
        RadioButton thirdIncorrect_1 = findViewById(R.id.third_neprav);
        RadioButton thirdIncorrect_2 = findViewById(R.id.third_neprav_2);
        RadioButton thirdIncorrect_3 = findViewById(R.id.third_neprav_3);
        Button thirdCheck = findViewById(R.id.check_3);
        ImageView thirdButtonNext = findViewById(R.id.thirdNext);

        RadioButton fourthCorrect = findViewById(R.id.fourth_prav);
        RadioButton fourthIncorrect_1 = findViewById(R.id.fourth_neprav);
        RadioButton fourthIncorrect_2 = findViewById(R.id.fourth_neprav_2);
        RadioButton fourthIncorrect_3 = findViewById(R.id.fourth_neprav_3);
        Button fourthCheck = findViewById(R.id.check_4);
        ImageView fourthButtonNext = findViewById(R.id.fourthNext);

        RadioButton fifthCorrect = findViewById(R.id.five_prav);
        RadioButton fifthIncorrect_1 = findViewById(R.id.five_neprav);
        RadioButton fifthIncorrect_2 = findViewById(R.id.five_neprav_2);
        RadioButton fifthIncorrect_3 = findViewById(R.id.five_neprav_3);
        Button fifthCheck = findViewById(R.id.check_5);
        ImageView fifthButtonNext = findViewById(R.id.fifthNext);

        start_quiz.setOnClickListener(v -> SwipeRight());
        button_back.setOnClickListener(v -> onBackPressed());

        AddQuestion(firstCorrect, firstIncorrect_1, firstIncorrect_2, firstIncorrect_3, firstCheck, firstButtonNext, textResult_1);
        AddQuestion(secondCorrect, secondIncorrect_1, secondIncorrect_2, secondIncorrect_3, secondCheck, secondButtonNext, textResult_2);
        AddQuestion(thirdCorrect, thirdIncorrect_1, thirdIncorrect_2, thirdIncorrect_3, thirdCheck, thirdButtonNext, textResult_3);
        AddQuestion(fourthCorrect, fourthIncorrect_1, fourthIncorrect_2, fourthIncorrect_3, fourthCheck, fourthButtonNext, textResult_4);
        AddQuestion(fifthCorrect, fifthIncorrect_1, fifthIncorrect_2, fifthIncorrect_3, fifthCheck, fifthButtonNext, textResult_5);

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

    private void AddQuestion(RadioButton correct, RadioButton incorrect_1, RadioButton incorrect_2, RadioButton incorrect_3, Button check, ImageView button_next, TextView textResult) {
        correct.setOnClickListener(v -> {
            if (correct.isChecked()) {
                if (!button_next.isShown()) {
                    check.setVisibility(View.VISIBLE);
                }
                incorrect_1.setChecked(false);
                incorrect_2.setChecked(false);
                incorrect_3.setChecked(false);
            }
        });
        incorrect_1.setOnClickListener(v -> {
            if (incorrect_1.isChecked()) {
                if (!button_next.isShown()) {
                    check.setVisibility(View.VISIBLE);
                }
                correct.setChecked(false);
                incorrect_2.setChecked(false);
                incorrect_3.setChecked(false);
            }
        });
        incorrect_2.setOnClickListener(v -> {
            if (incorrect_2.isChecked()) {
                if (!button_next.isShown()) {
                    check.setVisibility(View.VISIBLE);
                }
                incorrect_1.setChecked(false);
                incorrect_3.setChecked(false);
                correct.setChecked(false);
            }
        });
        incorrect_3.setOnClickListener(v -> {
            if (incorrect_3.isChecked()) {
                if (!button_next.isShown()) {
                    check.setVisibility(View.VISIBLE);
                }
                incorrect_1.setChecked(false);
                incorrect_2.setChecked(false);
                correct.setChecked(false);
            }
        });
        check.setOnClickListener(v -> {
            if (correct.isChecked()) {
                Count.plussa();
                textResult.setText("Правильно!");
                textResult.setTextColor(Color.GREEN);
            } else {
                textResult.setText("Не правильно!");
                textResult.setTextColor(Color.RED);
            }
            check.setVisibility(View.INVISIBLE);
            button_next.setVisibility(View.VISIBLE);
            button_next.setOnClickListener(v1 -> {
                Count.count++;
                if (Count.count == 5) {
                    startActivity(new Intent(FirstMediumQuizActivity.this, ResultQuizActivity.class));
                    Count.count = 0;
                } else {
                    SwipeRight();
                }
            });
        });
    }
}