package com.example.zhaodanyang.viewtoucheventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by zhaodanyang on 2017/9/20.
 */

public class MyTouchViewGroup extends RelativeLayout {


    public MyTouchViewGroup(Context context) {
        super(context);
    }

    public MyTouchViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTouchViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("haha", "MyTouchViewGroup:--->dispatchTouchEvent(MotionEvent ev)");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("haha", "MyTouchViewGroup:--->onInterceptTouchEvent(MotionEvent ev)");
        return true;
//        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("haha", "MyTouchViewGroup:--->onTouchEvent(MotionEvent event)");
        return super.onTouchEvent(event);
    }
}
