package com.hong.zyh.wisdombj;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * Created by shuaihong on 2019/3/4.
 */

public class MainActivity extends SlidingFragmentActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置左边的布局
        setBehindContentView(R.layout.left_menu);
        //获取SlidingMenu方法
        SlidingMenu slidingMenu = getSlidingMenu();
        //全屏触摸
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //屏幕预留200像素宽度,是主屏，不是侧滑的面板
        slidingMenu.setBehindOffset(500);
    }
}
