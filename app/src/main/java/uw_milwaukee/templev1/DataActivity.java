package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataActivity extends AppCompatActivity {
AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Button data_buttonGraph = (Button)findViewById(R.id.data_buttonGraph);
        Button data_buttonStats = (Button)findViewById(R.id.data_buttonStats);
        Button dataBack_button = (Button)findViewById(R.id.data_buttonBack);

        alert = new AlertDialog.Builder(this);

        data_buttonGraph.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //Intent intent = new Intent(BGLActivity.this, BGLActivity.class);
                //startActivity(intent);

                alert.setMessage("Will be available in later versions of Temple.").setNeutralButton("Okay",  new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.create();
                alert.show();
            }
        });

        data_buttonStats.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //Intent intent = new Intent(BGLActivity.this, BGLActivity.class);
                //startActivity(intent);

                alert.setMessage("Will be available in later versions of Temple.").setNeutralButton("Okay",  new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alert.create();
                alert.show();
            }
        });


        dataBack_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(DataActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
