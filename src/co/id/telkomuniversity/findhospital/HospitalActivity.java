package co.id.telkomuniversity.findhospital;

import java.util.ArrayList;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.maps.MapFragment;


import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class HospitalActivity extends FragmentActivity implements OnMapReadyCallback {
	private GoogleMap map;
	protected LocationManager locationManager;
	private Button daftarRS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital);
		
		MapFragment mapFragment = (MapFragment) getFragmentManager()
				.findFragmentById(R.id.fragment);
		mapFragment.getMapAsync(this);
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragment)).getMap();
		map.setMyLocationEnabled(true);
			

		Button go = (Button)findViewById(R.id.daftarRS);
		 
        go.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(HospitalActivity.this, DaftarActivity.class);
                i.putExtra("pesan", "From Main");
                startActivity(i);
            }
        });
	}
	
	public void onMapReady(GoogleMap googleMap) {
		
		LocationRequest mLocationRequest = new LocationRequest();
	    mLocationRequest.setInterval(10000);
	    mLocationRequest.setFastestInterval(5000);
	    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
	    
		LocationManager locationManager = (LocationManager)
		        getSystemService(Context.LOCATION_SERVICE);
		Criteria criteria = new Criteria();

		String provider = locationManager.getBestProvider(criteria, true);
		Location location = locationManager.getLastKnownLocation(locationManager
		        .getBestProvider(criteria, false));
		
		double latitude = location.getLatitude();
		double longitude = location.getLongitude();
		
		LatLng disini = new LatLng(latitude, longitude);
		
        googleMap.addMarker(new MarkerOptions().position(disini).title("Saya Disini"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(disini));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo( 17.0f ) );
        

    }
	
//	protected void showNotif() {
//        
//            String message = "ini Wahyu";
//            Toast.makeText(this, message,
//                    Toast.LENGTH_LONG).show();
//            
//        
//    }

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.hospital, menu);
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
}
