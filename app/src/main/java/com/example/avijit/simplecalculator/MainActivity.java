package com.example.avijit.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclear,bresult,bdiv,bplus,bmin,bpoint,bmult,erase;
    TextView display;
    String s1="";
    int check=0;
    String s2="",s3="",result;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.text1);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        bresult=(Button)findViewById(R.id.bresult);
        bpoint=(Button)findViewById(R.id.bpoint);
        bdiv=(Button)findViewById(R.id.bdiv);
        bplus=(Button)findViewById(R.id.bplus);
        bmin=(Button)findViewById(R.id.bmin);
        bmult=(Button)findViewById(R.id.bmult);
        bclear=(Button)findViewById(R.id.bclear);
        erase=(Button)findViewById(R.id.erase);
     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             s1=s1+"1";
             display.setText(s1);
             if(check==1 || check==2|| check==3|| check==4){
                 s2=s2+"1";
                 num1=Integer.valueOf(s2);
             }
             else
             {
                 s3=s3+"1";
                 num2=Integer.valueOf(s3);
             }

         }
     });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"2";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"2";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"2";
                    num2=Integer.valueOf(s3);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"3";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"3";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"3";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"4";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"4";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"4";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"5";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"5";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"5";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"6";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"6";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"6";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"7";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"7";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"7";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"8";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"8";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"8";
                    num2=Integer.valueOf(s3);
                }
            }
        }); b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"9";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"9";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"9";
                    num2=Integer.valueOf(s3);
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"0";
                display.setText(s1);
                if(check==1 || check==2|| check==3|| check==4){
                    s2=s2+"0";
                    num1=Integer.valueOf(s2);
                }
                else
                {
                    s3=s3+"0";
                    num2=Integer.valueOf(s3);
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"+";
                check=1;
                display.setText(s1);
            }
        });
        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"-";
                check=2;
                display.setText(s1);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"/";
                check=4;
                display.setText(s1);
            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=s1+"x";
                check=3;
                display.setText(s1);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1="";
                check=0;
                s2="";
                s3="";
                display.setText("0");
            }
        });
        bresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (check){
                    case 1: result=String.valueOf(num1+num2);
                            display.setText(result);
                            break;
                    case 2: result=String.valueOf(num2-num1);
                        display.setText(result);
                        break;
                    case 3: result=String.valueOf(num1*num2);
                        display.setText(result);
                        break;
                    case 4: result=String.valueOf(num2/num1);
                        display.setText(result);
                        break;
                }
            }
        });
erase.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        s1=s1.substring(0,s1.length()-1);
        display.setText(s1);
    }
});
    }

}
