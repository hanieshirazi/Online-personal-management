package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    FirebaseAuth auth;
    EditText firstBox,lastBox,emailBox,passwordBox;
    Button sup,lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth=FirebaseAuth.getInstance();
        emailBox=findViewById(R.id.emailBox);
        passwordBox=findViewById(R.id.editTextTextPassword1);
        firstBox=findViewById(R.id.firstBox);
        lastBox=findViewById(R.id.lastBox);
        lin=findViewById(R.id.login);
        sup=findViewById(R.id.signup);
        sup.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){

                String fname,lname,pass,mail;
                fname = firstBox.getText().toString();
                lname = lastBox.getText().toString();
                mail = emailBox.getText().toString();
                pass = passwordBox.getText().toString();
                auth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>(){
                    @Override
                    public void onComplete (@NonNull Task<AuthResult> task){
                        if(task.isSuccessful()){
                            Toast.makeText(SignupActivity.this, "Account is Created!",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(SignupActivity.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            }
        });

    }
}