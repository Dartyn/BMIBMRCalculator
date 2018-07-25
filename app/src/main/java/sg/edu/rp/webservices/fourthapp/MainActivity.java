package sg.edu.rp.webservices.fourthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnm,btnf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnm = (Button)findViewById(R.id.btnm);
        btnf = (Button)findViewById(R.id.btnf);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im = new Intent(MainActivity.this,MaleActivity.class);
                startActivity(im);
            }

        });
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ife = new Intent(MainActivity.this,FemaleActivity.class);
                startActivity(ife);
            }
        });
    }
}
