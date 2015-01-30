package com.aej.ffi;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FaunaActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fauna);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fauna, menu);
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
		Intent intenSaya = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(intenSaya);
	}
	public void faunaidentitas(View v){
		Intent intenSaya = new Intent(getApplicationContext(), FaunaProvinsi.class);
		startActivity(intenSaya);
	}
	public void carnivora(View v){
		Intent intenSaya = new Intent(getApplicationContext(), Carnivora.class);
		startActivity(intenSaya);
	}
	public void omnivora(View v){
		Intent intenSaya = new Intent(getApplicationContext(), Omnivora3a.class);
		startActivity(intenSaya);
	}
	public void herbivora(View v){
		Intent intenSaya = new Intent(getApplicationContext(),Herbivora.class);
		startActivity(intenSaya);
	}
}
