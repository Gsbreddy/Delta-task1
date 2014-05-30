package com.example.delta_task1;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;
@SuppressWarnings("unused")
public class MainActivity extends ActionBarActivity {

	public void show_message(View view)
	{
		TextView textview=(TextView)findViewById(R.id.name_field);
		Random r = new Random();
		char move;
		int rand,carry=1;
		StringBuffer str =new StringBuffer("Hello World!!");
		for(;carry<str.length();carry++)
		{
			move=str.charAt(carry);
			rand=(int)(Math.random()*str.length());
			str.setCharAt(carry,str.charAt(rand));
			str.setCharAt(rand,move);
		}
		textview.setText(str.toString());
		textview.setTextColor(Color.argb(r.nextInt(256), r.nextInt(256), r.nextInt(256) ,r.nextInt(256)));
		textview.setTextSize(50);
		
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
