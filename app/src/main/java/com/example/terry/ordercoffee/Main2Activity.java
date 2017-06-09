package com.example.terry.ordercoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
int Quantity=0;
    TextView show;
    CheckBox hot_chocoCheckBox;
    CheckBox cappaCheckBox;
    CheckBox teaCheckBox;
    CheckBox whiteCheckBox;
    TextView total;
    Button Submit;
    Button Exit;

    final double cappacino = 25;
    final double hot_chocolate = 30;
    final double whitecoffee = 20;
    final double tea = 15;

    private static double totals = 0;
    private static double amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        show = (TextView)findViewById(R.id.txtshow);
        hot_chocoCheckBox = (CheckBox) findViewById(R.id.checkboxhotchocolate);
        cappaCheckBox = (CheckBox) findViewById(R.id.checkboxcappucino);
        teaCheckBox = (CheckBox) findViewById(R.id.checkboxtea);
        whiteCheckBox = (CheckBox) findViewById(R.id.checkboxwhite);
        Submit = (Button) findViewById(R.id.btnsubmit);
        Exit=(Button) findViewById(R.id.btnexit);
        total=(TextView)findViewById(R.id.txttotal);

    }

    public void Increment(View v){
        Quantity=Quantity+1;
        show.setText(Integer.toString(Quantity));
    }

    public void Decrement(View v) {
        Quantity=Quantity-1;
        if (Quantity < 0) {
            Quantity = 0;
        } else {
            show.setText(Integer.toString(Quantity));
        }
    }

    public  void Cappa (View view) {
        if (cappaCheckBox.isChecked()) {

            amount =  cappacino;
            amount=amount * Quantity;
        }
        else if (cappaCheckBox.isChecked() == false) {
            amount=0;

            Toast.makeText(Main2Activity.this, " " + amount, Toast.LENGTH_SHORT).show();
        }
    }
    public void Tea (View view) {
        if (teaCheckBox.isChecked()) {
            amount =  tea * Quantity;


        }
        else if (teaCheckBox.isChecked() == false) {
              amount = 0;
            Toast.makeText(Main2Activity.this, " " + amount, Toast.LENGTH_SHORT).show();
        }

    }
    public void White ( View view) {
        if (whiteCheckBox.isChecked()) {
            amount =  whitecoffee;
            amount=amount * Quantity;

        } else if (whiteCheckBox.isChecked() == false) {
           amount =0;
            Toast.makeText(Main2Activity.this, " " + amount, Toast.LENGTH_SHORT).show();

        }
    }
    public void Choco(View view) {
        if (hot_chocoCheckBox.isChecked()) {
            amount =  hot_chocolate;
            amount=amount * Quantity;

        } else if (hot_chocoCheckBox.isChecked() == false) {
            amount = 0;
            Toast.makeText(Main2Activity.this, " " + amount, Toast.LENGTH_SHORT).show();
        }
    }
    public void Submit (View view){
        TextView total=(TextView)findViewById(R.id.txttotal);
        totals=amount;

        total.setText("R"+ String.valueOf(totals).toString()) ;
    }

    public void Exit (View view) {
        teaCheckBox.setChecked(false);
        cappaCheckBox.setChecked(false);
        whiteCheckBox.setChecked(false);
        hot_chocoCheckBox.setChecked(false);
        total.setText("");
    }

}




