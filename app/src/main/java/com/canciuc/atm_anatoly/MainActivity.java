package com.canciuc.atm_anatoly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void butonext(View v) {

        int B200 = 3;
        int B100 = 2;
        int B50 = 4;
        int B20 = 3;
        int B10 = 49;
        int B5 = 23;
        int B1 = 10;
        int f200 = 0;
        int f100 = 0;
        int f50 = 0;
        int f20 = 0;
        int f10 = 0;
        int f5 = 0;
        int f1 = 0;

        int sumadisponibila = B200 * 200 + B100 * 100 + B50 * 50 + B20 * 20 + B10 * 10 + B5 * 5 + B1;

        final EditText suma_in = (EditText) findViewById(R.id.editText);
        int sumext = Integer.parseInt(suma_in.getText().toString());

        TextView rasp = (TextView) findViewById(R.id.textView);

        String display = "";




        if (sumext > sumadisponibila) {

            display = "Introduceti o alta suma, Nu sunt suficienti bani in bancomat!";

        } else {
            do {
                if (sumext >= 200 && f200 < B200) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 200;
                    f200++;
                } else if (sumext >= 100 && f100 < B100) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 100;
                    f100++;
                } else if (sumext >= 50 && f50 < B50) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 50;
                    f50++;
                } else if (sumext >= 20 && f20 < B20) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 20;
                    f20++;
                } else if (sumext >= 10 && f10 < B10) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 10;
                    f10++;
                } else if (sumext >= 5 && f5 < B5) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 5;
                    f5++;
                } else if (sumext >= 1 && f1 < B1) {
                    //restul = suma_extragere % 200;
                    sumext = sumext - 1;
                    f1++;
                }
            }
            while (sumext != 0);

            int nr_banc = f1 + f5 + f10 + f20 + f50 + f100 + f200;


            if (nr_banc != 0) {
                display = "\nPrimiti Banii:\nNr total de bancnote: " + nr_banc;
            }
            if (f200 != 0) {
                display += "\n200 MDL " + f200;
                // System.out.println("200 MDL " + f200);
            }
            if (f100 != 0) {
                display += "\n100 MDL " + f100;
                //System.out.println("100 MDL " + f100);
            }
            if (f50 != 0) {
                display += "\n50 MDL  " + f50;
                //System.out.println("50 MDL  " + f50);
            }
            if (f20 != 0) {
                display += "\n20 MDL  " + f20;
                //System.out.println("20 MDL  " + f20);
            }
            if (f10 != 0) {
                display += "\n10 MDL  " + f10;
                //System.out.println("10 MDL  " + f10);
            }
            if (f5 != 0) {
                display += "\n5 MDL   " + f5;
                // System.out.println("5 MDL   " + f5);
            }
            if (f1 != 0) {
                display += "\n1 MDL   " + f1;
                //System.out.println("1 MDL   " + f1);
            }
        }
        rasp.clearComposingText();
        rasp.setText(display);
    }

}




