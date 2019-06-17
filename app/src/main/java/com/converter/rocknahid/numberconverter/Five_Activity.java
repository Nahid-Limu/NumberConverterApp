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

public class Five_Activity extends AppCompatActivity {
    TextView result;
    private Button decimal,bainary,octal,back;
    EditText userInput5;

    int num;
    double d;
    String n;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_);
        //back=(Button)findViewById(R.id.back_btn);
        decimal=(Button)findViewById(R.id.D5btn);
        bainary=(Button)findViewById(R.id.B5btn);
        octal=(Button)findViewById(R.id.O5btn);

        result=(TextView)findViewById(R.id.resultText);
        userInput5=(EditText)findViewById(R.id.inputText);

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput5.getText().toString();
                    num=Integer.parseInt(n, 16);
                    r=Integer.toString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter HexaDecimal Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bainary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput5.getText().toString();
                    num=Integer.parseInt(n, 16);
                    r=Integer.toBinaryString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter HexaDecimal Number", Toast.LENGTH_SHORT).show();
                }

            }
        });

        octal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput5.getText().toString();
                    num=Integer.parseInt(n, 16);
                    r=Integer.toOctalString(num);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Octal Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

       /* back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Five_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_five_, menu);
        return true;
    }


}
