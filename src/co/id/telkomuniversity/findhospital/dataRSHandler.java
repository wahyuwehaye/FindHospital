package co.id.telkomuniversity.findhospital;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dataRSHandler extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;
	final static String DB_NAME = "db_tum_obat";

	public dataRSHandler(Context context) {
		super(context, DB_NAME, null, DATABASE_VERSION);
		
	}

	@Override
	 public void onCreate(SQLiteDatabase db) {
	 String sql = "CREATE TABLE IF NOT EXISTS tum(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, alamat TEXT, notelp TEXT, img BLOB)";
	 db.execSQL(sql);
	 
	ContentValues values = new ContentValues();
	 values.put("_id", "1");
	 values.put("nama", "Rs al Islam");
	 values.put("alamat", "Jl. Soekarno Hatta No 644, Bandung");
	 values.put("notelp", "(022) 7565588");
	 values.put("img", R.drawable.ic_launcher); //im31 nama file gambar dengan ukuran 80 x 80 pixel yang ada di folder res/drawable pada project
	 db.insert("tum", "_id", values);
	 
	values.put("_id", "2");
	 values.put("nama", "RS Bersalin Astana Anyar");
	 values.put("alamat", "Jl. Astana Anyar No 224, Bandung");
	 values.put("notelp", "(022) 5201139");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	values.put("_id", "3");
	 values.put("nama", "RS Bersalin Emma Poeradiredja");
	 values.put("alamat", "Jl. Sumatera No 46-48, Bandung");
	 values.put("notelp", "(022) 4206544");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	values.put("_id", "4");
	 values.put("nama", "RS Bersalin Limijati");
	 values.put("alamat", "Jl. Laks L. RE Martadinata No 39");
	 values.put("notelp", "(022) 4207770");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "5");
	 values.put("nama", "RS Ibu dan Anak Sukajadi");
	 values.put("alamat", "Jl. Sukajadi No 149, Bandung");
	 values.put("notelp", "(022) 2032941");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "6");
	 values.put("nama", "RS Ibu dan Anak Hermina Pasteur");
	 values.put("alamat", "Jl. Dr Djundjunan No 107, Bandung");
	 values.put("notelp", "(022) 6072525");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "7");
	 values.put("nama", "RS Santo Borromeus");
	 values.put("alamat", "Jl. Ir. H. Juanda No 100, Bandung");
	 values.put("notelp", "2552000");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "8");
	 values.put("nama", "RS Bhayangkara Sartika Asih");
	 values.put("alamat", "Jl. Moh Toha No 369, Bandung");
	 values.put("notelp", "5229544");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "9");
	 values.put("nama", "RS Bina Sehat");
	 values.put("alamat", "Jl. Raya Dayeuhkolot No 325, Bandung");
	 values.put("notelp", "(022) 5207965");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "10");
	 values.put("nama", "RS Dr Salamun");
	 values.put("alamat", "Jl. Ciumbuleuit No 203, Bandung");
	 values.put("notelp", "(022) 2034941");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "11");
	 values.put("nama", "RS Ginjal Ny RA Habibie");
	 values.put("alamat", "Jl. Tubagus Ismail No 46, Bandung");
	 values.put("notelp", "(022) 2501985");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "12");
	 values.put("nama", "RS Immanuel");
	 values.put("alamat", "Jl. Kopo No 161, Bandung");
	 values.put("notelp", "(022) 5201656");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "13");
	 values.put("nama", "RS Islam Al Ihsan");
	 values.put("alamat", "Jl. Kiastramanggala Kabupaten Bandung");
	 values.put("notelp", "(022) 5940872");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "14");
	 values.put("nama", "RS Umum Ujung Berung");
	 values.put("alamat", "Jl. Rumah Sakit No 22, Bandung");
	 values.put("notelp", "(022) 7811794");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "15");
	 values.put("nama", "RS Kebonjati");
	 values.put("alamat", "Jl. Kebonjati No 152, Bandung");
	 values.put("notelp", "(022) 6014058");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "16");
	 values.put("nama", "RS Lanud Sulaiman");
	 values.put("alamat", "Jl. Terusan Kopo, Bandung");
	 values.put("notelp", "(022) 5409608");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "17");
	 values.put("nama", "RS Advent");
	 values.put("alamat", "Jl. Cihampelas No 161, Bandung");
	 values.put("notelp", "(022) 2034386");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "18");
	 values.put("nama", "RS Mata Cicendo");
	 values.put("alamat", "Jl. Cicendo No 4, Bandung");
	 values.put("notelp", "(022) 4231280");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "19");
	 values.put("nama", "RS Mitra Kasih");
	 values.put("alamat", "Jl. Raya Cibabat No 341, Bandung");
	 values.put("notelp", "6654852");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	 
	 values.put("_id", "20");
	 values.put("nama", "RS Muhammadiyah");
	 values.put("alamat", "Jl. KH Achmad Dahlan No 53, Bandung");
	 values.put("notelp", "7301062");
	 values.put("img", R.drawable.ic_launcher);
	 db.insert("tum", "_id", values);
	}
	 
	@Override
	 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	 db.execSQL("DROP TABLE IF EXISTS tum");
	 onCreate(db);
	 
	}
	 

}
