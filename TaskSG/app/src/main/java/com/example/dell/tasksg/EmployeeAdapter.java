package com.example.dell.tasksg;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class EmployeeAdapter  extends RecyclerView.Adapter<EmployeeViewholder>{

private List<Employee> employeeList;
//constructor
public EmployeeAdapter(List<Employee> employeeList){
    this.employeeList=employeeList;
}
    @NonNull
    @Override
    public EmployeeViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_employee,viewGroup,false);
        return new EmployeeViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewholder holder, int i) {
    Employee employee=employeeList.get(i);
    holder.imgEmployee.setImageResource(employee.getImageId());
    holder.txtName.setText(employee.getName());
    holder.txtAddress.setText(employee.getAddress());
    holder.txtPhone.setText(employee.getPhone());


    }

    @Override
    public int getItemCount() {
    //telling adapter
        return employeeList.size();
    }
}
