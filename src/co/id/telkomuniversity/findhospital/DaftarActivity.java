package co.id.telkomuniversity.findhospital;

import java.util.ArrayList;

//import android.app.Activity;
//import android.content.Intent;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.support.v4.widget.SimpleCursorAdapter;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.EditText;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.Toast;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.SimpleCursorAdapter;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class DaftarActivity extends Activity {

//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_daftar);
//		
////		dataRSHandler dRSh = new dataRSHandler(this);
////		dRSh.addRS(new DataRS("Rs al Islam","-6.939935","107.669126"));
////		dRSh.addRS(new DataRS("RSKIA kota bandung","-6.929210","107.600554"));
////		dRSh.addRS(new DataRS("RS Bersalin Emma Poeradiredja","-6.913274","107.613637"));
////		dRSh.addRS(new DataRS("RS Bersalin Limijati","-6.906538","107.613884"));
////		dRSh.addRS(new DataRS("RS Ibu dan Anak Hermina Pasteur","-6.896201","107.589033"));
////		dRSh.addRS(new DataRS("RS Santo Borromeus","-6.894208","107.613913"));
////		dRSh.addRS(new DataRS("RS Bhayangkara sartika Asih","-6.956283","107.612958"));
////		dRSh.addRS(new DataRS("RS Bina Sehat","-6.974166","107.617994"));
////		dRSh.addRS(new DataRS("RS Ginjal Ny RA Habibie","-6.885121","107.619714"));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
//////		dRSh.addRS(new DataRS("","",""));
////		
////		ArrayList<DataRS> dR = dRSh.getSemuaRS();
//		String[] dR = {"Samsung","Sony","Apple","LG","Motorola",
//				"HTC","Acer","Lenovo","Oppo","Nokia","BlackBerry","Huawei",
//				"ZTE","Meizu","HP","Asus","Panasonic"};
//		
//		ArrayAdapter adapter = new ArrayAdapter<DataRS>(this, R.layout.detail);
//		ListView listView = (ListView) findViewById(R.id.id_list);
//		listView.setAdapter(adapter);
//	}
//
////	@Override
////	public boolean onCreateOptionsMenu(Menu menu) {
////		// Inflate the menu; this adds items to the action bar if it is present.
////		getMenuInflater().inflate(R.menu.daftar, menu);
////		return true;
////	}
////
////	@Override
////	public boolean onOptionsItemSelected(MenuItem item) {
////		// Handle action bar item clicks here. The action bar will
////		// automatically handle clicks on the Home/Up button, so long
////		// as you specify a parent activity in AndroidManifest.xml.
////		int id = item.getItemId();
////		if (id == R.id.action_settings) {
////			return true;
////		}
////		return super.onOptionsItemSelected(item);
////	}
//	-----------------------
	protected ListView lv;
	 protected ListAdapter adapter;
	 SQLiteDatabase db;
	 Cursor cursor;
	 EditText et_db;
	 
	@SuppressWarnings("deprecation")
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_daftar);
	 
	db = (new dataRSHandler(this)).getWritableDatabase();
	 lv = (ListView) findViewById(R.id.lv);
	 et_db =(EditText) findViewById(R.id.et);
	 
	try{
	 cursor = db.rawQuery("SELECT * FROM tum ORDER BY nama ASC", null);
	 adapter = new SimpleCursorAdapter(this, R.layout.detail, cursor, new String[] {"nama", "nama_latin", "img"}, new int[] {R.id.tv_nama, R.id.tv_nama_latin, R.id.imV});
	 lv.setAdapter(adapter);
	 lv.setTextFilterEnabled(true);
	 lv.setOnItemClickListener(new OnItemClickListener() {
	 
	@Override
	 public void onItemClick(AdapterView<?> parent, View v,
	 int position, long id) {
	 detail(position);
	 
	}
	 });
	 }catch(Exception e){
	 e.printStackTrace();
	 }
	 
	}
	 
	@SuppressWarnings("deprecation")
	 public void search_db(View v){
	 String edit_db = et_db.getText().toString();
	 if(!edit_db.equals("")){
	 try{
	 cursor = db.rawQuery("SELECT * FROM tum WHERE nama LIKE ?", new String[] {"%" +edit_db+ "%"});
	 adapter = new SimpleCursorAdapter(this, R.layout.detail, cursor, new String[] {"nama", "nama_latin", "img"}, new int[] {R.id.tv_nama, R.id.tv_nama_latin, R.id.imV});
	 if(adapter.getCount() == 0){
	 Toast.makeText(this, "Tidak ditemukan data dengan kata kunci "+edit_db+"", Toast.LENGTH_SHORT).show();
	 }else{
	 lv.setAdapter(adapter);
	 }
	 }catch(Exception e){
	 e.printStackTrace();
	 }
	 }else{
	 try{
	 cursor = db.rawQuery("SELECT * FROM tum ORDER BY nama ASC", null);
	 adapter = new SimpleCursorAdapter(this, R.layout.detail, cursor, new String[] {"nama", "nama_latin", "img"}, new int[] {R.id.tv_nama, R.id.tv_nama_latin, R.id.imV});
	 lv.setAdapter(adapter);
	 lv.setTextFilterEnabled(true);
	 }catch(Exception e){
	 e.printStackTrace();
	 }
	 }
	 }
	 
	public void detail(int position){
	 int im = 0;
	 String _id = "";
	 String nama = "";
	 String latin = "";
	 String khasiat = "";
	 if(cursor.moveToFirst()){
	 cursor.moveToPosition(position);
	 im = cursor.getInt(cursor.getColumnIndex("img"));
	 nama = cursor.getString(cursor.getColumnIndex("nama"));
	 latin = cursor.getString(cursor.getColumnIndex("nama_latin"));
	 khasiat = cursor.getString(cursor.getColumnIndex("khasiat"));
	 }
	 
	Intent iIntent = new Intent(this, DaftarActivity.class);
	 iIntent.putExtra("dataIM", im);
	 iIntent.putExtra("dataNama", nama);
	 iIntent.putExtra("dataLatin", latin);
	 iIntent.putExtra("dataKhasiat", khasiat);
	 setResult(RESULT_OK, iIntent);
	 startActivityForResult(iIntent, 99);
	 }
}
