package com.example.sreenureddy.activitylifecycle.modelclass;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by SreenuReddy on 2/23/2018.
 */

public class PhoneP implements Parcelable{

    private String office;

    private String home;

    private String mobile;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.office);
        dest.writeString(this.home);
        dest.writeString(this.mobile);
    }

    public PhoneP() {
    }

    protected PhoneP(Parcel in) {
        this.office = in.readString();
        this.home = in.readString();
        this.mobile = in.readString();
    }

    public static final Creator<PhoneP> CREATOR = new Creator<PhoneP>() {
        @Override
        public PhoneP createFromParcel(Parcel source) {
            return new PhoneP(source);
        }

        @Override
        public PhoneP[] newArray(int size) {
            return new PhoneP[size];
        }
    };
}
