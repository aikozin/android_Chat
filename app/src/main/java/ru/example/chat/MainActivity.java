package ru.example.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);                                                 // Для удобства отлидки изменил активность с: activity_main

        //----------------------------------------------------------------------------------------------------------------------------------------------------------(open)
        CardView send_a_message = findViewById(R.id.send_a_message);
        RecyclerView chat_messages = findViewById(R.id.chat_messages);



        send_a_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText print_a_messages = findViewById(R.id.print_a_messages);
                SimpleDateFormat sdf = new SimpleDateFormat("'Date\n'dd-MM-yyyy '\n\nand\n\nTime\n'HH:mm:ss z");

                if(!print_a_messages.getText().toString().equals("")){

                    String messages = print_a_messages.getText().toString();                        //Chat\FireBase\Messages\Text   //Текст сообщения
                    String currentDateAndTime = sdf.format(new Date());                             //Chat\FireBase\Messages\Time   //Время сообщения
                    String login = "Я";                                                             //Chat\FireBase\Messages\Login  //Пользователь сообщения

                    print_a_messages.setText("");



                    Log.e("MY", "Успех");
                } else {
                    Log.e("MY", "ERROR: Сообщение пустое");
                }

            }
        });
        //----------------------------------------------------------------------------------------------------------------------------------------------------------(exit)
    }
}