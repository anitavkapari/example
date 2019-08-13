package com.example.dell.tasksg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView rvEmployee;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        rvEmployee=view.findViewById(R.id.rvEmployee);
        //applied orientation
        rvEmployee.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(R.drawable.dad,
                "Dad","Simri","9122495172"));
        /*employeeList.add(new Employee(R.drawable.mummy,
                "Mummy","Simri","8862938816"));
        employeeList.add(new Employee(R.drawable.ic_person_outline_black_24dp,
                "Myno.","Saswad","9763075433"));
        employeeList.add(new Employee(R.drawable.profile,
                "Vikash jee","Saswad","9881078842"));
        employeeList.add(new Employee(R.drawable.kanchandee,
                "Kanchan Dee","Kolkata","8596835821"));
        employeeList.add(new Employee(R.drawable.kavita,
                "Kavita","Sitamadhi","7979716310"));
        employeeList.add(new Employee(R.drawable.rohit,
                "Rohit jee","Sitamadhi","9102697817"));
        employeeList.add(new Employee(R.drawable.uday,
                "Uday jee","Delhi","8435002994"));
        employeeList.add(new Employee(R.drawable.guddu,
                "Roushan","Delhi","7814245468"));
        employeeList.add(new Employee(R.drawable.buaaji,
                "BuaaJee","pune","8830304705"));
        employeeList.add(new Employee(R.drawable.papa,
                "Papa","Umgaon","8210975982"));
        employeeList.add(new Employee(R.drawable.bhai,
                "Bhai","Gurgaon","9999149690"));
        employeeList.add(new Employee(R.drawable.bhabhi,
                "Bhabhi","Gurgaon","9999149590"));*/
        //create adapter
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);

        rvEmployee.setAdapter(employeeAdapter);
        return view;
    }

}
