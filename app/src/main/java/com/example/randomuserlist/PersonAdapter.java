package com.example.randomuserlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Person> persons;

    public PersonAdapter(Context context, List<Person> persons) {
        this.inflater = LayoutInflater.from(context);
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {
        Person person=persons.get(position);
        holder.img.setImageResource(person.getAvatar());
        String nameSurname=person.getName()+ " "+ person.getSurname();
        holder.name.setText(nameSurname );
        holder.country.setText(person.getCountry().getName() +" "+  person.getCountry().getCities().get(getRandom(0,3)));
        holder.age.setText("age: "+person.getAge());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView img;
        final TextView name;
        final TextView country;
        final TextView age;

        ViewHolder(View view){
            super(view);
            img=view.findViewById(R.id.avatar);
            name=view.findViewById(R.id.name);
            country=view.findViewById(R.id.country);
            age=view.findViewById(R.id.age);
        }
    }
    public int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
