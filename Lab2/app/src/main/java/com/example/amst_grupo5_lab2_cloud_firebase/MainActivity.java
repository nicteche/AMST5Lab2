package com.example.amst_grupo5_lab2_cloud_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    GoogleSignInClient mGoogleSignInClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.D
                EFAULT_SIGN_IN)
        requestIdToken(getString(R.string.default_web_client_id))
        requestEmail()
        build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

}