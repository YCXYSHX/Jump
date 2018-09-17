package com.example.shx15.jump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button JUMP = findViewById(R.id.JUMP1);
        JUMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "this is Main2Activity ";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("extra_data",data);
                startActivityForResult(intent,1);
            }
        });
    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Toast.makeText(MainActivity.this,returnedData,Toast.LENGTH_LONG).show();
                    Log.d(TAG, returnedData);
                }
                break;
                default:
        }
    }
}
