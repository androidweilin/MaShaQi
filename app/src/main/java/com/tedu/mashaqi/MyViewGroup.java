package com.tedu.mashaqi;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2016/12/16.
 */
public class MyViewGroup extends RelativeLayout {
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d("111", "onInterceptTouchEvent action:ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:

                Log.d("111", "onInterceptTouchEvent action:ACTION_MOVE");
                return true;


            case MotionEvent.ACTION_UP:

                Log.d("111", "onInterceptTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d("111", "onInterceptTouchEvent action:ACTION_CANCEL");

                break;

        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d("111", "---onTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d("111", "---onTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d("111", "---onTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d("111", "---onTouchEvent action:ACTION_CANCEL");

                break;

        }
        return super.onTouchEvent(event);
    }
}

