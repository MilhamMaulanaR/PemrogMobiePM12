package com.example.p5_h071221035.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p5_h071221035.Account;
import com.example.p5_h071221035.AccountAdapter;
import com.example.p5_h071221035.DataSource;
import com.example.p5_h071221035.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_home);
        AccountAdapter accountAdapter = new AccountAdapter(DataSource.accounts);
        recyclerView.setAdapter(accountAdapter);

        if (getArguments() != null){
            ArrayList<Account> receivedAccount = getArguments().getParcelableArrayList("accounts");
            if (receivedAccount != null){
                DataSource.accounts.addAll(0,receivedAccount);
                accountAdapter.notifyDataSetChanged();
            }
        }
    }
}