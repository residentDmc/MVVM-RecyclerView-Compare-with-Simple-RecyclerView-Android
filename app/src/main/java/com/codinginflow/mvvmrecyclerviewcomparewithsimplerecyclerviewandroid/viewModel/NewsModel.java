package com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.viewModel;

import com.codinginflow.mvvmrecyclerviewcomparewithsimplerecyclerviewandroid.model.News;

public class NewsModel {

    public String Title,Desc;

    public NewsModel(News news) {
        this.Title=news.Title;
        this.Desc=news.Desc;
    }
}
