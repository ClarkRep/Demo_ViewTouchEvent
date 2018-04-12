package com.example.zhaodanyang.viewtoucheventdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zhaodanyang on 2017/9/20.
 */

public class MyTouchView extends View {
    public MyTouchView(Context context) {
        super(context);
    }

    public MyTouchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTouchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("haha", "MyTouchView:--->dispatchTouchEvent(MotionEvent ev)");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("haha", "MyTouchView:--->onTouchEvent(MotionEvent event)");
        return super.onTouchEvent(event);
    }
}
