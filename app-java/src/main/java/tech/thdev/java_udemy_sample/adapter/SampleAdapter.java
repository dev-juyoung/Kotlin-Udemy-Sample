package tech.thdev.java_udemy_sample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import tech.thdev.java_udemy_sample.adapter.holder.SampleViewHolder;
import tech.thdev.java_udemy_sample.data.SampleItem;

/**
 * Created by tae-hwan on 10/29/16.
 */

public class SampleAdapter extends RecyclerView.Adapter<SampleViewHolder> {

    private final Context context;
    private ArrayList<SampleItem> imageItems = new ArrayList<>();

    public SampleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SampleViewHolder(context, parent);
    }

    @Override
    public void onBindViewHolder(SampleViewHolder holder, int position) {
        holder.onBindView(imageItems.get(position), position);
    }

    @Override
    public int getItemCount() {
        return imageItems.size();
    }

    public void addItem(SampleItem imageItem) {
        imageItems.add(imageItem);
    }
}
