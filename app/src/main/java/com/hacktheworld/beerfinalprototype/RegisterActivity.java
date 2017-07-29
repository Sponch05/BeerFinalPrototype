package com.hacktheworld.beerfinalprototype;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etID_Number = (EditText) findViewById(R.id.etID_Number);
		final EditText etName = (EditText) findViewById(R.id.etName);
		final EditText etSurname = (EditText) findViewById(R.id.etSurname);
		final EditText etGender = (EditText) findViewById(R.id.etGender);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
		final EditText etCell = (EditText) findViewById(R.id.etCell);
		final EditText etHeight = (EditText) findViewById(R.id.etHeight);
		final EditText etWeight = (EditText) findViewById(R.id.etWeight);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bRegister = (Button) findViewById(R.id.bntRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
				final int idNumber = Integer.parseInt(etID_Number.getText().toString());
                final String name = etName.getText().toString();
				final String surname = etSurname.getText().toString();
				final String gender = etGender.getText().toString();
                final String username = etUsername.getText().toString();
                final String email = etEmail.getText().toString();
				final String cell = etCell.getText().toString();
                final int height = Integer.parseInt(etHeight.getText().toString());
				final int weight = Integer.parseInt(etWeight.getText().toString());
                final String password = etPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(idNumber, name, surname, gender, username, email, cell, height, weight, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });



    }
}
