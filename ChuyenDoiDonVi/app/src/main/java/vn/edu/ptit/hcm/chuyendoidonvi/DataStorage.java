package vn.edu.ptit.hcm.chuyendoidonvi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DataStorage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datastorage);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
