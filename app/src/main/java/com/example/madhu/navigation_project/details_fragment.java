package com.example.madhu.navigation_project;

import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class details_fragment extends Fragment {
    TextView text;
    Context context;
    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {

       // inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.menu_details_fragment, container, false);

     //   imageView = (ImageView)view.findViewById(R.id.image);
        String menu = getArguments().getString("Menu");
        if(menu.toString()=="Android") {

          view.setBackgroundResource(R.drawable.android);


        }else if(menu.toString()=="Linux"){

         view.setBackgroundResource(R.drawable.linux);

        }else if(menu.toString()=="Windows"){

            view.setBackgroundResource(R.drawable.windows);

        }else if(menu.toString()=="Raspberry Pi"){

            view.setBackgroundResource(R.drawable.rasbery_pi);

        }



        text= (TextView) view.findViewById(R.id.detail);
        text.setText(menu);
        return view;
    }

}
