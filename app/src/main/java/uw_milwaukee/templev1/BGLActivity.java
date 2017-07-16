package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BGLActivity extends AppCompatActivity {

    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgl);

        Button bglEnter_button = (Button)findViewById(R.id.bgl_buttonEnter);
        Button bglBack_button = (Button)findViewById(R.id.bgl_buttonBack);

        alert = new AlertDialog.Builder(this);

        bglEnter_button.setOnClickListener(new View.OnClickListener(){
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

        bglBack_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(BGLActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
