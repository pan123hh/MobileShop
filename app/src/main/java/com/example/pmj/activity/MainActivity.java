package com.example.pmj.activity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.pmj.R;
import com.example.pmj.common.BaseActivity;
import com.example.pmj.fragment.NavigationFragment;

public class MainActivity extends BaseActivity {

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_main,new NavigationFragment());
        transaction.commit();
    }
}
