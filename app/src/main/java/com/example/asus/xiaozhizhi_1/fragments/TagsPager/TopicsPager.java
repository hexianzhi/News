package com.example.asus.xiaozhizhi_1.fragments.TagsPager;

import android.app.Activity;

import com.example.asus.xiaozhizhi_1.fragments.Base.BasePager;

/**
 * Created by xiaozhi on 2016/8/23.
 */
public class TopicsPager extends BasePager {
   public TopicsPager(Activity activity){
       super(activity);
   }

    @Override
    public void initData() {
        tvTitle.setText("话题");
    }
}
