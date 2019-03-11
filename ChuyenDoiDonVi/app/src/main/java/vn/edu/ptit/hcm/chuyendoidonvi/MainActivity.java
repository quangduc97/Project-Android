package vn.edu.ptit.hcm.chuyendoidonvi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        setContentView(R.layout.temperature);
        Spinner spinner = findViewById(R.id.weightList);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}
