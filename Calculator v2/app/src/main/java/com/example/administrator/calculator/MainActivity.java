package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView GT, in, op;
    int dotCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GT = (TextView) findViewById(R.id.grandTotal);
        in = (TextView) findViewById(R.id.input);
        op = (TextView) findViewById(R.id.operation);
        dotCount=0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void delete(View view){
        if (in.getText().toString().length()==1){
            in.setText("0");
        }
        else {
            if (in.getText().toString().charAt(in.getText().toString().length()-1)=='.'){
                dotCount=0;
            }
            in.setText(in.getText().toString().substring(0,in.getText().toString().length()-1));
        }
    }

    public void append0(View view){
        if(!in.getText().toString().equals("0"))
            in.setText(in.getText().toString()+"0");
    }

    public void append1(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"1");
        }else {
            in.setText(in.getText().toString()+"1");
        }
    }

    public void append2(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"2");
        }else {
            in.setText(in.getText().toString()+"2");
        }
    }

    public void append3(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"3");
        }else {
            in.setText(in.getText().toString()+"3");
        }
    }

    public void append4(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"4");
        }else {
            in.setText(in.getText().toString()+"4");
        }
    }

    public void append5(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"5");
        }else {
            in.setText(in.getText().toString()+"5");
        }
    }

    public void append6(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"6");
        }else {
            in.setText(in.getText().toString()+"6");
        }
    }

    public void append7(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"7");
        }else {
            in.setText(in.getText().toString()+"7");
        }
    }

    public void append8(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"8");
        }else {
            in.setText(in.getText().toString()+"8");
        }
    }

    public void append9(View view){
        if (in.getText().toString().equals("0")){
            in.setText("");
            in.setText(in.getText().toString()+"9");
        }else {
            in.setText(in.getText().toString()+"9");
        }
    }

    public void appendDot(View view){
        if (dotCount==0) {
            in.setText(in.getText().toString() + ".");
            dotCount++;
        }
    }

    public void performOp(View view){
        switch (op.getText().toString()){
            case "":
                if(!in.getText().toString().equals("0"))
                    GT.setText(in.getText().toString());
                break;
            case "+":
                GT.setText(Float.toString(Float.parseFloat(GT.getText().toString()) + Float.parseFloat(in.getText().toString())));
                break;
            case "-":
                GT.setText(Float.toString(Float.parseFloat(GT.getText().toString()) - Float.parseFloat(in.getText().toString())));
                break;
            case "*":
                GT.setText(Float.toString(Float.parseFloat(GT.getText().toString()) * Float.parseFloat(in.getText().toString())));
                break;
            case "/":
                GT.setText(Float.toString(Float.parseFloat(GT.getText().toString()) / Float.parseFloat(in.getText().toString())));
                break;
        }
        in.setText("0");
        dotCount=0;
    }

    public void addOp(View view){
        performOp(view);
        op.setText("+");
    }

    public void subOp(View view){
        performOp(view);
        op.setText("-");
    }

    public void multOp(View view){
        performOp(view);
        op.setText("*");
    }

    public void divOp(View view){
        performOp(view);
        op.setText("/");
    }

    public void equals(View view){
        performOp(view);
        op.setText("");
    }

}
