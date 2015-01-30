package com.aej.ffi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FloraLangka6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flora_langka6);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flora_langka6, menu);
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
	public void home(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraActivity.class);
		startActivity(intenSaya);
	}
	public void nek(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraLangka7.class);
		startActivity(intenSaya);
	}
	public void back(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraLangka5.class);
		startActivity(intenSaya);
	}
}