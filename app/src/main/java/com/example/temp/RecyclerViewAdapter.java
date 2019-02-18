package com.example.temp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder>  {

    List<Student> studentList;

    public RecyclerViewAdapter(List<Student> students) {
        studentList = students;
    }




    public class myViewHolder extends RecyclerView.ViewHolder {
        public TextView studentName;
        public TextView studentMajor;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            studentName = itemView.findViewById(R.id.student_name);
            studentMajor = itemView.findViewById(R.id.student_major);

        }
    }



    @NonNull
    @Override
    public RecyclerViewAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recycler_view_item, viewGroup,false);

        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.myViewHolder viewHolder, int i) {
        viewHolder.studentName.setText(studentList.get(i).getName());
        viewHolder.studentMajor.setText(studentList.get(i).getMajor());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
