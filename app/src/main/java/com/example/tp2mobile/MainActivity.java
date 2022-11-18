package com.example.tp2mobile;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class MainActivity extends Activity  implements View.OnClickListener{
    Button convert ;
    RadioButton eTOd,dTOe;
    EditText p;
    TextView t1,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert=findViewById(R.id.button);
        eTOd=findViewById(R.id.radio1);
        dTOe=findViewById(R.id.radio2);
        p=findViewById(R.id.edittext);
        t1=findViewById(R.id.textcovertir);
        r=findViewById(R.id.result);

        convert.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


        if (view.getId()==convert.getId()){
            String ch=p.getText().toString();
            double mon= Double.valueOf(ch);
            if (eTOd.isChecked())
                r.setText(""+mon/3);
            else
                r.setText(""+mon*3);
        }

    }
}