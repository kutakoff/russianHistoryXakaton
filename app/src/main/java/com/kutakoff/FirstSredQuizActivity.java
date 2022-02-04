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

public class FirstSredQuizActivity extends AppCompatActivity {

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
        start_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SwipeRight();
            }
        });
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        RadioButton first_prav = findViewById(R.id.first_prav);
        RadioButton first_neprav = findViewById(R.id.first_neprav);
        RadioButton first_neprav_2 = findViewById(R.id.first_neprav_2);
        RadioButton first_neprav_3 = findViewById(R.id.first_neprav_3);
        Button check = findViewById(R.id.check);
        TextView firstTextResult = findViewById(R.id.firstTextResult);
        ImageView firstNext = findViewById(R.id.firstNext);
        first_prav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_prav.isChecked()) {
                    if (Count.firstQuiz == 0) {
                        check.setVisibility(View.VISIBLE);
                    }
                    first_neprav.setChecked(false);
                    first_neprav_2.setChecked(false);
                    first_neprav_3.setChecked(false);
                } else {
                    check.setVisibility(View.INVISIBLE);
                }
            }
        });
        first_neprav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_neprav.isChecked()) {
                    if (Count.firstQuiz == 0) {
                        check.setVisibility(View.VISIBLE);
                    }
                    first_prav.setChecked(false);
                    first_neprav_2.setChecked(false);
                    first_neprav_3.setChecked(false);
                } else {
                    check.setVisibility(View.INVISIBLE);
                }
            }
        });
        first_neprav_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_neprav_2.isChecked()) {
                    if (Count.firstQuiz == 0) {
                        check.setVisibility(View.VISIBLE);
                    }
                    first_neprav_3.setChecked(false);
                    first_neprav.setChecked(false);
                    first_prav.setChecked(false);
                } else {
                    check.setVisibility(View.INVISIBLE);
                }
            }
        });
        first_neprav_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_neprav_3.isChecked()) {
                    if (Count.firstQuiz == 0) {
                        check.setVisibility(View.VISIBLE);
                    }
                    first_neprav_2.setChecked(false);
                    first_neprav.setChecked(false);
                    first_prav.setChecked(false);
                } else {
                    check.setVisibility(View.INVISIBLE);
                }
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_prav.isChecked()) {
                    Count.plussa();
                    firstTextResult.setTextColor(Color.GREEN);
                    firstTextResult.setText("Правильно!");
                } else {
                    Count.setFirst();
                    firstTextResult.setTextColor(Color.RED);
                    firstTextResult.setText("Не правильно!");
                }
                Count.setFirstQuiz();
                check.setVisibility(View.INVISIBLE);
                firstNext.setVisibility(View.VISIBLE);
                firstNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Count.firstQuiz = 0;
                        SwipeRight();
                    }
                });
            }
        });
        RadioButton second_prav = findViewById(R.id.second_prav);
        RadioButton second_neprav = findViewById(R.id.second_neprav);
        RadioButton second_neprav_2 = findViewById(R.id.second_neprav_2);
        RadioButton second_neprav_3 = findViewById(R.id.second_neprav_3);
        Button check_2 = findViewById(R.id.check_2);
        TextView secondTextResult = findViewById(R.id.secondTextResult);
        ImageView secondNext = findViewById(R.id.secondNext);
        second_prav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (second_prav.isChecked()) {
                    if (Count.secondQuiz == 0) {
                        check_2.setVisibility(View.VISIBLE);
                    }
                    second_neprav.setChecked(false);
                    second_neprav_2.setChecked(false);
                    second_neprav_3.setChecked(false);
                } else {
                    check_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        second_neprav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (second_neprav.isChecked()) {
                    if (Count.secondQuiz == 0) {
                        check_2.setVisibility(View.VISIBLE);
                    }
                    second_prav.setChecked(false);
                    second_neprav_2.setChecked(false);
                    second_neprav_3.setChecked(false);
                } else {
                    check_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        second_neprav_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (second_neprav_2.isChecked()) {
                    if (Count.secondQuiz == 0) {
                        check_2.setVisibility(View.VISIBLE);
                    }
                    second_neprav.setChecked(false);
                    second_neprav_3.setChecked(false);
                    second_prav.setChecked(false);
                } else {
                    check_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        second_neprav_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (second_neprav_3.isChecked()) {
                    if (Count.secondQuiz == 0) {
                        check_2.setVisibility(View.VISIBLE);
                    }
                    second_neprav.setChecked(false);
                    second_neprav_2.setChecked(false);
                    second_prav.setChecked(false);
                } else {
                    check_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        check_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (second_prav.isChecked()) {
                    Count.plussa();
                    secondTextResult.setTextColor(Color.GREEN);
                    secondTextResult.setText("Правильно!");
                } else {
                    Count.setSecond();
                    secondTextResult.setTextColor(Color.RED);
                    secondTextResult.setText("Не правильно!");
                }
                Count.setSecondQuiz();
                check_2.setVisibility(View.INVISIBLE);
                secondNext.setVisibility(View.VISIBLE);
                secondNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Count.secondQuiz = 0;
                        SwipeRight();
                    }
                });
            }
        });
        RadioButton third_prav = findViewById(R.id.third_prav);
        RadioButton third_neprav = findViewById(R.id.third_neprav);
        RadioButton third_neprav_2 = findViewById(R.id.third_neprav_2);
        RadioButton third_neprav_3 = findViewById(R.id.third_neprav_3);
        Button check_3 = findViewById(R.id.check_3);
        TextView thirdTextResult = findViewById(R.id.thirdTextResult);
        ImageView thirdNext = findViewById(R.id.thirdNext);
        third_prav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (third_prav.isChecked()) {
                    if (Count.thirdQuiz == 0) {
                        check_3.setVisibility(View.VISIBLE);
                    }
                    third_neprav.setChecked(false);
                    third_neprav_2.setChecked(false);
                    third_neprav_3.setChecked(false);
                } else {
                    check_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        third_neprav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (third_neprav.isChecked()) {
                    if (Count.thirdQuiz == 0) {
                        check_3.setVisibility(View.VISIBLE);
                    }
                    third_prav.setChecked(false);
                    third_neprav_2.setChecked(false);
                    third_neprav_3.setChecked(false);
                } else {
                    check_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        third_neprav_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (third_neprav_2.isChecked()) {
                    if (Count.thirdQuiz == 0) {
                        check_3.setVisibility(View.VISIBLE);
                    }
                    third_neprav.setChecked(false);
                    third_neprav_3.setChecked(false);
                    third_prav.setChecked(false);
                } else {
                    check_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        third_neprav_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (third_neprav_3.isChecked()) {
                    if (Count.thirdQuiz == 0) {
                        check_3.setVisibility(View.VISIBLE);
                    }
                    third_neprav.setChecked(false);
                    third_neprav_2.setChecked(false);
                    third_prav.setChecked(false);
                } else {
                    check_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        check_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (third_prav.isChecked()) {
                    Count.plussa();
                    thirdTextResult.setTextColor(Color.GREEN);
                    thirdTextResult.setText("Правильно!");
                } else {
                    Count.setThird();
                    thirdTextResult.setTextColor(Color.RED);
                    thirdTextResult.setText("Не правильно!");
                }
                Count.setThirdQuiz();
                check_3.setVisibility(View.INVISIBLE);
                thirdNext.setVisibility(View.VISIBLE);
                thirdNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Count.thirdQuiz = 0;
                        SwipeRight();
                    }
                });
            }
        });
        RadioButton fourth_prav = findViewById(R.id.fourth_prav);
        RadioButton fourth_neprav = findViewById(R.id.fourth_neprav);
        RadioButton fourth_neprav_2 = findViewById(R.id.fourth_neprav_2);
        RadioButton fourth_neprav_3 = findViewById(R.id.fourth_neprav_3);
        Button check_4 = findViewById(R.id.check_4);
        TextView fourthTextResult = findViewById(R.id.fourthTextResult);
        ImageView fourthNext = findViewById(R.id.fourthNext);
        fourth_prav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourth_prav.isChecked()) {
                    if (Count.fourthQuiz == 0) {
                        check_4.setVisibility(View.VISIBLE);
                    }
                    fourth_neprav.setChecked(false);
                    fourth_neprav_2.setChecked(false);
                    fourth_neprav_3.setChecked(false);
                } else {
                    check_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        fourth_neprav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourth_neprav.isChecked()) {
                    if (Count.fourthQuiz == 0) {
                        check_4.setVisibility(View.VISIBLE);
                    }
                    fourth_prav.setChecked(false);
                    fourth_neprav_2.setChecked(false);
                    fourth_neprav_3.setChecked(false);
                } else {
                    check_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        fourth_neprav_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourth_neprav_2.isChecked()) {
                    if (Count.fourthQuiz == 0) {
                        check_4.setVisibility(View.VISIBLE);
                    }
                    fourth_neprav.setChecked(false);
                    fourth_neprav_3.setChecked(false);
                    fourth_prav.setChecked(false);
                } else {
                    check_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        fourth_neprav_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourth_neprav_3.isChecked()) {
                    if (Count.fourthQuiz == 0) {
                        check_4.setVisibility(View.VISIBLE);
                    }
                    fourth_neprav.setChecked(false);
                    fourth_neprav_2.setChecked(false);
                    fourth_prav.setChecked(false);
                } else {
                    check_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        check_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourth_prav.isChecked()) {
                    Count.plussa();
                    fourthTextResult.setTextColor(Color.GREEN);
                    fourthTextResult.setText("Правильно!");
                } else {
                    Count.setFourth();
                    fourthTextResult.setTextColor(Color.RED);
                    fourthTextResult.setText("Не правильно!");
                }
                Count.setFourthQuiz();
                check_4.setVisibility(View.INVISIBLE);
                fourthNext.setVisibility(View.VISIBLE);
                fourthNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Count.fourthQuiz = 0;
                        SwipeRight();
                    }
                });
            }
        });
        RadioButton five_prav = findViewById(R.id.five_prav);
        RadioButton five_neprav = findViewById(R.id.five_neprav);
        RadioButton five_neprav_2 = findViewById(R.id.five_neprav_2);
        RadioButton five_neprav_3 = findViewById(R.id.five_neprav_3);
        Button check_5 = findViewById(R.id.check_5);
        TextView fifthTextResult = findViewById(R.id.fifthTextResult);
        ImageView fifthNext = findViewById(R.id.fifthNext);
        five_prav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five_prav.isChecked()) {
                    if (Count.fifthQuiz == 0) {
                        check_5.setVisibility(View.VISIBLE);
                    }
                    five_neprav.setChecked(false);
                    five_neprav_2.setChecked(false);
                    five_neprav_3.setChecked(false);
                } else {
                    check_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        five_neprav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five_neprav.isChecked()) {
                    if (Count.fifthQuiz == 0) {
                        check_5.setVisibility(View.VISIBLE);
                    }
                    five_prav.setChecked(false);
                    five_neprav_2.setChecked(false);
                    five_neprav_3.setChecked(false);
                } else {
                    check_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        five_neprav_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five_neprav_2.isChecked()) {
                    if (Count.fifthQuiz == 0) {
                        check_5.setVisibility(View.VISIBLE);
                    }
                    five_neprav.setChecked(false);
                    five_neprav_3.setChecked(false);
                    five_prav.setChecked(false);
                } else {
                    check_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        five_neprav_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five_neprav_3.isChecked()) {
                    if (Count.fifthQuiz == 0) {
                        check_5.setVisibility(View.VISIBLE);
                    }
                    five_neprav.setChecked(false);
                    five_neprav_2.setChecked(false);
                    five_prav.setChecked(false);
                } else {
                    check_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        check_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five_prav.isChecked()) {
                    Count.plussa();
                    fifthTextResult.setTextColor(Color.GREEN);
                    fifthTextResult.setText("Правильно!");
                } else {
                    Count.setFifth();
                    fifthTextResult.setTextColor(Color.RED);
                    fifthTextResult.setText("Не правильно!");
                }
                Count.setFifthQuiz();
                check_5.setVisibility(View.INVISIBLE);
                fifthNext.setVisibility(View.VISIBLE);
                fifthNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Count.fifthQuiz = 0;
                        startActivity(new Intent(FirstSredQuizActivity.this, ResultQuizActivity.class));
                    }
                });
            }
        });
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
}