package com.example.user.clickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_fule,btn_school,btn_hospital,btn_puc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fule=findViewById(R.id.fst_id);
        btn_school=findViewById(R.id.sch_id);
        btn_hospital=findViewById(R.id.hst_id);
        btn_puc=findViewById(R.id.puc_id);

        btn_fule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String fule_str="https://www.google.com/search?rlz=1C1CHBF_enIN851IN851&sxsrf=ACYBGNSN5zEPZ21FwYOIQPi2CBO67BJw9Q:1569948595472&q=fuel+station+near+me&npsic=0&rflfq=1&rlha=0&rllag=22310012,73207186,613&tbm=lcl&ved=2ahUKEwja2eSiwvvkAhVW7nMBHT4pCGYQtgN6BAgLEAQ&tbs=lrf:!2m1!1e3!2m1!1e16!3sIAE,lf:1,lf_ui:3&rldoc=1#rlfi=hd:;si:,22.306762879448975,73.21436602993163;mv:[[22.341380274617457,73.30019671840819],[22.257362659112253,73.1086226217285],null,[22.299377782776446,73.20440967006834],13]";
                String fule_str="https://www.google.com/search?q=fuel+station+near+me&oq=fule+sta&aqs=chrome.1.69i57j35i39j0l2.2343j0j7&client=ms-android-huawei-rev1&sourceid=chrome-mobile&ie=UTF-8#istate=lrl:mlt&rlmlel=1";
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("fule",fule_str);
                startActivity(i);
            }
        });

        btn_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sch_str="https://www.google.com/search?client=ms-android-huawei-rev1&sxsrf=ACYBGNTnbL_2ev1AS6ps0QlmJITo81P50A%3A1569950805812&ei=VYyTXYadMcTVz7sP6d2NoAM&q=schools+near+me&oq=school+near+me&gs_l=mobile-gws-wiz-serp.1.0.0i7i30l5j0j0i7i30l2.5342.8197..8895...0.1..0.239.3004.0j13j3......0....1.........0i71j0i67.wxx1EMfSVEU#istate=lrl:mlt";

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("sch",sch_str);
                startActivity(i);
            }
        });

        btn_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hsp_str="https://www.google.com/search?q=hospital+near+me&oq=hospit&aqs=chrome.1.69i57j35i39j0l2.2000j0j9&client=ms-android-huawei-rev1&sourceid=chrome-mobile&ie=UTF-8#istate=lrl:mlt";

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("hsp",hsp_str);
                startActivity(i);
            }
        });

        btn_puc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String puc_str="https://www.google.com/search?q=puc+center+near+me&oq=puc&aqs=chrome.1.69i57j35i39j0l2.1315j0j9&client=ms-android-huawei-rev1&sourceid=chrome-mobile&ie=UTF-8#istate=lrl:mlt";

                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("puc",puc_str);
                startActivity(i);
            }
        });

    }
}
