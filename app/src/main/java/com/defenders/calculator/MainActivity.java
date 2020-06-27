package com.defenders.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btPlus,btMin,btAns,btDiv,btMul,btClear;

    float mValueOne, mValueTwo;
    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        bt1 = findViewById((R.id.bt1));
        bt2 = findViewById((R.id.bt2));
        bt3 = findViewById((R.id.bt3));
        bt4 = findViewById((R.id.bt4));
        bt5 = findViewById((R.id.bt5));
        bt6 = findViewById((R.id.bt6));
        bt7 = findViewById((R.id.bt7));
        bt8 = findViewById((R.id.bt8));
        bt9 = findViewById((R.id.bt9));
        bt0 = findViewById((R.id.bt0));
        btPlus = findViewById((R.id.btPlus));
        btMin = findViewById((R.id.btMin));
        btMul = findViewById((R.id.btMul));
        btDiv = findViewById(R.id.btDiv);
        btClear = findViewById((R.id.btClear));
        btAns = findViewById(R.id.btAns);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                editText.setSelection(editText.getText().length());
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                editText.setSelection(editText.getText().length());
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                editText.setSelection(editText.getText().length());
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                editText.setSelection(editText.getText().length());
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                editText.setSelection(editText.getText().length());
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                editText.setSelection(editText.getText().length());
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                editText.setSelection(editText.getText().length());
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                editText.setSelection(editText.getText().length());
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                editText.setSelection(editText.getText().length());
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                editText.setSelection(editText.getText().length());
            }
        });

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                }else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    editText.setText("+");
                }
//                editText.setSelection(editText.getText().length());
            }
        });

        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                Subtraction = true;
                editText.setText(null);
                editText.setSelection(editText.getText().length());
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                Multiplication = true;
                editText.setText(null);
                editText.setSelection(editText.getText().length());
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                Division = true;
                editText.setText(null);
                editText.setSelection(editText.getText().length());
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
                editText.setSelection(editText.getText().length());
            }
        });

        btAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText.getText() + "");
                if (Addition == true){
                    editText.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtraction == true){
                    editText.setText(mValueOne - mValueTwo + "");
                    Subtraction = false;
                }

                if (Multiplication == true){
                    editText.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true){
                    editText.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
//                editText.setSelection(editText.getText().length());
            }
        });
    }


}
