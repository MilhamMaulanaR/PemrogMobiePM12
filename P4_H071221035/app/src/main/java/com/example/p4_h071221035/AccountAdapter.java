package com.example.p4_h071221035;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    private final ArrayList<Account> Accounts;
    private final HomeFragment context;

    public AccountAdapter(ArrayList<Account> Accounts, HomeFragment context) {
        this.Accounts = Accounts;
        this.context = context;
    }

    @NonNull
    @Override
    public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account Account = Accounts.get(position);
        holder.setData(Account);
        holder.ll_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION){
                    ProfileFragment profileFragment = new ProfileFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString(ProfileFragment.EXTRA_NAME, Accounts.get(position).getName());
                    bundle.putString(ProfileFragment.EXTRA_USERNAME, Accounts.get(position).getUsername());
                    bundle.putInt(ProfileFragment.EXTRA_PROFILE, Accounts.get(position).getProfile());
                    profileFragment.setArguments(bundle);
                    FragmentManager fragmentManager = context.getParentFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame_layout, profileFragment,ProfileFragment.class.getSimpleName()).addToBackStack(null).commit();
                }
            }
        });
        holder.li_ib_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OptionDialogFragment optionDialogFragment  = new OptionDialogFragment();
                FragmentManager fragmentManager = context.getChildFragmentManager();
                optionDialogFragment.show(fragmentManager,OptionDialogFragment.class.getSimpleName());

                optionDialogFragment.setOnDialogOptionSelectedListener(new OptionDialogFragment.OnDialogOptionSelectedListener() {
                    @Override
                    public void onOptionSelected(boolean isDeleteSelected) {
                        if (isDeleteSelected) {
                            int position = holder.getAdapterPosition();
                            if (position != RecyclerView.NO_POSITION) {
                                Accounts.remove(position);
                                notifyItemRemoved(position);
                            }
                        }
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return Accounts.size()   ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView li_iv_profile;
        TextView li_tv_name;
        TextView li_tv_username;
        ImageView li_iv_post;
        TextView li_tv_caption;
        ImageButton li_ib_delete;
        LinearLayout ll_li;
        Uri uriPost;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            li_iv_profile = itemView.findViewById(R.id.li_iv_profile);
            li_tv_name = itemView.findViewById(R.id.li_tv_name);
            li_tv_username = itemView.findViewById(R.id.li_tv_username);
            li_iv_post = itemView.findViewById(R.id.li_iv_post);
            li_tv_caption = itemView.findViewById(R.id.li_tv_caption);
            li_ib_delete = itemView.findViewById(R.id.li_ib_delete);
            ll_li = itemView.findViewById(R.id.li_ll);
        }

        public void setData(Account Account) {
            li_iv_profile.setImageResource(Account.getProfile());
            li_tv_name.setText(Account.getName());
            if (Account.getUriPost() != null){
                li_iv_post.setImageURI(Account.getUriPost());
            } else {
                li_iv_post.setImageResource(Account.getPost());
            }
            li_tv_username.setText(Account.getUsername());

            li_tv_caption.setText(Account.getCaption());

        }
    }
}