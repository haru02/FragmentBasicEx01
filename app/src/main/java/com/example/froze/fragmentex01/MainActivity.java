package com.example.froze.fragmentex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FagmentOne.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String string) {
        FragmentTwo f2 = (FragmentTwo)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        f2.updateInfo(string);
    }
}
