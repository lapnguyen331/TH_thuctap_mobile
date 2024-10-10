package com.example.th2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {
    private ArrayList<Student> students;
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        recyclerView = findViewById(R.id.student_list);
        students = new ArrayList<>();
        createStudentList();
        studentAdapter = new StudentAdapter(this, students);
        recyclerView.setAdapter(studentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void createStudentList(){
        students.add(new Student(R.drawable.img1,"Nguyễn Văn Nam"));
        students.add(new Student(R.drawable.img2,"Nguyễn Văn Nam"));
        students.add(new Student(R.drawable.img3,"Nguyễn Văn Nam"));
        students.add(new Student(R.drawable.img4,"Nguyễn Văn Nam"));

    }
}
