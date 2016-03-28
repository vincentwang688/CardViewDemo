package com.cienet.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cienet.android.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    private List<HashMap<String, String>> mList = new ArrayList<HashMap<String, String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPicUrls();
        // 获取RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        // 设置LinearLayoutManager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 设置ItemAnimator
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // 设置固定大小
        mRecyclerView.setHasFixedSize(true);
        // 初始化自定义的适配器
        myAdapter = new MyAdapter(this, mList);
        // 为mRecyclerView设置适配器
        mRecyclerView.setAdapter(myAdapter);
    }

    private void getPicUrls() {
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("A", "http://img3.hao123.com/data/1_8583424a3f55c06ebeafce438a637c0d_0");
        list.add(map1);

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("A", "http://img0.hao123.com/data/1_981ee6e65d3f13ec691804ab82f2a0ab_510");
        list.add(map2);

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("A", "http://img3.hao123.com/data/desktop/4926b79748d1c9d4db328e1a8b7a7794_1280_800");
        list.add(map3);

        HashMap<String, String> map4 = new HashMap<String, String>();
        map4.put("A", "http://img5.hao123.com/data/1_7793be4df6fd23d63ca321b205ba083b_510");
        list.add(map4);

        HashMap<String, String> map5 = new HashMap<String, String>();
        map5.put("A", "http://img3.hao123.com/data/1_c46275cc6b24a480ecec31b3b5ec3c39_510");
        list.add(map5);
        mList = list;
    }
}
