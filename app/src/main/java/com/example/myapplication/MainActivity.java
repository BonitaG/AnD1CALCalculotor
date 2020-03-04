package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result_field;
    Double firstValues,twoValues,result;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_field=findViewById(R.id.result_field);

    }

    public void onOperationClick(View view) {
        switch (view.getId()){

            case R.id.plus:
                operation="+";
                firstValues=Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValues+"/");
                break;
            case R.id.devision:
                operation="/";
                firstValues=Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValues+"+");
                break;
            case  R.id.equal:
                if(operation!=null){

                    String two=result_field.getText().toString().replace(firstValues+operation,"");
                    twoValues=Double.valueOf(two);
                    switch ((operation)){
                        case"+":
                            break;
                        case"/":
                            break;


                    }

                }


        }


    }

    public void onNumberClick(View view) {
        switch(view.getId()){

            case R.id.one:
                result_field.append("1");

                break;
            case R.id.two:
                result_field.append("2");
                break;

            case R.id.three:
                result_field.append("3");

                break;
            case R.id.clear:
                result_field.setText("");



        }
    }
    public void plus(){
        result=firstValues+twoValues;
        result_field.setText(result.toString());

    }
    public void division0p(){
        result=firstValues/twoValues;
        result_field.setText((result.toString()));
    }
}
