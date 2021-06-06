package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView title;
    EditText enteredText;
    Button button;
    TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        enteredText = findViewById(R.id.enteredText);
        button = findViewById(R.id.button);

        textToSpeech = new TextToSpeech(this, status -> {
            if(status != TextToSpeech.ERROR) {
                textToSpeech.setLanguage(Locale.ENGLISH);
            }
        });

        button.setOnClickListener(v -> {
            String speech = enteredText.getText().toString();
            Toast.makeText(getApplicationContext(), speech,Toast.LENGTH_SHORT).show();
            textToSpeech.speak(speech,TextToSpeech.QUEUE_FLUSH,null,null);
        });

    }
}