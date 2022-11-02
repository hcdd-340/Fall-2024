package edu.psu.ist.hcdd340.pennstateid;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

public class CampusListAdapter extends
        RecyclerView.Adapter<CampusListAdapter.CampusViewHolder> {
    private final CampusData[] mCampusList;
    private final LayoutInflater mInflater;

    public CampusListAdapter(Context context, CampusData[] mCampusList) {
        this.mCampusList = mCampusList;
        mInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public CampusListAdapter.CampusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.campus_list_item, parent, false);
        return new CampusViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CampusListAdapter.CampusViewHolder holder, int position) {
        CampusData campus = mCampusList[position];
        holder.campusImageView.setImageResource(campus.getProfileImage());
        holder.campusTitleView.setText(campus.getCampusName());
        holder.campusPhoneView.setText(campus.getPhone());
        holder.campusEmailView.setText(campus.getEmail());
    }

    @Override
    public int getItemCount() {
        return mCampusList.length;
    }

    class CampusViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView campusTitleView;
        public final ImageView campusImageView;
        public final TextView campusEmailView;
        public final TextView campusPhoneView;
        final CampusListAdapter mAdapter;

        public CampusViewHolder(@NonNull View itemView, CampusListAdapter adapter) {
            super(itemView);
            campusTitleView = itemView.findViewById(R.id.campus_list_title_id);
            campusImageView = itemView.findViewById(R.id.campus_list_image_id);
            campusEmailView = itemView.findViewById(R.id.campus_list_email);
            campusPhoneView = itemView.findViewById(R.id.campus_list_phone);
            this.mAdapter = adapter;

            campusTitleView.setOnClickListener(this);
            campusImageView.setOnClickListener(this);
            campusEmailView.setOnClickListener(this);
            campusPhoneView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            String campus = mCampusList[mPosition].getCampusName();
            Snackbar.make(campusTitleView,
                    campus + " clicked!",
                    Snackbar.LENGTH_SHORT).show();

        }
    }
}



