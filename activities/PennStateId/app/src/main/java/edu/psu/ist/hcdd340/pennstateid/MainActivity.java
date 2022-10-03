package edu.psu.ist.hcdd340.pennstateid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "ACTIVITY_7";

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

        // let's compare with the ID assigned to the president
        // we will have to convert the ID (an int) to the assigned String value
        String presidentId = this.getString(R.string.president_id_number);

        if (presidentId.equals(currentProfileId)) {
            // currently the president's profile is being shown
            // we will replace it with the dean's profile
            showProfile(R.drawable.ist_dean,
                    this.getString(R.string.ist_dean_first_name),
                    this.getString(R.string.ist_dean_last_name),
                    this.getString(R.string.ist_dean_machine_id),
                    this.getString(R.string.ist_dean_id_number),
                    this.getString(R.string.ist_dean_position_description));
        } else {
            // currently the dean's profile is being shown
            // we will replace it with the president's profile
            showProfile(R.drawable.psu_president,
                    this.getString(R.string.president_first_name),
                    this.getString(R.string.president_last_name),
                    this.getString(R.string.president_machine_id),
                    this.getString(R.string.president_id_number),
                    this.getString(R.string.president_position_description));
        }
    }

    private void showProfile(int profileImageId, String firstName, String lastName,
                             String machineId, String idNumber, String positionDescription) {
        // update profile image
        ShapeableImageView idHolderImage = findViewById(R.id.id_holder_image);
        idHolderImage.setImageResource(profileImageId);

        // first name
        TextView label = findViewById(R.id.first_name);
        label.setText(firstName);

        label = findViewById(R.id.last_name);
        label.setText(lastName);

        label = findViewById(R.id.machine_id);
        label.setText(machineId);

        label = findViewById(R.id.id_number);
        label.setText(idNumber);

        label = findViewById(R.id.position_description);
        label.setText(positionDescription);

    }
}