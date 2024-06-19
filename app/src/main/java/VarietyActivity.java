// VarietyActivity.java
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

public class VarietyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variety);

        ImageButton btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        setTitle("커피원두 종류들");
        GridView gv = (GridView) findViewById(R.id.grid2);
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
                R.drawable.bean01, R.drawable.bean02, R.drawable.bean03, R.drawable.bean04,
                R.drawable.bean05, R.drawable.bean06, R.drawable.bean07, R.drawable.bean08,
                R.drawable.bean09, R.drawable.bean10, R.drawable.bean11, R.drawable.bean12,
        };
        String[] titles = {
                "브라질 산토스",
                "콜롬비아 수프리모",
                "자메이카 블루마운틴",
                "에티오피아 예가체프",
                "케냐 AA",
                "코스타리카 따라주",
                "탄자니아 AA (킬리만자로)",
                "예멘 모카 마타리",
                "하와이 코나",
                "과테말라 안티구아",
                "파나마 게이샤",
                "엘살바도르"
        };
        String[] descriptions = {
                "브라질 산토스는 세계 커피생산량의 30%를 차지하며, 산토스 지방의 3,4년 정도 된 어린 커피나무에서 수확한 커피로, NO.2등급이 최고 등급입니다. " +
                "부드러운 맛과 신맛이 균일하게 조화를 이루고, 부드러운 풍미와 적당히 쓴맛이 어우러진 중성적인 커피로 향이 깊고 깔끔한 마일드 커피입니다.",
                "콜롬비아는 가장 품질 좋기로 소문난 커피를 생산해내는 나라로, 생산량은 세계 3위의 생산량을 보이며, 수프리모 등급을 받은 커피는 최고급 원두로 손꼽힙니다. " +
                "중량감 있는 맛과 진한 향기, 균형잡힌 산도가 특징이며, 어떤 강도의 로스팅에도 좋은 맛을 내는 고급 커피입니다.",
                "자메이카 블루마운틴은 세계 3대 원두로, 자메이카 블루마운틴 지역 해발 1,200미터가 넘는 고지대에서만 재배되고, 정부의 통제 아래 매년 적은 양만 생산합니다." +
                " 커피가 가진 신맛, 단맛, 스모키한 맛을 비롯해 부드러우면서도 깔끔한 맛을 조화롭게 내며, 쓴 맛이 거의 없어 ‘커피의 황제’라고도 불리웁니다.",
                "에티오피아를 대표하는 원두 예가 체프는 고원도시의 이름이며, 유기농법을 통해 맛과 향이 뛰어납니다. " +
                "신맛이 강하고 향과 바디감이 있는 커피로, 발랄한 꽃향기와 가벼운 베리류의 향으로 신맛과 단맛의 밸런스가 조화를 이루어 에티오피아 커피중 가장 고급스럽고 세련된 커피로 평가 받습니다.",
                "케냐 AA는 해발 2,000미터가 넘는 고지대에서 생산되는 커피로, 'AA'는 원두의 크기를 나타내며, 가장 큰 원두이면서 최고급을 의미하는 등급입니다. " +
                "향이 강하고 묵직한 바디감, 와인향과 과일같은 상큼한 신맛이 특징인 프리미엄 커피로 독특한 쌉쌀한 맛이 일품입니다.",
                "중남미의 유럽이라 불리는 코스타리카는 1800년대부터 커피를 재배하여 세계 9위의 커피대국입니다. 아라비카종만 경작하며, 따라주는 가장 최고급 등급을 받은 커피를 말합니다. " +
                "은은하게 퍼지는 단맛과 신맛에 댝간의 쌉싸름한 맛이 조화롭고, 몰트의 구수함과 묵직한 바디감이 좋은 커피입니다.",
                "킬리만자로 커피라고도 하며, 'AA'는 최고급 등급으로 신맛, 바디감, 향기등이 모두 우수하며 와인에서 느껴지는 고소한 산미와 견과류과 초콜릿향미가 특징입니다. " +
                "향이 깊고 신맛, 단맛, 쓴맛이 오묘하게 조화를 이루어 독특한 향과 부드러운 맛을 지니고 있으며 카페인 함량이 적은것이 특징이다.",
                "아라비아 반도 남서부에 위치한 예멘 국가 마타리에서 생산되는 커피로 '마타리'는 예맨의 최고급 커피 등급으로, 한때 세계 커피 무역의 최고로 꼽혔던 항구인 '모카항'이름을 딴 커피입니다. " +
                "세계 3대 원두 중 하나로, 과일맛이 풍부하고 흙 냄새와 다크 초콜릿의 향이 조화롭고, 적절한 쓴맛과 단맛을 지니고 있습니다.",
                "하와이 코나는 하와이 코나섬에서 재배, 수확한 커피를 말하는데 여기서도 최고 등급인 엑스트라 펜시라는 등급에 한해서만 세계 3대 원두로 분류됩니다. " +
                "커피에 꽃향과 브라과일향이 은은하게 나며, 적당한 신맛이 일품이라 평가받습니다.",
                "안티구아는 과테말라에서 가장 오래되고 유명한 커피 생산지역으로, 스모키한 맛과 격조 높은 풍미가 일품으로, 신맛이 강하고 감칠맛이 납니다. " +
                "화산지역에서 주로 커피를 경작하여 고급 스모키커피로 유명하며, 산미와 바디가 좋고 오렌지의 신맛, 초콜릿의 향미와 스모키한 향이 특징이다.",
                "파나마 지협에 있는 파나마는 고지대, 비옥한 화산 토양, 풍부한 강우량등의 조건이 좋아 훌륭한 커피를 생산해 내기로 유명하며, " +
                "파나마의 게이샤는 최고급 스페셜티 커피로 꽃의 향기와 좋은 산미, 바디감으로 커피 마니아들 사이에서 사랑받고 있다.",
                "중앙아메리카에 위치해 있는 엘살바도르의 원두는 크기가 작고 조밀도가 약한 편이다. 부드러운 초콜릿과 캐러멜 향의 뛰어난 향미와 좋은 산미로 우수한 밸런스를 자랑한다. " +
                "내추럴 가공을 한 듯 수박의 청량함, 포도의 단맛이 특징이며 후반부에 감도는 단맛의 여운이 매력적이다."
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
                    View dialogView = (View) View.inflate(VarietyActivity.this, R.layout.coffee_variety, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(VarietyActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    TextView tvTitle = dialogView.findViewById(R.id.tvTitle);
                    TextView tvDescription = (TextView) dialogView.findViewById(R.id.tvDescription);

                    tvTitle.setText(titles[pos]);
                    tvDescription.setText(descriptions[pos]);
                    ivPoster.setImageResource(posterID[pos]);


                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();

                }
            });

            return imageview;


        }

    }

}
