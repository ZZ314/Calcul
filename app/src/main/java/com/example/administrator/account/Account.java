package com.example.administrator.account;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Account extends AppCompatActivity implements View.OnClickListener{
    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button but_point;//小数点
    private Button but_equal;//等于
    private Button but_minus;//减
    private Button but_pluse;//加
    private Button but_multiply;//乘
    private Button but_divide;//除
    private Button but_clear;//清除
    private Button but_del;//取消
    private Button button_trn;
    private TextView tvResult;
    //声明两个参数，接受tvResult前后的值
    double num1=0,num2=0;
    double Result=0;//计算结果
    int op=0;//判断操作数
    boolean isClickEqu=false;//判断是否按了=按钮
    String mystr;
    String str;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
//        DisplayMetrics displayMetrics=new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        Constant.displayWidth=displayMetrics.widthPixels;
//        Constant.displayHeight=displayMetrics.heightPixels;
//        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
//                (int)(Constant.displayWidth*0.25f+0.5f),(int)(Constant.displayHeight*0.1f+0.5f));
//        but0.setLayoutParams(params);
//        but_point.setLayoutParams(params);
//        but_equal.setLayoutParams(params);
//        but_pluse.setLayoutParams(params);
//        but1.setLayoutParams(params);
//        but2.setLayoutParams(params);
//        but3.setLayoutParams(params);
//        but_minus.setLayoutParams(params);
//        but4.setLayoutParams(params);
//        but5.setLayoutParams(params);
//        but6.setLayoutParams(params);
//        but_multiply.setLayoutParams(params);
//        but7.setLayoutParams(params);
//        but8.setLayoutParams(params);
//        but9.setLayoutParams(params);
//        but_divide.setLayoutParams(params);
//        but_clear.setLayoutParams(params);
//        but_del.setLayoutParams(params);
//        button_trn.setLayoutParams(params);
//        LinearLayout.LayoutParams params2=new LinearLayout.LayoutParams(
//                ViewGroup.LayoutParams.FILL_PARENT,(int)(Constant.displayHeight*0.4f+0.5f));
//        tvResult.setLayoutParams(params2);
        but0=(Button)findViewById(R.id.button0);
        but1=(Button)findViewById(R.id.button1);
        but2=(Button)findViewById(R.id.button2);
        but3=(Button)findViewById(R.id.button3);
        but4=(Button)findViewById(R.id.button4);
        but5=(Button)findViewById(R.id.button5);
        but6=(Button)findViewById(R.id.button6);
        but7=(Button)findViewById(R.id.button7);
        but8=(Button)findViewById(R.id.button8);
        but9=(Button)findViewById(R.id.button9);
        but_point=(Button)findViewById(R.id.button_point);
        but_equal=(Button)findViewById(R.id.button_equal);
        but_minus=(Button)findViewById(R.id.button_minus);
        but_pluse=(Button)findViewById(R.id.button_pluse);
        but_multiply=(Button)findViewById(R.id.button_multiply);
        but_divide=(Button)findViewById(R.id.button_divide);
        but_del=(Button)findViewById(R.id.button_del);
        but_clear=(Button)findViewById(R.id.button_clear);
        button_trn=(Button)findViewById(R.id.button_trn);
        tvResult=(TextView) findViewById(R.id.text);

        but0.setOnClickListener(this);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
        but_point.setOnClickListener(this);
        but_equal.setOnClickListener(this);
        but_clear.setOnClickListener(this);
        but_del.setOnClickListener(this);
        but_pluse.setOnClickListener(this);
        but_minus.setOnClickListener(this);
        but_multiply.setOnClickListener(this);
        but_divide.setOnClickListener(this);
        button_trn.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_del:
                String str=tvResult.getText().toString();
                try{
                    tvResult.setText(str.substring(0,str.length()-1));
                }catch (Exception e)
                {
                    tvResult.setText(null);
                }
                break;
            case R.id.button_clear:
                tvResult.setText(null);
                break;
            case R.id.button0:
            case R.id.button1:
            case R.id.button2:
            case R.id.button3:
            case R.id.button4:
            case R.id.button5:
            case R.id.button6:
            case R.id.button7:
            case R.id.button8:
            case R.id.button9:
            case R.id.button_point:
                mystr=tvResult.getText().toString();
                switch (v.getId())
                {
                    case R.id.button0:
                        mystr+="0";
                        break;
                    case R.id.button1:
                        mystr+="1";
                        break;
                    case R.id.button2:
                        mystr+="2";
                        break;
                    case R.id.button3:
                        mystr+="3";
                        break;
                    case R.id.button4:
                        mystr+="4";
                        break;
                    case R.id.button5:
                        mystr+="5";
                        break;
                    case R.id.button6:
                        mystr+="6";
                        break;
                    case R.id.button7:
                        mystr+="7";
                        break;
                    case R.id.button8:
                        mystr+="8";
                        break;
                    case R.id.button9:
                        mystr+="9";
                        break;
                    case R.id.button_point:
                        mystr=tvResult.getText().toString();
                        if(mystr.equals(null)) return;
                        mystr+=".";
                        break;
                    default:break;
                }
                if(isClickEqu)
                {
                    op=0;
                    isClickEqu=false;
                }
                isClickEqu=false;
                tvResult.setText(mystr);
                break;
            case R.id.button_pluse:
            case R.id.button_minus:
            case R.id.button_multiply:
            case R.id.button_divide:
                str= tvResult.getText().toString();
                if(str.equals(null)) return;
                num1=Double.valueOf(str);
                tvResult.setText(null);
                switch (v.getId())
                {
                    case R.id.button_pluse:
                        op=1;
                        break;
                    case R.id.button_minus:
                        op=2;
                        break;
                    case R.id.button_multiply:
                        op=3;
                        break;
                    case R.id.button_divide:
                        op=4;
                        break;
                    default:break;
                }
                isClickEqu=false;
                break;
            case R.id.button_equal:
                String strequal=tvResult.getText().toString();
                if(strequal.equals(null)) return;
                num2=Double.valueOf(strequal);
                tvResult.setText(null);
                switch(op)
                {
                    case 0:
                        Result=num2;
                        break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                tvResult.setText(String.valueOf(Result));
                isClickEqu=true;
                break;
            case R.id.button_trn:
                String strtrn=tvResult.getText().toString();
                if(strtrn.equals(null)) return;
                double num=Double.valueOf(strtrn);
                tvResult.setText(null);
                int[] m=new int[100];
                int i=0;
                String result=tvResult.getText().toString();
                if(num-(int)num==0)
                {
                    int n=(int)num;
                    while(n!=0) {
                        int r;
                        r=n%2;
                        n=n/2;
                        m[i]=r;
                        i++;
                    }
                    for(int j=i-1;j>=0;j--)
                    {
                        result+=String.valueOf(m[j]);
                    }
                    tvResult.setText(result);
                }
//                else
//                {
//                    int n=(int)num;
//                   while(n!=0){
//                        int r;
//                        r=n%2;
//                        n=n/2;
//                        m[i]=r;
//                        i++;
//                    }
//                    for(int j=i-1;j>=0;j--)
//                        result+=String.valueOf(m[j]);
//                    int a=i;
//                    result+=".";
//                    double s=num-(int)num;
//                    double x=0.0;
//                    while(x!=1) {
//                        x=s*2;
//                        if(x>1)
//                        {m[i]=1;s=x-1;}
//                        else
//                        { m[i]=0;s=x;}
//                        i++;
//                    }
//                    for(int k=i-1;k>=i-a;k--)
//                        result+=String.valueOf(m[k]);
//                    tvResult.setText(result);
//                }
                break;
            default:
                break;
        }
    }
}
