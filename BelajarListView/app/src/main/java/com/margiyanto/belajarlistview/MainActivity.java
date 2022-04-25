package com.margiyanto.belajarlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewT;
    private ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewT = findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.jenjang, android.R.layout.simple_expandable_list_item_1);
        listViewT.setAdapter(adapter);

        listViewT.setOnItemClickListener(adapterView.onItemClickListener());{
            @Override
            public void onItemClick(AdapterView<?> adapterview, View view, int i, long l);        
        }
    });
}
}