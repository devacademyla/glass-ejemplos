package la.devacademy.glass.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.google.android.glass.app.Card;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Card card = new Card(this);
		card.setText("Hello World!");
		View view = card.toView();
		setContentView(view);
	}

}