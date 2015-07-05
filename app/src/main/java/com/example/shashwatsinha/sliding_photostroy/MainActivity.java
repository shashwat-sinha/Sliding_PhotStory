package com.example.shashwatsinha.sliding_photostroy;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends Activity implements ScrollChangeListener {

    LinearLayout mLinearLayout;
    DisplayMetrics dm;
    static View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dm = getApplicationContext().getResources().getDisplayMetrics();
        Log.d("shashwat", "Printing the dm value " + dm.density);


        //CustomScrollView customScrollView = (CustomScrollView) findViewById(R.id.custom_scroll);
        // customScrollView.setmScrollChangeListener(this);
        //customScrollView.setVerticalFadingEdgeEnabled(false);
        //mLinearLayout = (LinearLayout) findViewById(R.id.custom_linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onscrollchange(int r, int oldr) {
//        Log.d("shashwat", "Main activity receiving  onscroll event");
//        Log.d("shashwat", "New Value of " + r);
//        Log.d("shashwat", "OldValue of r " + oldr);
//        ViewGroup.LayoutParams mLayoutParmas = (ViewGroup.LayoutParams) mLinearLayout.getLayoutParams();
//        Log.d("shashwat", "height is " + mLayoutParmas.height);
//        mLayoutParmas.height = (int) (mLayoutParmas.height + (r - oldr));
//        if (mLayoutParmas.height >= 332 && mLayoutParmas.height < 1000) {
//            mLinearLayout.setLayoutParams(mLayoutParmas);
        //}


    }
}
