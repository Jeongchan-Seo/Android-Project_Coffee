package com.cookandroid.finalproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FranchiseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franchise);

        ImageButton btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setTitle("주요 프랜차이즈");
        GridView gv = (GridView) findViewById(R.id.grid3);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
    }

    public class MyGridAdapter extends BaseAdapter {
        Context context;

        public MyGridAdapter(Context c){
            context = c;
        }

        public int getCount(){
            return posterID.length;
        }

        public Object getItem(int position){
            return null;
        }

        public long getItemId(int position){
            return 0;
        }
        Integer[] posterID = {
                R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4,
                R.drawable.logo5, R.drawable.logo6, R.drawable.logo7, R.drawable.logo8,
                R.drawable.logo9, R.drawable.logo10, R.drawable.logo11, R.drawable.logo12
        };

        String[] urls = {
                "https://www.starbucks.co.kr/index.do", "https://www.twosome.co.kr/main.do", "https://mega-mgccoffee.com/", "https://www.ediya.com/",
                "https://paikdabang.com/", "https://www.caffe-pascucci.co.kr/", "https://www.coffeebeankorea.com/main/main.asp", "https://www.lotteeatz.com/brand/angel",
                "https://www.hollys.co.kr/", "https://mmthcoffee.com/", "http://caffebene.co.kr/", "https://www.tomntoms.com/"
        };

        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200, 300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[pos]));
                    startActivity(browserIntent);
                }
            });

            return imageview;
        }
    }
}
