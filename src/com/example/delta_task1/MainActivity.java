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
	public final static String s="Hello_world";
	public void show_message(View view)
	{
		Random rand = new Random();
		TextView textview=(TextView)findViewById(R.id.name_field);
		char temp;
		int ran;
		StringBuilder str =new StringBuilder(s);
		for(int i=0;i<str.length();++i)
		{
			temp=str.charAt(i);
			ran=(int)(Math.random()*str.length());
			str.setCharAt(i,str.charAt(ran));
			str.setCharAt(ran,temp);
		}
		textview.setText(str.toString());
		textview.setTextSize(50);
		textview.setTextColor(Color.argb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256) ,rand.nextInt(256)));
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
