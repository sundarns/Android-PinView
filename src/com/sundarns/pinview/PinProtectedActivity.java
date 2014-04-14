package com.sundarns.pinview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PinProtectedActivity extends Activity {

	Button enterPin;
	Context appContext;
	private boolean pinEntryShown;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		appContext = this;
		
		setContentView(R.layout.activity_pin_protected_activity);
		
		enterPin = (Button) findViewById(R.id.buttonEnterPin);
		
		enterPin.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		    
		    	
		    	Intent intent = new Intent(appContext, PinEntryView.class);
		    	startActivity(intent);
		    }
		    
		    }
		);
		
	}
    @Override
    public void onResume() {
        super.onResume();
        // If the PIN Entry screen is not shown then show this when the app starts or when the app returns from the background
        if (!pinEntryShown) {
            Intent intent = new Intent(this, PinEntryView.class);
            startActivity(intent);
        }
        // Set the flag of PIN Entry screen to current state
        pinEntryShown = !pinEntryShown;         
    }	
	

}
