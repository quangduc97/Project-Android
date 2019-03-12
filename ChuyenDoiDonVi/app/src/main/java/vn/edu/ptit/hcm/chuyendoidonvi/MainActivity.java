package vn.edu.ptit.hcm.chuyendoidonvi;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*setContentView(R.layout.temperature);*/
        Spinner spinner = findViewById(R.id.weightList);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout tem = findViewById(R.id.tem);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tem.class);
                startActivity(intent);
            }
        });

    }
}
