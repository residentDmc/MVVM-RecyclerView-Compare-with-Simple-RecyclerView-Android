package com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.R;
import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.databinding.NewsBinding;
import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.model.News;
import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.viewModel.NewsModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

    List<NewsModel> newsList;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<NewsModel> newsList) {

        this.newsList = newsList;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater==null){
            layoutInflater=LayoutInflater.from(parent.getContext());
        }
        NewsBinding newsBinding=NewsBinding.inflate(layoutInflater,parent,false);
        return new CustomView(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {
        NewsModel news = newsList.get(position);
        holder.bind(news);

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class CustomView extends RecyclerView.ViewHolder {

        private NewsBinding newsBinding;

        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
        }

        public void bind(NewsModel newsModel) {
            this.newsBinding.setNewsModel(newsModel);
        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
}
