package edu.neusoft.a124team.dietitian.haoDengKe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import edu.neusoft.a124team.dietitian.R;

public class H_breakfast2 extends AppCompatActivity {
    ListView listView;
    ArrayList<HashMap<String,Object>> data=new ArrayList<HashMap<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_breakfast2);
        listView=(ListView)findViewById(R.id.listView1);
        HashMap<String,Object> map=new HashMap<>();
        map.put("img",R.drawable.hbreakfastitem1);
        map.put("Title","牛奶布丁");
        map.put("Content", "9步/<60分钟");
        map.put("details", "咸鲜味/煎");
        HashMap<String, Object> map2=new HashMap<String, Object>();
        data.add(map);
        map2.put("img", R.drawable.hbreakfastitem2);
        map2.put("Title","红枣鸡蛋发糕");
        map2.put("Content", "8步/<60分钟");
        map2.put("details","甜味/蒸");
        data.add(map2);
        HashMap<String, Object> map4=new HashMap<String, Object>();
        map4.put("img", R.drawable.hbreakfastitem4);
        map4.put("Title","鸡蛋羹");
        map4.put("Content", "6步/<30分钟");
        map4.put("details","咸鲜味/蒸");
        data.add(map4);
        HashMap<String, Object> map5=new HashMap<String, Object>();
        map5.put("img", R.drawable.hbreakfastitem5);
        map5.put("Title","土豆鸡蛋饼");
        map5.put("Content", "9步/<15分钟");
        map5.put("details","咸鲜味/煎");
        data.add(map5);


       SimpleAdapter adapter=new SimpleAdapter(
                this,
                data,
                R.layout.activity_h_breakfast_item1,
                new String[]{"img","Title","Content", "details"},
                new int[]{R.id.imageView2,R.id.text1,R.id.text2,R.id.text3}
        );

        listView.setAdapter(adapter);
    }
}
