package com.hacktheworld.beerfinalprototype;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "Register.php";
    private Map<String, String> params;

    public RegisterRequest(int idNUmber, String name, String surname, String gender ,String username, String email, String cell, int height, int weight, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
		params.put("idNUmber", idNUmber + "");
        params.put("name", name);
		params.put("surname", surname);
		params.put("gender", gender);
        params.put("username", username);
		params.put("cell", cell);
        params.put("height", height + "");
		params.put("weight", weight + "");
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
