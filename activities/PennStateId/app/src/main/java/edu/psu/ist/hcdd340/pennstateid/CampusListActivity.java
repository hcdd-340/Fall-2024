package edu.psu.ist.hcdd340.pennstateid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CampusListActivity extends AppCompatActivity {
    private final CampusData[] CAMPUS_LIST = {
            new CampusData("Abington", R.drawable.abington, "abingtonadmissions@psu.edu", "1-215-881-7600"),
            new CampusData("Altoona", R.drawable.altoona, "altoonaadmission@psu.edu", "1-814-949-5466"),
            new CampusData("Beaver", R.drawable.beaver, "br-admissions@psu.edu", "1-724-773-3800"),
            new CampusData("Behrend", R.drawable.behrend, "behrend.admissions@psu.edu", "1-814-898-6100"),
            new CampusData("Berks", R.drawable.berks, "berksadmissions@psu.edu", "1-610-396-6060"),
            new CampusData("Brandywine", R.drawable.brandywine, "bwadmissions@psu.edu", "1-610-892-1225"),
            new CampusData("DuBois", R.drawable.dubois, "ds-admissions@psu.edu", "1-814-375-4720"),
            new CampusData("Fayette", R.drawable.fayette, "feadm@psu.edu", "1-724-430-4130"),
            new CampusData("Greater Allegheny", R.drawable.greater_allegheny, "psuga@psu.edu", "1-412-675-9010"),
            new CampusData("Harrisburg", R.drawable.harrisburg, "hbgadmit@psu.edu", "1-717-948-6250"),
            new CampusData("Hazleton", R.drawable.hazleton, "hn-admissions@psu.edu", "1-570-450-3142"),
            new CampusData("Lehigh Valley", R.drawable.lehigh_valley, "admissions-lv@psu.edu", "1-610-285-5035"),
            new CampusData("Mont Alto", R.drawable.mont_alto, "psuma@psu.edu", "1-717-749-6130"),
            new CampusData("New Kensington", R.drawable.new_kensington, "nkadmissions@psu.edu", "1-724-334-5466"),
            new CampusData("Schuylkill", R.drawable.schuylkill, "sl-admissions@psu.edu", "1-570-385-6252"),
            new CampusData("Scranton", R.drawable.scranton, "snadmissions@psu.edu", "1-570-963-2500"),
            new CampusData("Shenango", R.drawable.shenango, "psushenango@psu.edu", "1-724-983-2803"),
            new CampusData("University Park", R.drawable.university_park, "admissions@psu.edu", "1-814-865-5471"),
            new CampusData("Wilkes-Barre", R.drawable.wilkes_barre, "wbadmissions@psu.edu", "1-570-675-9238"),
            new CampusData("World Campus", R.drawable.world_campus, "worldcampus@psu.edu", "1-814-865-5403"),
            new CampusData("York", R.drawable.york, "ykadmission@psu.edu", "1-717-771-4040")
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