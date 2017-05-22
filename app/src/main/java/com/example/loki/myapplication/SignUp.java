package com.example.loki.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Loki on 5/21/2017.
 */

public class SignUp extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onSignUpClick(View v) {
        if(v.getId() == R.id.signupButtonRegister) {
            EditText name = (EditText) findViewById(R.id.signupName);
            EditText email = (EditText) findViewById(R.id.signupEmail);
            EditText username = (EditText) findViewById(R.id.signupUsername);
            EditText pass1 = (EditText) findViewById(R.id.signupPassword);
            EditText pass2 = (EditText) findViewById(R.id.signupPassword2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String usernamestr = username.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)) {
                //pop message
                Toast pass = Toast.makeText(SignUp.this, "Password don't match!", Toast.LENGTH_SHORT);
                pass.show();

            }
            else
            {
                //insert the details in database
                contact c = new contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setusernameame(usernamestr);
                c.setpass1(pass1str);
                c.setpass2(pass2str);

                helper.insertContact(c);
            }
        }

    }



}
