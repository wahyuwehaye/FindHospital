package co.id.telkomuniversity.findhospital;

public class DataRS {
	int id;
	String nama, latS, lngS;
	double latitude, longitude;
	
	
	public DataRS() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DataRS(int id, String nama, String latS, String lngS) {
		super();
		this.id = id;
		this.nama = nama;
		this.latS = latS;
		this.lngS = lngS;
	}


	public DataRS(String nama, String latS, String lngS) {
		super();
		this.nama = nama;
		this.latS = latS;
		this.lngS = lngS;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNama() {
		return nama;
	}


	public void setNama(String nama) {
		this.nama = nama;
	}


	public String getLatS() {
		return latS;
	}


	public void setLatS(String latS) {
		this.latS = latS;
	}


	public String getLngS() {
		return lngS;
	}


	public void setLngS(String lngS) {
		this.lngS = lngS;
	}


	public double getLatitude() {
		latitude = Double.parseDouble(latS);
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		longitude = Double.parseDouble(lngS);
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	
}
