package com.example.joaquin.primerainterfaz;

import android.service.autofill.FillEventHistory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int buenas=0;
        RadioGroup rgMascara= (RadioGroup) findViewById(R.id.rgMascara);
        RadioGroup rgRadio =(RadioGroup) findViewById(R.id.rgRadio);
        RadioGroup rgDimensiones =(RadioGroup) findViewById(R.id.rgDimensiones);
        RadioGroup rgFecha =(RadioGroup) findViewById(R.id.rgFecha);
        RadioGroup rgTiempo =(RadioGroup) findViewById(R.id.rgTiempo);
        Spinner sValor = (Spinner) findViewById(R.id.sId);
        if(rgMascara.getCheckedRadioButtonId()==R.id.rbinputType)
            buenas++;
        if(rgRadio.getCheckedRadioButtonId()==R.id.rbAgrupan)
            buenas++;
        if(rgDimensiones.getCheckedRadioButtonId()==R.id.rbAll)
            buenas++;
        if(rgFecha.getCheckedRadioButtonId()==R.id.rbDatePicker)
            buenas++;
        if(rgTiempo.getCheckedRadioButtonId()==R.id.rbTimePicker)
            buenas++;
        if(sValor.getSelectedItemPosition()==0)
            buenas++;

        Toast.makeText(this,buenas+" Respuestas correctas de 6" , Toast.LENGTH_SHORT).show();
    }
}
