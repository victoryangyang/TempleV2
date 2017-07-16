package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EAActivity extends AppCompatActivity {
    AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ea);

        Button eaEnter_button = (Button)findViewById(R.id.ea_buttonEnter);
        Button eaBack_button = (Button)findViewById(R.id.ea_buttonBack);

        alert = new AlertDialog.Builder(this);

        eaEnter_button.setOnClickListener(new View.OnClickListener(){
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

        eaBack_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(EAActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
