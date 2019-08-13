package com.example.dell.tasksg;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeViewholder extends RecyclerView.ViewHolder{
    ImageView imgEmployee;
    TextView txtName,txtAddress,txtPhone;

    public EmployeeViewholder(@NonNull View itemView) {
        super(itemView);
        imgEmployee=itemView.findViewById(R.id.imgEmployee);
        txtName=itemView.findViewById(R.id.txtName);
        txtAddress=itemView.findViewById(R.id.txtAddress);
        txtPhone=itemView.findViewById(R.id.txtPhone);



    }
}
