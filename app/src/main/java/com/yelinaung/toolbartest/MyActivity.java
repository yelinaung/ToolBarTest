package com.yelinaung.toolbartest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MyActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_my);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

    //Title and subtitle
    toolbar.setTitle("MY toolbar");
    toolbar.setSubtitle("Subtitle");

    toolbar.inflateMenu(R.menu.toolbar_menu);

    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
      @Override
      public boolean onMenuItemClick(MenuItem menuItem) {

        switch (menuItem.getItemId()) {
          case R.id.action_share:
            Toast.makeText(MyActivity.this, "Share", Toast.LENGTH_SHORT).show();
            return true;
        }

        return false;
      }
    });

    //Navigation Icon
    toolbar.setNavigationIcon(R.drawable.ic_launcher);
    toolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Toast.makeText(MyActivity.this, "Navigation", Toast.LENGTH_SHORT).show();
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.my, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}
