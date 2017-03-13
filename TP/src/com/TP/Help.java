package com.TP;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Help extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.help);

setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
}
}