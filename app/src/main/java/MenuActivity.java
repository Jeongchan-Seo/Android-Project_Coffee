// MenuActivity.java
package com.cookandroid.finalproject;

import android.content.Context;
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

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        setTitle("커피 종류들");
        GridView gv = (GridView) findViewById(R.id.grid1);
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
                R.drawable.coff01, R.drawable.coff02, R.drawable.coff03, R.drawable.coff04,
                R.drawable.coff05, R.drawable.coff06, R.drawable.coff07, R.drawable.coff08,
                R.drawable.coff09, R.drawable.coff10, R.drawable.coff11, R.drawable.coff12,
                R.drawable.composition
        };
        String[] descriptions = {
                "에스프레소(espresso)는 곱게 간 원두에 고온 고압으로 소량의 물을 투과시켜 추출해 데미타스 컵에 담은 커피이다. " +
                "고온 고압에서 매우 진하게, 종이필터를 거치지 않고 추출되는 방식이므로 커피의 맛이 강렬하게 드러난다." +
                "에스프레소에 물을 넣으면 아메리카노가 되고 우유를 넣으면 카푸치노, 카페라떼, 플랫 화이트, 코르타도가 되는 등, 다양한 베리에이션 커피를 만들 수 있다.",
                "커피의 일종인 에스프레소에 뜨거운 물을 희석시켜 만든 음료이다." +
                "대한민국의 카페에서 자주 접할 수 있는 메뉴고 선호층도 가장 두터운 편이지만, 맛에 대해서는 호불호가 굉장히 크게 나뉘는 편이다."+
                "아메리카노의 농도는 에스프레소의 '샷' 수와, 더해지는 물의 양에 따라 달라진다.",
                "우유를 넣은 커피의 일종이다. 라테라는 것은 에스프레소 위에 우유를 넣는 것으로서 우유가 5mm 정도 맨 위에 층을 이루고 있는 것이 특징이다."+
                "카페라테는 우유를 넣는다는 점에서 아메리카노에 비해 쓴 맛이 훨씬 덜한 편이다. 또 우유가 들어있어서 에스프레소 표면에 우유 성분이 떠있는 것이 특징으로 이것으로 '라테 아트'를 표현할 수도 있다. 우유의 고소한 맛도 약간 나는 편이다.",
                "카푸치노(이탈리아어: cappuccino)는 에스프레소를 베이스로 한 커피 음료로, 에스프레소에 우유를 붓는 과정까지는 다른 메뉴와 비슷하지만, 그 위에 우유 거품을 두껍게 올리는 것이 카푸치노의 차별점이다."+
                "카페오레, 카페라떼와 비교하면 에스프레소와 직접 섞이는 우유의 양은 상대적으로 적은 만큼 커피 본연의 맛을 더 진하게 느낄 수 있고, 부드러운 우유 거품도 한껏 즐길 수 있다.",
                "에스프레소에 우유와 초콜릿 시럽/소스를 넣어서 만든다. 초콜릿 시럽/소스를 넣는다는 점이 포인트이고, 휘핑크림은 기호에 따라 올리기도 하고 안 올리기도 한다."+
                "일반 초콜릿 대신 화이트 초콜릿을 사용한 화이트 카페모카도 있다. 보통 줄여서 화이트 모카라고만 할 때가 많다."+
                "초코시럽이 들어가기 때문에 기본적으로 달다. 단맛과 함께 쓴 풍미가 올라온다. 다만 초코시럽에 따라 강한 다크 초콜릿 맛이 나는 경우도 있다.",
                "라떼 마키아토에 캐러멜 소스를 첨가한 것으로, 거품을 낸 우유에 바닐라향 시럽 넣고, 에스프레소를 약간 넣은 후 그 위에 캐러멜 소스를 드리즐(커피 토핑)로 뿌린다."+
                "커피 본연의 맛이나 깔끔한 맛을 중시하는 사람에겐 '시럽 덩어리', '찝찝한 맛' 취급을 당한다."+
                "하지만 단맛을 좋아하는 사람이나 오랫동안 믹스커피에 길들여진 사람들은 그냥 달달한 커피로써 커피 본연의 쓴맛을 원치 않아 많이 찾는다.",
                "찬물로 내린 커피. 콜드 브루 커피에서 '브루 커피(Brew Coffee)'는 커피를 우려낸다는 의미이다. 콜드 브루는 이름 그대로 차가운 물에 우려내는 방식으로 추출한다."+
                "찬물에는 커피가 빠르게 우러나지 않기 때문에 점적식은 8시간 이상, 침출식은 12~24시간 이상의 긴 제조 시간이 걸리지만 한번 만들어놓으면 드립이나 에스프레소 방식에 비해 보관 기간이 길고 시음이 용이하며 시간이 지날수록 풍미가 숙성되는 장점이 있다."+
                "무척 진하면서도 일반적인 온수 추출 방식으로는 맛볼 수 없는 특유의 부드러운 질감과 단맛이 두드러지는 풍미가 특징이다.",
                "돌체 라떼(Dolce Latte)는 연유와 우유, 에스프레소 샷을 섞어 만든 카페라테의 일종이다. 돌체 라떼는 연유와 무지방 우유, 그리고 에스프레소 샷의 조합으로 완성되는 음료이다."+
                "돌체(Dolce)란 이탈리아어로 '부드러운, 달콤한'이라는 뜻이라고 한다. 그 이름에 걸맞게 돌체 라떼는 상당히 달고 진하기 때문에 샷을 빼거나 시럽을 추가할 때 상당한 주의를 요한다.",
                "에스프레소에 휘핑크림을 얹은 베리에이션 커피의 일종이다. 휘핑크림을 얹었어도 에스프레소급으로 쓴 편이다. 달아 보인다고 무심코 시켰다가 낭패 보지 말자. 추가로 시럽을 넣으면 먹을만하나, 이 경우 시럽의 종류에 따라 상당한 텁텁함을 느끼게 될 수 있다.",
                "에스프레소에 스팀밀크를 혼합하여 만든 우유를 넣은 커피의 일종이다."+
                "라떼는 에스프레소 샷 위에 스팀밀크를 부어 맨 위층에 우유거품이 올라가지만, 플랫 화이트는 이 훨씬 미세한 우유거품이 음료 위에 올라가는게 아니라 음료 속에 섞이듯이 들어가는 것이다. 라떼는 커피와 우유층이 분리되어 있지만, 플랫 화이트는 둘이 완전히 섞여있다.",
                "프라푸치노는 미국 뉴 잉글랜드 지방에서 얼음 넣은 밀크셰이크를 칭하는 프라페 (Frappe)와 카푸치노 (Cappuccino)를 합성한 단어로, 스타벅스가 등록한 브랜드다."+
                "여기에 휘핑크림이 올라가는 것이 기본이며 주문 시 양을 조절하거나(빼는 것도 포함) 다른 종류의 휘핑으로 바꾸는 것도 가능하다. 그에따라 다양한 프라푸치노가 있다.",
                "에스프레소 마키아토는 데미타세(demitasse) 혹은 도피오(Doppio) 잔에 에스프레소를 넣은 뒤 스팀밀크를 소량 올려서 조금 더 부드러운 에스프레소를 즐기는 커피이다."+
                "잔에 먼저 스팀밀크를 넣은 뒤 에스프레소를 점이 생기듯이 나중에 붓는 커피이다.",
                ""
        };

        public View getView(int position, View convertView, ViewGroup parent){
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new GridView.LayoutParams(200,300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);

            imageview.setImageResource(posterID[position]);

            final int pos = position;
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView = (View) View.inflate(MenuActivity.this, R.layout.coffee_menu, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MenuActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    TextView tvDescription = (TextView) dialogView.findViewById(R.id.tvDescription);


                    tvDescription.setText(descriptions[pos]);
                    ivPoster.setImageResource(posterID[pos]);

                    if (posterID[pos] == R.drawable.composition) {
                        ivPoster.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
                        ivPoster.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
                        ivPoster.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    }


                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();

                }
            });

            return imageview;


        }

    }

}