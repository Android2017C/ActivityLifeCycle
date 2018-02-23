package com.example.sreenureddy.activitylifecycle.clickeventhelpher;

import android.view.View;

/**
 * Created by SreenuReddy on 2/23/2018.
 */

public interface RecyclerViewClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
