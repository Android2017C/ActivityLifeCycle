package com.example.sreenureddy.activitylifecycle.modelclass;

import java.io.Serializable;

/**
 * Created by SreenuReddy on 2/21/2018.
 */

public class Phone implements Serializable
{
    private String office;

    private String home;

    private String mobile;

    public String getOffice ()
    {
        return office;
    }

    public void setOffice (String office)
    {
        this.office = office;
    }

    public String getHome ()
    {
        return home;
    }

    public void setHome (String home)
    {
        this.home = home;
    }

    public String getMobile ()
    {
        return mobile;
    }

    public void setMobile (String mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [office = "+office+", home = "+home+", mobile = "+mobile+"]";
    }
}
