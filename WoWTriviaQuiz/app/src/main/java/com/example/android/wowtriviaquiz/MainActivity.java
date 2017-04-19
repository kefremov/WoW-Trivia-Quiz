package com.example.android.wowtriviaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int count = 0;

    public void submit(View v) {

        CheckBox animalsCB = (CheckBox) findViewById(R.id.animals);
        boolean isAnimals = animalsCB.isChecked();
        CheckBox bearCB = (CheckBox) findViewById(R.id.bear);
        boolean isBear = bearCB.isChecked();
        if (isAnimals && isBear)
            count++;

        RadioButton yesRB = (RadioButton) findViewById(R.id.yes);
        boolean isYes = yesRB.isChecked();
        if (isYes)
            count++;

        EditText hoarsET = (EditText) findViewById(R.id.hoars);
        String isHoars = hoarsET.getText().toString();
        if (isHoars.equals("Mellin"))
            count++;

        RadioButton alamoRB = (RadioButton) findViewById(R.id.alamo);
        boolean isAlamo = alamoRB.isChecked();
        if (isAlamo)
            count++;

        EditText leeroyET = (EditText) findViewById(R.id.leeroy);
        String isLeeroy = leeroyET.getText().toString();
        if (isLeeroy.equals("Jenkins!"))
            count++;

        RadioButton norrisRB = (RadioButton) findViewById(R.id.norris);
        boolean isNorris = norrisRB.isChecked();
        if (isNorris)
            count++;

        RadioButton shirtRB = (RadioButton) findViewById(R.id.shirt);
        boolean isShirt = shirtRB.isChecked();
        if (isShirt)
            count++;

        RadioButton ramboRB = (RadioButton) findViewById(R.id.rambo);
        boolean isRambo = ramboRB.isChecked();
        if (isRambo)
            count++;

        EditText barrensET = (EditText) findViewById(R.id.barrens);
        String isBarrens = barrensET.getText().toString();
        if (isBarrens.equals("Barrens chat"))
            count++;

        RadioButton kerriganRB = (RadioButton) findViewById(R.id.kerrigan);
        boolean isKerrigan = kerriganRB.isChecked();
        if (isKerrigan)
            count++;

        Toast.makeText(getApplicationContext(), "You got " + count + " out of 10 correct.", Toast.LENGTH_LONG).show();

        count=0;
    }

    public void reset(View v) {

        count=0;

        CheckBox animalsCB = (CheckBox) findViewById(R.id.animals);
        CheckBox windfurryCB = (CheckBox) findViewById(R.id.windfurry);
        CheckBox devilHorseCB = (CheckBox) findViewById(R.id.devil_horse);
        CheckBox mainGodCB = (CheckBox) findViewById(R.id.main_god);
        CheckBox bearCB = (CheckBox) findViewById(R.id.bear);
        RadioGroup kralnorRG = (RadioGroup) findViewById(R.id.kralnor);
        RadioGroup druidRG = (RadioGroup) findViewById(R.id.druid);
        RadioGroup saurfangRG = (RadioGroup) findViewById(R.id.saurfang);
        RadioGroup andorovRG = (RadioGroup) findViewById(R.id.andorov);
        RadioGroup keeshanRG = (RadioGroup) findViewById(R.id.keeshan);
        RadioGroup shredderRG = (RadioGroup) findViewById(R.id.shredder);

        animalsCB.setChecked(false);
        windfurryCB.setChecked(false);
        devilHorseCB.setChecked(false);
        mainGodCB.setChecked(false);
        bearCB.setChecked(false);
        kralnorRG.clearCheck();
        druidRG.clearCheck();
        saurfangRG.clearCheck();
        andorovRG.clearCheck();
        keeshanRG.clearCheck();
        shredderRG.clearCheck();

        EditText hoarsET = (EditText) findViewById(R.id.hoars);
        EditText leeroyET = (EditText) findViewById(R.id.leeroy);
        EditText barrensET = (EditText) findViewById(R.id.barrens);
        hoarsET.setText(null);
        leeroyET.setText(null);
        barrensET.setText(null);
    }
}
