package com.example.sreenureddy.activitylifecycle.modelclass;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SreenuReddy on 2/23/2018.
 */

public class ContactsP implements Parcelable {
    private String id;

    private PhoneP phone;

    private String address;

    private String email;

    private String name;

    private String gender;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeParcelable(this.phone, flags);
        dest.writeString(this.address);
        dest.writeString(this.email);
        dest.writeString(this.name);
        dest.writeString(this.gender);
    }

    public ContactsP() {
    }

    protected ContactsP(Parcel in) {
        this.id = in.readString();
        this.phone = in.readParcelable(PhoneP.class.getClassLoader());
        this.address = in.readString();
        this.email = in.readString();
        this.name = in.readString();
        this.gender = in.readString();
    }

    public static final Creator<ContactsP> CREATOR = new Creator<ContactsP>() {
        @Override
        public ContactsP createFromParcel(Parcel source) {
            return new ContactsP(source);
        }

        @Override
        public ContactsP[] newArray(int size) {
            return new ContactsP[size];
        }
    };
}
