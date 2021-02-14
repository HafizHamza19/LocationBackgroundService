package com.hafizhamza.locationbgservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int PERMISSION_ALL = 1;

    String[] PERMISSIONS = {
            Manifest.permission.ACCESS_FINE_LOCATION
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
    }

    public void StopService(View view) {
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        stopService(new Intent(this, LocationService.class));

    }
    public void StartService(View view) {
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
        startService(new Intent(this, LocationService.class));

    }
}
