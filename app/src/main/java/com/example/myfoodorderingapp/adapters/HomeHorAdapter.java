package com.example.myfoodorderingapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodorderingapp.R;
import com.example.myfoodorderingapp.models.HomeHorModel;
import com.example.myfoodorderingapp.models.HomeVerModel;

import java.util.ArrayList;


public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Cheese Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "BBQ Bacon Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Vegetarian Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pepperoni Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;

        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Cheese Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "BBQ Bacon Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Vegetarian Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pepperoni Pizza", "10:00 - 23:00", "5.0", "Min - Rs.1100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Bacon Cheeseburger","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Swiss Burger","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Spicy Chorizo Burger","10:00 - 23:00","5.0", "Min - Rs.1100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Classic French Fries","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Steak Fries","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Sweet Potato Fries","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Salted Fries","10:00 - 23:00","5.0", "Min - Rs.1100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Dark Chocolate","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Mint Chocolate Chip","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Amulet Ice Cream","10:00 - 23:00","5.0", "Min - Rs.1100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Grilled Cheese","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Tuna Salad","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Ham and Cheese","10:00 - 23:00","5.0", "Min - Rs.1100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Club Sandwich","10:00 - 23:00","5.0", "Min - Rs.1100"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                }
            });

            if(select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if(row_index == position) {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);

                }

                else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}
