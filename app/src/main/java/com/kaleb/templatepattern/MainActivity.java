package com.kaleb.templatepattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Warrior warrior = new Warrior();

    Archer archer = new Archer();

    Tamer tamer = new Tamer();

    Healer healer = new Healer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tamer.characterCreated();
    }
}
