package com.example.th2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class StudentAdapter  extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private Context mcontext;
    private ArrayList<Student> studentList;

    public StudentAdapter(Context mcontext, ArrayList<Student> studentList) {
        this.mcontext = mcontext;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view= inflater.inflate(R.layout.activity_student,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        Student student = studentList.get(position);
        Glide.with(mcontext).load(student.getIdSource()).into(holder.imageView);
        holder.textView.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.student_name);
            imageView = imageView.findViewById(R.id.student_image);
        }

    }
}
