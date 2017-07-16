package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QueryActivity extends AppCompatActivity {

    AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        Button queryBack_button = (Button)findViewById(R.id.query_buttonBack);
        Button querySearch_button = (Button)findViewById(R.id.query_buttonSearch);

        alert = new AlertDialog.Builder(this);

        querySearch_button.setOnClickListener(new View.OnClickListener(){
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

        queryBack_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //Intent intent = new Intent(BGLActivity.this, BGLActivity.class);
                //startActivity(intent);
                Intent intent = new Intent(QueryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
