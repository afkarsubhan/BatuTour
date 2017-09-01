package batutour.com.batutour.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import batutour.com.batutour.R;

/**
 * Created by MSI on 26/08/2017.
 */

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Data> datasList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView date, desc;

        public MyViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.item_image);
            date = (TextView) view.findViewById(R.id.item_date);
            desc = (TextView) view.findViewById(R.id.item_description);
        }
    }


    public RecyclerAdapter(List<Data> datasList) {
        this.datasList = datasList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Data data = datasList.get(position);
        holder.image.setImageBitmap(data.getPhoto());
        holder.date.setText(data.getDate());
        holder.desc.setText(data.getDesc());
    }

    @Override
    public int getItemCount() {
        return datasList.size();
    }
}