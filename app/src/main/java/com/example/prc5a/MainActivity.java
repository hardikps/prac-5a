package com.example.prc5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    CheckBox c1,c2,c3;
    TextView t1;
    RadioGroup r;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editTextNumber2);
        c1 = findViewById(R.id.checkbox1);
        c2 = findViewById(R.id.checkbox2);
        c3 = findViewById(R.id.checkbox3);
       t1 = findViewById(R.id.textView5);
       r = findViewById(R.id.rg);


       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               StringBuffer sb = new StringBuffer();
               sb.append(e1.getText().toString()+"\n");
               sb.append(e2.getText().toString()+"\n");
               if (c1.isChecked()){
                   sb.append(c1.getText()+"\n");
               }
               if (c2.isChecked()){
                   sb.append(c2.getText()+"\n");
               }
               if (c3.isChecked()){
                   sb.append(c3.getText()+"\n");
               }
               int value = r.getCheckedRadioButtonId();
               rb = findViewById(value);
               sb.append(rb.getText().toString());
               t1.setText(sb.toString());

           }
       });


    }

    public void drop(View view) {
        e1.setText(null);
        e2.setText(null);
        t1.setText(null);
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        r.clearCheck();

    }
}