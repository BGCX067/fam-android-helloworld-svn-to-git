package com.example.fam_android_helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView txtMensaje = new TextView(this);
		txtMensaje.setTextSize(40);
		txtMensaje.setText(message);
		
		setContentView(txtMensaje);
		
	}
}
