package edu.psu.ist.hcdd340.pennstateid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ACTIVITY_4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.button_next);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, String.format("event source id: %s", view.getId()));

        // what's the current profile now?
        TextView idNumberTextView = findViewById(R.id.id_number);
        // what's the id number that is currently being displayed?
        String currentProfileId = idNumberTextView.getText().toString();
        Log.d(TAG, String.format("Current profile id: %s", currentProfileId));
    }
}