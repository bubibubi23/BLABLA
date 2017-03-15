package com.example.blahblah.blabla;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class abc extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{


    private EditText edtNumber;
    private TextView tvResult;

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
        initWidget();
        setEventClickViews();
        setLongEventClickView();

    }

    public void initWidget(){
        edtNumber = (EditText) findViewById(R.id.edt_input);
        tvResult = (TextView) findViewById(R.id.tv_result);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnPoint = (Button) findViewById(R.id.btnpoint);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
    }


    public  void setEventClickViews(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
    }

    public void setLongEventClickView(){
        btnClear.setOnLongClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                edtNumber.append("0");
                break;
            case R.id.btn1:
                edtNumber.append("1");
                break;
            case R.id.btn2:
                edtNumber.append("2");
                break;
            case R.id.btn3:
                edtNumber.append("3");
                break;
            case R.id.btn4:
                edtNumber.append("4");
                break;
            case R.id.btn5:
                edtNumber.append("5");
                break;
            case R.id.btn6:
                edtNumber.append("6");
                break;
            case R.id.btn7:
                edtNumber.append("7");
                break;
            case R.id.btn8:
                edtNumber.append("8");
                break;
            case R.id.btn9:
                edtNumber.append("9");
                break;
            case R.id.btnpoint:
                edtNumber.append(".");
                break;
            case R.id.btnResult:

                break;
            case R.id.btnClear:
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edtNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
                break;
            case R.id.btnCong:
                edtNumber.append("+");
                break;
            case R.id.btnTru:
                edtNumber.append("-");
                break;
            case R.id.btnNhan:
                edtNumber.append("x");
                break;
            case R.id.btnChia:
                edtNumber.append("/");
                break;
        }

    }

    @Override
    public boolean onLongClick(View v) {
        edtNumber.setText("");
        return true;
    }
}
