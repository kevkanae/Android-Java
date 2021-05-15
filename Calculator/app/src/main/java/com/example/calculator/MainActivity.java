package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot;
    Button B_add, B_subtract, B_multiply, B_divide, B_clear, B_eqs;
    double num1 = 0,num2 = 0,res = 0;
    TextView txt;
    boolean add = false,sub = false,mul= false,div= false,exp= false,mod= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button) findViewById(R.id.zero);
        b1=(Button) findViewById(R.id.one);
        b2=(Button) findViewById(R.id.two);
        b3=(Button) findViewById(R.id.three);
        b4=(Button) findViewById(R.id.four);
        b5=(Button) findViewById(R.id.five);
        b6=(Button) findViewById(R.id.six);
        b7=(Button) findViewById(R.id.seven);
        b8=(Button) findViewById(R.id.eight);
        b9=(Button) findViewById(R.id.nine);
        B_clear =(Button) findViewById(R.id.clr);
        dot = (Button) findViewById(R.id.dot);
        txt = findViewById(R.id.res);
        B_add = findViewById(R.id.plus);
        B_subtract = findViewById(R.id.min);
        B_multiply = findViewById(R.id.mult);
        B_divide = findViewById(R.id.divide);
        B_eqs = findViewById(R.id.eqs);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"9");
            }
        });
        B_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString() + ".");

            }
        });

        B_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    add=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });
        B_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    sub=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });
        B_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    mul=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");

                }
            }
        });
        B_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt.getText().toString()==""){
                    txt.setText("");
                }else {
                    div=true;
                    num1 = Double.parseDouble(txt.getText().toString());
                    txt.setText("");
                }
            }
        });


        B_eqs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt.getText().toString()==""){
                    txt.setText("");
                }
                else {
                    num2 = Double.parseDouble(txt.getText().toString());
                    if(add==true){
                        res = num1+num2;
                        txt.setText(Double.toString(res));
                        add=false;
                    }else if(sub==true){
                        res = num1-num2;
                        txt.setText(Double.toString(res));
                        sub=false;
                    }else if(mul==true){
                        System.out.println("mul");
                        res = num1*num2;
                        txt.setText(Double.toString(res));
                        mul=false;
                    }else if(div==true){
                        if(num2==0){
                            txt.setText("Error");
                        }
                        else {
                            res = num1/num2;
                            txt.setText(Double.toString(res));
                            div=false;
                        }

                    }else if(mod==true){
                        if(num2==0){
                            txt.setText("Error");
                        }
                        else {
                            res = num1%num2;
                            txt.setText(Double.toString(res));
                            mod=false;
                        }
                    }else if(exp==true){
                        if(num2==0){
                            txt.setText("Error");
                        }
                        else {
                            res = Math.pow(num1,num2);
                            txt.setText(Double.toString(res));
                            exp=false;
                        }

                    }
                }
            }
        });




    }
}