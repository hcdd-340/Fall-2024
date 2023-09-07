package edu.psu.ist.hcdd340.pennstateid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuId = item.getItemId();

        if (menuId == R.id.menu_info) {
            Log.d(TAG, "Info menu clicked!");
            return true;
        } else if (menuId == R.id.menu_register) {
            Log.d(TAG, "Register menu clicked!");
            Intent registerIntent = new Intent(this, RegisterActivity.class);
            startActivity(registerIntent);
            return true;
        } else if (menuId == R.id.menu_login) {
            Log.d(TAG, "LogIn menu clicked!");
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
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
            showProfile(R.drawable.mascot,
                    this.getString(R.string.mascot_first_name),
                    this.getString(R.string.mascot_last_name),
                    this.getString(R.string.mascot_machine_id),
                    this.getString(R.string.mascot_id_number),
                    this.getString(R.string.mascot_position_description));
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