package ru.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText password;
    EditText username;
    Button enterbtn;
    SharedPreferences mSharedPref;
    final String USERNAME = "Логин";
    final String PASSWORD = "Пароль";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = findViewById(R.id.password);
        username = (EditText) findViewById(R.id.username);
        enterbtn = (Button) findViewById(R.id.enterbtn);

        mSharedPref = getPreferences (MODE_PRIVATE);
        boolean isAuth = mSharedPref.getBoolean("isAuth", false);
        if (isAuth){

        }
        else{

        }
    }
    public void save(View view){
        SharedPreferences.Editor mEditor = moveSharedPref.edit();
        mEditor.putString(USERNAME, username.getText().toString());
        mEditor.putString(PASSWORD, password.getText().toString());
        Toast.makeText(this, "Данные сохранены", Toast.LENGTH_SHORT).show();
    }

}