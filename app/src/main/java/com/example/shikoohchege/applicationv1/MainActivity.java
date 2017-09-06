package com.example.shikoohchege.applicationv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    Button go;
    EditText user_input;
    TextView tv;
//    creating our array
    public static ArrayList<String> usernumbers = new ArrayList<String>();
String user_numbers[];

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go = (Button) findViewById(R.id.go);
        tv = (TextView) findViewById(R.id.textView3);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_input = (EditText) findViewById(R.id.user_input);
                String strUserinput = user_input.getText().toString().replace(",","");
                int value=Integer.parseInt(strUserinput);
                if (strUserinput.length() != 0){
//
                    tv.setText(strUserinput);
                    usernumbers.add(strUserinput);
//                    Toast.makeText(),"",Toast.LENGTH_SHORT).show();
                } else {
                    return;
                }
//          Validates to ensure userinput isnt empty
//                if (TextUtils.isEmpty(strUserinput)) {
//                    user_input.setError("Please enter a number");
//                    return;
//                }
//                usernumbers.add(strUserinput);
//                 tv.setText();

            }
        });
    }



};
