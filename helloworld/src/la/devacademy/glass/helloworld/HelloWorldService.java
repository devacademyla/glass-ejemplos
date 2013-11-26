package la.devacademy.glass.helloworld;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HelloWorldService extends Service {

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Intent mainActivity = new Intent(HelloWorldService.this,
				MainActivity.class);
		mainActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(mainActivity);
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

}