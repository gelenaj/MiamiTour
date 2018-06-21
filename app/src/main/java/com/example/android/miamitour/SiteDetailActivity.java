package com.example.android.miamitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import static com.example.android.miamitour.R.layout.activity_site_detail;

public class SiteDetailActivity extends AppCompatActivity {
    int pos = 0;
    TextView name;
    TextView detailName;
    TextView description;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_site_detail);

        //name = (TextView) findViewById(R.id.site_name_text_view);
        detailName = (TextView) findViewById(R.id.site_location_name_text_view);
        description = (TextView) findViewById(R.id.site_description_text_view);

        detailName.setText(getIntent().getExtras().getString("name"));
        detailName.setText(getIntent().getExtras().getString("description"));

//        Bundle bundle = getIntent().getExtras();
//        if(bundle != null){
//            name.setText(bundle.getString("SiteName"));
//            if(name.equals("Wynwood")){
//                detailName.setText("name");
//            }
//
//        }


        //final SiteDetailAdapter adapter = new SiteDetailAdapter(this);


        //name.setText(adapter);
    }
}
////        siteDetail.add(new Site("Wynwood", "This is the description for wynwood"));
////        siteDetail.add(new Site("Overtown", "This is the drscription for wynwood"));
////        siteDetail.add(new Site("Little Havana", "This is the description for little havana"));
////        siteDetail.add(new Site("Opalaca City Hall", "This is the description for opalaca city"));
