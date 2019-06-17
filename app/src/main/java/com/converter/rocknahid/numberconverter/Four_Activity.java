package com.converter.rocknahid.numberconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Four_Activity extends AppCompatActivity {
    TextView show,result;
    private Button backButton,dButton,bButton,hexButton;
    EditText userInput;
    int num;
    double d;
    String n;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_);
       // backButton=(Button)findViewById(R.id.back_btn);
        userInput=(EditText)findViewById(R.id.inputText);
        result=(TextView)findViewById(R.id.resultText);

        dButton=(Button)findViewById(R.id.Dbtn);
        bButton=(Button)findViewById(R.id.Bbtn);
        hexButton=(Button)findViewById(R.id.hexalbtn);

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n, 8);
                    r=Integer.toString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Octal Number", Toast.LENGTH_SHORT).show();
                }


            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n, 8);
                    r=Integer.toBinaryString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Octal Number", Toast.LENGTH_SHORT).show();
                }


            }

        });

        hexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n, 8);
                    r=Integer.toHexString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Octal Number", Toast.LENGTH_SHORT).show();
                }

            }
        });


        /*backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Four_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_four_, menu);
        return true;
    }


}
