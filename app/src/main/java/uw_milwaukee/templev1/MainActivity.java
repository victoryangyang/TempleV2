package uw_milwaukee.templev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        Button bgl_button = (Button)findViewById(R.id.main_buttonBGL);
        Button da_button = (Button)findViewById(R.id.main_buttonDA);
        Button ea_button = (Button)findViewById(R.id.main_buttonEA);
        Button med_button = (Button)findViewById(R.id.main_buttonMed);
        Button pr_button = (Button)findViewById(R.id.main_buttonPR);
        Button exit_button = (Button)findViewById(R.id.main_buttonExit);
        Button data_button = (Button)findViewById(R.id.main_buttonData);
        Button query_button = (Button)findViewById(R.id.main_buttonQuery);

        bgl_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, BGLActivity.class);
                startActivity(intent);
            }
        });

        da_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DAActivity.class);
                startActivity(intent);
            }
        });

        ea_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, EAActivity.class);
                startActivity(intent);
            }
        });

        med_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MedActivity.class);
                startActivity(intent);
            }
        });

        pr_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, PRActivity.class);
                startActivity(intent);
            }
        });

        data_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

        query_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, QueryActivity.class);
                startActivity(intent);
            }
        });
        exit_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });


    }
}
