package com.example.android.miamitour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class WynwoodActivity extends Activity {
   TextView descriptionTv;
   TextView nameTv;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_site_detail);

      Intent intent = getIntent();
      String siteName = intent.getStringExtra("name");
      String siteDescription = intent.getStringExtra("description");

      nameTv = (TextView) findViewById(R.id.site_location_name_text_view);
      descriptionTv = (TextView) findViewById(R.id.site_description_text_view);

      nameTv.setText(siteName);
      descriptionTv.setText(siteDescription);

   }


}
