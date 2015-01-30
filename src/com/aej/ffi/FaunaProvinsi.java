package com.aej.ffi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FaunaProvinsi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fauna_provinsi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fauna_provinsi, menu);
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
		Intent intenSaya = new Intent(getApplicationContext(),FaunaActivity.class);
		startActivity(intenSaya);
	}
	public void aceh(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas.class);
		startActivity(intenSaya);
	}
	public void sumut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas2.class);
		startActivity(intenSaya);
	}
	public void sumbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas3.class);
		startActivity(intenSaya);
	}
	public void riau(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas4.class);
		startActivity(intenSaya);
	}
	public void ntb(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas18.class);
		startActivity(intenSaya);
	}
	public void maluku(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas31.class);
		startActivity(intenSaya);
	}
	public void malut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas30.class);
		startActivity(intenSaya);
	}
	public void sumsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas7.class);
		startActivity(intenSaya);
	}
	public void jabar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas13.class);
		startActivity(intenSaya);
	}
	public void goron(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas28.class);
		startActivity(intenSaya);
	}
	public void kalsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas22.class);
		startActivity(intenSaya);
	}
	public void yogya(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas15.class);
		startActivity(intenSaya);
	}
	public void banten(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas11.class);
		startActivity(intenSaya);
	}
	public void sulut(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas29.class);
		startActivity(intenSaya);
	}
	public void sulsel(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas23.class);
		startActivity(intenSaya);
	}
	public void bali(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas17.class);
		startActivity(intenSaya);
	}
	public void bengkulu(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas9.class);
		startActivity(intenSaya);
	}
	public void bangka(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas8.class);
		startActivity(intenSaya);
	}
	public void jakarta(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas12.class);
		startActivity(intenSaya);
	}
	public void jambi(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas6.class);
		startActivity(intenSaya);
	}
	public void kaltim(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas24.class);
		startActivity(intenSaya);
	}
	public void papua(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas32.class);
		startActivity(intenSaya);
	}
	public void lampung(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas10.class);
		startActivity(intenSaya);
	}
	public void jateng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas14.class);
		startActivity(intenSaya);
	}
	public void ntt(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas19.class);
		startActivity(intenSaya);
	}
	public void kalbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas20.class);
		startActivity(intenSaya);
	}
	public void kalteng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas21.class);
		startActivity(intenSaya);
	}
	public void sulbar(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas25.class);
		startActivity(intenSaya);
	}
	public void sultra(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas26.class);
		startActivity(intenSaya);
	}
	public void sulteng(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas27.class);
		startActivity(intenSaya);
	}
	public void kepri(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas5.class);
		startActivity(intenSaya);
	}
	public void jatim(View v){
		Intent intenSaya = new Intent(getApplicationContext(),FaunaIdentitas16.class);
		startActivity(intenSaya);
	}
}
