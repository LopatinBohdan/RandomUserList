package com.example.randomuserlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> persons=new ArrayList<Person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        setInitialData();

        RecyclerView recyclerView=findViewById(R.id.list);
        //adapter
        PersonAdapter adapter=new PersonAdapter(this,persons);
        //set adapter
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        int[] avatars= {
                R.drawable.ava1,
                R.drawable.ava2,
                R.drawable.ava3,
                R.drawable.ava3,
                R.drawable.homer
        };
        ArrayList<String> names=new ArrayList<String>(Arrays.asList(
                "Benjamin","Ethan","Samuel", "Jacob", "Liam", "Michael", "Daniel","Matthew",
                "Andrew", "Christopher"
        ));
        ArrayList<String> surnames=new ArrayList<String>(Arrays.asList(
                "Johnson","Smith","Williams", "Brown", "Davis", "Miller", "Wilson","Moore",
                "Taylor", "Anderson"
        ));
        ArrayList<Country> countries=new ArrayList<Country>();
        Country country=new Country("Brazil",
                new ArrayList<String>(Arrays.asList("Rio", "San Paulo", "Salvador")));

        Country country2=new Country("Australia",
                new ArrayList<String>(Arrays.asList("Sydney", "Melbourne", "Brisbane")));

        Country country3=new Country("Japan",
                new ArrayList<String>(Arrays.asList("Tokyo", "Yokohama", "Osaka")));

        countries.add(country);
        countries.add(country2);
        countries.add(country3);

        for (int i = 0; i < 10; i++) {
            int randAvatar=getRandom(0,4);
            int randName =getRandom(0,9);
            int randSurname =getRandom(0,9);
            int age = getRandom(14,99);
            int randCountry=getRandom(0,3);
            persons.add(new Person(avatars[randAvatar], names.get(randName), surnames.get(randSurname),age, countries.get(randCountry)));
        }
    }
    public int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}