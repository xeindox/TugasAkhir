package com.aej.ffi;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FloraActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flora);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flora, menu);
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
	public void floralangka(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraLangka.class);
		startActivity(intenSaya);
	}
	public void identitasprov(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraProvisi.class);
		startActivity(intenSaya);
	}
	public void obat(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraObat.class);
		startActivity(intenSaya);
	}
	public void buah(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraBuah.class);
		startActivity(intenSaya);
	}
}
