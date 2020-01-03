package com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.adapter.CustomAdapter;
import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.model.News;
import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.viewModel.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    private List<NewsModel> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        news=new ArrayList<>();
        customAdapter=new CustomAdapter(news);
        recyclerView.setAdapter(customAdapter);
        setData();
    }

    private void setData() {
        news.add(new NewsModel(new News("Title 1","this is a title 1")));
        news.add(new NewsModel(new News("Title 2","this is a title 2")));
        news.add(new NewsModel(new News("Title 3","this is a title 3")));
        news.add(new NewsModel(new News("Title 4","this is a title 4")));
        news.add(new NewsModel(new News("Title 5","this is a title 5")));
        customAdapter.notifyDataSetChanged();

    }
}
