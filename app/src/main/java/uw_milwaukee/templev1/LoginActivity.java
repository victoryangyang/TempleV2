package uw_milwaukee.templev1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    AlertDialog.Builder alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login_button = (Button)findViewById(R.id.login_buttonLogin);

        final EditText login_editText = (EditText)findViewById(R.id.login_editTextUsername);
        final EditText password_editText = (EditText)findViewById(R.id.login_edittextPassword);

        alert = new AlertDialog.Builder(this);
        login_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                if(login_editText.getText().toString().equals(null) && password_editText.getText().toString().equals(null) ){
                    //Alerted since we have not added functionality of the printer yet.
                    alert.setMessage("Username and Password fields are empty! Please try again.").setNeutralButton("Okay",  new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                    alert.create();
                    alert.show();
                }
                else {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
