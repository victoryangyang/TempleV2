package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PRActivity extends AppCompatActivity {

    AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr);

        Button prEnter_button = (Button)findViewById(R.id.pr_buttonEnter);
        Button prBack_button = (Button)findViewById(R.id.pr_buttonBack);

        alert = new AlertDialog.Builder(this);

        prEnter_button.setOnClickListener(new View.OnClickListener(){
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

        prBack_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(PRActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
