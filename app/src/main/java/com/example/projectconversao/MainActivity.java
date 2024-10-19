/*
 *@author:<Wallace Moura Machado de Oliveira;1110482413004>
 */

package com.example.projectconversao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtBits;
    TextView lblBytes, lblKB, lblMB, lblGB, lblTB;
    Button btnConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBits = findViewById(R.id.txtBits);
        lblBytes = findViewById(R.id.lblBytes);
        lblKB = findViewById(R.id.lblKB);
        lblMB = findViewById(R.id.lblMB);
        lblGB = findViewById(R.id.lblGB);
        lblTB = findViewById(R.id.lblTB);
        btnConverter = findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(p -> {
            long bits = Long.parseLong(txtBits.getText().toString());
            double bytes = bits / 8.0;
            double kb = bytes / 1024;
            double mb = kb / 1024;
            double gb = mb / 1024;
            double tb = gb / 1024;

            lblBytes.setText(String.format("Bytes: %.2f", bytes));
            lblKB.setText(String.format("KB: %.2f", kb));
            lblMB.setText(String.format("MB: %.2f", mb));
            lblGB.setText(String.format("GB: %.2f", gb));
            lblTB.setText(String.format("TB: %.2f", tb));
        });
    }
}