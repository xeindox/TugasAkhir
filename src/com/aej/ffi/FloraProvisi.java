package com.aej.ffi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FloraProvisi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_flora_provisi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.flora_provisi, menu);
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
	public void aceh(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas24.class);
		startActivity(intenSaya);
	}
	public void sumut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas7.class);
		startActivity(intenSaya);
	}
	public void sumbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas2.class);
		startActivity(intenSaya);
	}
	public void riau(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas21.class);
		startActivity(intenSaya);
	}
	public void ntb(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas.class);
		startActivity(intenSaya);
	}
	public void maluku(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas3.class);
		startActivity(intenSaya);
	}
	public void malut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas10.class);
		startActivity(intenSaya);
	}
	public void sumsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas11.class);
		startActivity(intenSaya);
	}
	public void jabar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas12.class);
		startActivity(intenSaya);
	}
	public void goron(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas13.class);
		startActivity(intenSaya);
	}
	public void kalsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas14.class);
		startActivity(intenSaya);
	}
	public void yogya(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas15.class);
		startActivity(intenSaya);
	}
	public void banten(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas16.class);
		startActivity(intenSaya);
	}
	public void sulut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas17.class);
		startActivity(intenSaya);
	}
	public void sulsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas18.class);
		startActivity(intenSaya);
	}
	public void bali(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas19.class);
		startActivity(intenSaya);
	}
	public void bengkulu(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas25.class);
		startActivity(intenSaya);
	}
	public void bangka(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas20.class);
		startActivity(intenSaya);
	}
	public void jakarta(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas22.class);
		startActivity(intenSaya);
	}
	public void jambi(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas23.class);
		startActivity(intenSaya);
	}
	public void kaltim(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas4.class);
		startActivity(intenSaya);
	}
	public void papua(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas5.class);
		startActivity(intenSaya);
	}
	public void lampung(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas6.class);
		startActivity(intenSaya);
	}
	public void jateng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas8.class);
		startActivity(intenSaya);
	}
	public void ntt(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas9.class);
		startActivity(intenSaya);
	}
	public void kalbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas27.class);
		startActivity(intenSaya);
	}
	public void jatim(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas26.class);
		startActivity(intenSaya);
	}
	public void kepri(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas29.class);
		startActivity(intenSaya);
	}
	public void kalteng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas32.class);
		startActivity(intenSaya);
	}
	public void sulteng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas33.class);
		startActivity(intenSaya);
	}
	public void sultra(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas30.class);
		startActivity(intenSaya);
	}
	public void sulbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FloraIdentitas31.class);
		startActivity(intenSaya);
	}
}
