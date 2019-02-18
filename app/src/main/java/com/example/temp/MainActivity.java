package com.example.temp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);


        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Rami", "SWE");
        Student student2 = new Student("Ammar", "ICS");
        Student student3 = new Student("norah", "ICS");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(studentList);




        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

}
