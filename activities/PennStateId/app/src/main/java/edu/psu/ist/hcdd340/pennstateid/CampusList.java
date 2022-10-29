package edu.psu.ist.hcdd340.pennstateid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CampusList extends AppCompatActivity {
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

    private RecyclerView mRecyclerView;
    private CampusListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_list);

        mRecyclerView = findViewById(R.id.recycler_view_campus);
        mAdapter = new CampusListAdapter(this, CAMPUS_LIST);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}