package com.example.shashwatsinha.sliding_photostroy;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by shashwatsinha on 19/06/15.
 */
public class CustomScrollView extends ScrollView {

    ScrollChangeListener mScrollChangeListener;

    public CustomScrollView(Context context) {
        super(context);
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public CustomScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    void setmScrollChangeListener(ScrollChangeListener mScrollChangeListener) {
        this.mScrollChangeListener = mScrollChangeListener;
    }

    public CustomScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onScrollChanged(int l, int r, int oldl, int oldr) {
//        Log.d("shashwat", "getting scroll events here");
//        Log.d("shashwat", "Value of l " + l);
//        Log.d("shashwat", "Value of r " + r);
//        Log.d("shashwat", "Value of oldl " + oldl);
//        Log.d("shashwat", "Value of oldr " + oldr);
        super.onScrollChanged(l, r, oldl, oldr);
        // mScrollChangeListener.onscrollchange(r, oldr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.d("shashwat", "Intercepting touch here");
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("shashwat", "CustomScrollView dispatchTouchEvent ");
        int y = (int) event.getY();
        // Log.d("shashwat", "MainActivity X " + MainActivity.view.getX() + "MainActivity Y " + MainActivity.view.getY());
        int[] location = new int[2];
        MainActivity.view.getLocationOnScreen(location);
        int h = location[1] + MainActivity.view.getHeight();
        if ((location[1] <= y) && (y <= h))
            return false;
        return super.dispatchTouchEvent(event);
    }
}
