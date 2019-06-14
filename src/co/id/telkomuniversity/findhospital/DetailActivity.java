package co.id.telkomuniversity.findhospital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_detail);
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.detail, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
	ImageView Im;
	 TextView tv_nama, tv_latin, tv_khasiat, id;
	 Gallery gallery;
	 ImageSwitcher imageSwitcher;
	 Integer[] imageIDs = new Integer[3];
	 int msg_im;
	 
	protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.detail);
	 
	Intent iIdentifikasi = getIntent();
	 msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
	 String msg_nama = iIdentifikasi.getStringExtra("dataNama");
	 String msg_latin = iIdentifikasi.getStringExtra("dataLatin");
	 String msg_khasiat = iIdentifikasi.getStringExtra("dataKhasiat");
	 Im = (ImageView) findViewById(R.id.iv_detail);
	 tv_nama = (TextView) findViewById(R.id.tvNama);
	 tv_latin = (TextView) findViewById(R.id.tvLatin);
	 tv_khasiat = (TextView) findViewById(R.id.tvKhasiat);
	 Im.setImageResource(msg_im);
	 tv_nama.setText(msg_nama);
	 tv_latin.setText(msg_latin);
	 tv_khasiat.setText(msg_khasiat);
	 }
}
