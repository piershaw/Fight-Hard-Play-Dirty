package com.TP;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebView;

public class Browserview extends Activity {
	private static final String urlText = "http://pixeltactics.com/";
	private WebView webview;
	// ...
	@Override
	public void onCreate(Bundle web) {
		 super.onCreate(web); 
		 setContentView(R.layout.webview);
		 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		 webview = (WebView) findViewById(R.id.webview);
		 webview.getSettings().setJavaScriptEnabled(true);
		 webview.loadUrl(urlText);

	}
	
}
	
