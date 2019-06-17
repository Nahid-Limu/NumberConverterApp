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

public class SecondActivity extends AppCompatActivity {
    Button back_btn;

    TextView show, result;
    private Button convertButton,octalButton,hexalButton;
    EditText userInput;
    int num;
    double d;
    String n;
    String r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       // back_btn=(Button)findViewById(R.id.back_id);

        show=(TextView)findViewById(R.id.tv1);
        result=(TextView)findViewById(R.id.resultText);

        userInput=(EditText)findViewById(R.id.inputText);

        convertButton=(Button)findViewById(R.id.cButton);
        octalButton=(Button)findViewById(R.id.octalbtn);
        hexalButton=(Button)findViewById(R.id.hexalbtn);


        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n);
                    r=resultb(num);
                    d=Double.parseDouble(r);

                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Decimal Number", Toast.LENGTH_SHORT).show();
                }


            }
        });

        octalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n);
                    r=resulto(num);

                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Decimal Number", Toast.LENGTH_SHORT).show();
                }



            }
        });

        hexalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n);
                    r=resulth(num);

                    result.setText(r);
                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(), "Please Enter Decimal Number", Toast.LENGTH_SHORT).show();
                }

            }
        });


        /*back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });*/



    }
    public String resultb(int a){

        String bai="";

        bai=Integer.toBinaryString(a);

        return bai;
    }

    public String resulto(int a){

        String oct="";

        oct=Integer.toOctalString(a);

        return oct;
    }


    public String resulth(int a){

        String hex="";

        hex=Integer.toHexString(a);

        return hex;
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }


}
