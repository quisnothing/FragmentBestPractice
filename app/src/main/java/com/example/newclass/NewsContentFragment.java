package com.example.newclass;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentbestpractice.R;

import org.w3c.dom.Text;

/**
 * Created by 渠不与 on 2016/7/24 0024.
 */
public class NewsContentFragment extends Fragment {
    private View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view=inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }
    //通过findViewById获取新闻的标题和内容控件，然后将参数设置进去
    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText=(TextView)view.findViewById(R.id.news_title);
        TextView newsContentText=(TextView)view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
