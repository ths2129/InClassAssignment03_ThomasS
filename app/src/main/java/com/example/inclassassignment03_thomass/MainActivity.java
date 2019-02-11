package com.example.inclassassignment03_thomass;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
   /* int zero = 0;
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;
    int five = 5;
    int six = 6;
    int seven = 7;
    int eight = 8;
    int nine = 9;

    */
    String num = "123";
    String zero = "0";
    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    String six = "6";
    String seven = "7";
    String eight = "8";
    String nine = "9";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view) {
        //one = 1;
        one = "1";
        display(one);
    }

    public void two (View view) {
        //two = 2;
        two= "2";
        display(two);
    }

    public void three(View view) {
        //three = 3;
        display(three);
    }

    public void four (View view) {
        //four = 4;
        display(four);
    }
    public void five(View view) {
        //five = 5;
        display(five);
    }

    public void six (View view) {
        //six = 6;
        display(six);
    }

    public void seven(View view) {
       // seven = 7;
        display(seven);
    }

    public void eight (View view) {
      //  eight = 8;
        display(eight);
    }
    public void nine(View view) {
      //  nine = 9;
        display(nine);
    }

    public void del(View view){
      //  zero = 0;
        display(zero);
    }

    public void zero (View view) {
      //  zero = 0;
        display(zero);
    }

    private void display(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.total_text_view);
        quantityTextView.setText(String.valueOf("" + number));
        //  TextView one = (TextView) findViewById(R.id.one);

        //Button result = (Button) findViewById(R.id.del);


       // if (quantityTextView.getText().equals(0));
          //  quantityTextView.setText(Integer.valueOf("" + number + quantityTextView));
           // for (int i = 0; number > 0; i++);

        //     one.setText(String.valueOf(one));


        }}




        //TextView quantityTextView2 = (TextView) findViewById(R.id.total_text_view);
       // quantityTextView2.setText(Integer.parseInt("" + number));

          //  int num = Integer.parseInt(quantityTextView.getText().toString());
           // quantityTextView.setText(String.valueOf(num));
            //quantityTextView.setText(String.valueOf("" + number));
          //  quantityTextView.setText(String.valueOf("" + num));




       // TextView second = (TextView) findViewById(R.id.total_text_view);


    /*    if (quantityTextView.getText().equals("7")) {
            num = Integer.parseInt(.getText().toString());
            quantityTextView.setText(String.valueOf(num));
*/




/*

    }
        private TextView mTextView;
    private static final String TAG = "Quiz Activity";
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }



    //private Question[] mQuestionBank = new Question[] {
  // new Question
   // }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();

            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() { //parameter is View.onClickListener in the method
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show(); // THe name of the class, then .this method, string value

            }
        });

*/
