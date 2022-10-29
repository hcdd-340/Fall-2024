package edu.psu.ist.hcdd340.pennstateid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CampusListAdapter extends
        RecyclerView.Adapter<CampusListAdapter.CampusViewHolder> {
    private final String[] mCampusList;
    private final LayoutInflater mInflater;

    public CampusListAdapter(Context context, String[] mCampusList) {
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
        String campus = mCampusList[position];
        holder.campusItemView.setText(campus);
    }

    @Override
    public int getItemCount() {
        return mCampusList.length;
    }

    class CampusViewHolder extends RecyclerView.ViewHolder {
        public final TextView campusItemView;
        final CampusListAdapter mAdapter;

        public CampusViewHolder(@NonNull View itemView, CampusListAdapter adapter) {
            super(itemView);
            campusItemView = itemView.findViewById(R.id.campus_list_item_id);
            this.mAdapter = adapter;
        }
    }
}



