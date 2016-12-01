package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultActivity extends Activity {
    private Button bt;
    private int RESULTCODE = 1;//结果码
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("key","+.....+android：需要返回到插件的东西");
                Toast.makeText(ResultActivity.this,"js插件重新打开一个activity成功",Toast.LENGTH_SHORT).show();
                ResultActivity.this.setResult(RESULTCODE,intent);
                ResultActivity.this.finish();
            }
        });
    }

    protected void init(){
        bt = (Button)findViewById(R.id.back);
    }
}
