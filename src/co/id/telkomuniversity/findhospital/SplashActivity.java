package co.id.telkomuniversity.findhospital;

import com.google.android.gms.common.api.GoogleApiClient;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashActivity extends Activity {
	private static final int SPLASH_TIME = 2 * 1000;// Set waktu 2 Detik
	ProgressBar prg;
	GoogleApiClient googleApiClient;
    Location lastLocation;
    TextView lokasi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		StartAnimations();
		
		prg = (ProgressBar)findViewById(R.id.progressBar1);//Tampilan progress Bar
		prg.setAlpha(SPLASH_TIME);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent intent = new Intent(SplashActivity.this,HospitalActivity.class);
				startActivity(intent);
				finish();
			}
		}, SPLASH_TIME);
		
		new Handler().postDelayed(new Runnable() {
			  @Override
			  public void run() {
			         } 
			    }, SPLASH_TIME);
	}
	
	private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
//        anim.reset();
//        RelativeLayout l=(RelativeLayout) findViewById(R.id.splash);
//        l.clearAnimation();
//        l.startAnimation(anim);
        
        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.logo);
        iv.clearAnimation();
        iv.startAnimation(anim);
           
    }
	

}
