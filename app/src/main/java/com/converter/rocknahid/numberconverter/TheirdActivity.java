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

public class TheirdActivity extends AppCompatActivity {

    Button back_btn;

    TextView show, result;
    private Button bainaryButton,octalButton,hexalButton;
    EditText userInput;
    int num;
    int w;
    String n;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theird);
       // back_btn=(Button)findViewById(R.id.back_id);

        show=(TextView)findViewById(R.id.tv1);
        result=(TextView)findViewById(R.id.resultText);

        userInput=(EditText)findViewById(R.id.inputText);
        bainaryButton=(Button)findViewById(R.id.cButton);
        octalButton=(Button)findViewById(R.id.octalbtn);
        hexalButton=(Button)findViewById(R.id.hexalbtn);


        bainaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n);
                    r=resultb(num);

                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(),"Please Enter Bainary Number",Toast.LENGTH_SHORT).show();
                }



            }
        });

        octalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n,2);
                    r=Integer.toString(num, 8);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(),"Please Enter Bainary Number",Toast.LENGTH_SHORT).show();
                }


            }
        });

        hexalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n=userInput.getText().toString();
                    num=Integer.parseInt(n, 2);
                    r=Integer.toString(num, 16);
                    result.setText(r);

                } catch (Exception e) {
                    // TODO: handle exception
                    Toast.makeText(getApplicationContext(),"Please Enter Bainary Number",Toast.LENGTH_SHORT).show();
                }

            }
        });

       /* back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TheirdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });*/


    }

    public  String resultb(int a){

        String bai="";
        String z;
        z=Integer.toString(a);

        int s=Integer.parseInt(z,2);
        bai=Integer.toString(s);

        return bai;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_theird, menu);
        return true;
    }


}
