package com.example.shivam.swipelayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shivam on 21/12/17.
 */

public class SwipeFragment extends Fragment {
    String name ;
    String title;
    Context mContext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.swipelayout,null);
        TextView textView = (TextView)view.findViewById(R.id.txtHead);
        TextView textView1 =(TextView)view.findViewById(R.id.txtTitle);
        name = getArguments().getString("id");
        title = getArguments().getString("desc");
        textView.setText(name);
        textView1.setText(title);
        return view;
    }
    public static SwipeFragment getName(String name,String title)
    {
        Bundle args = new Bundle();
        args.putString("id",title);
        args.putString("desc",name);
        SwipeFragment swipeFragment = new SwipeFragment();
        swipeFragment.setArguments(args);
        return swipeFragment;
    }

}
