package edu.psu.ist.hcdd340.pennstateid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CampusListActivity extends AppCompatActivity {
    private final String[] CAMPUS_LIST = {"Abington",
            "Altoona",
            "Beaver",
            "Behrend",
            "Berks",
            "Brandywine",
            "DuBois",
            "Fayette",
            "Greater Allegheny",
            "Harrisburg",
            "Hazleton",
            "Lehigh Valley",
            "Mont Alto",
            "New Kensington",
            "Schuylkill",
            "Scranton",
            "Shenango",
            "University Park",
            "Wilkes-Barre",
            "World Campus",
            "York"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_list);
    }
}