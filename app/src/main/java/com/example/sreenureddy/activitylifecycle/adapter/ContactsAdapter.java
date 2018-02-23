package com.example.sreenureddy.activitylifecycle.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sreenureddy.activitylifecycle.R;
import com.example.sreenureddy.activitylifecycle.modelclass.Contacts;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by SreenuReddy on 2/22/2018.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewholder> {
    List<Contacts> contactsList;

    public ContactsAdapter(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }
    @Override
    public ContactViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_adapter,parent,false);
        return new ContactViewholder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewholder holder, int position) {
        holder.one.setText("ID : "+ contactsList.get(position).getId());
        holder.two.setText("Name : "+ contactsList.get(position).getName());
        holder.three.setText("Gender : "+ contactsList.get(position).getGender());

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewholder extends RecyclerView.ViewHolder {
TextView one,two,three;
        public ContactViewholder(View itemView) {
            super(itemView);
            one=(TextView)itemView.findViewById(R.id.a);
            two=(TextView)itemView.findViewById(R.id.b);
            three=(TextView)itemView.findViewById(R.id.c);
        }
    }
}
