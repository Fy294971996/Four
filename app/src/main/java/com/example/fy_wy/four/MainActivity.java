package com.example.fy_wy.four;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="Name";
    private final static String CLASS="Class";
    private final static String NUMBER="Number" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] Names={"姓名：滑稽","姓名：拐","姓名：伟子"};
        String[] Classs={"专业：软件工程","专业：网络工程","专业：计算机科学与技术"};
        String[] Numbers={"学号：2014011350","学号：2014011351","学号：2014011352"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for (int i=0;i<Names.length;i++){
            Map<String,Object> item=new HashMap<String, Object>();
            item.put(NAME,Names[i]);
            item.put(CLASS,Classs[i]);
            item.put(NUMBER,Numbers[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASS,NUMBER},new int[]{R.id.Name,R.id.Class,R.id.Number});
        ListView list=(ListView)findViewById(R.id.list);
                list.setAdapter(adapter);

    }
}
