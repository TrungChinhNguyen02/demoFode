package com.example.demofode


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class activity_maps : AppCompatActivity(), OnMapReadyCallback {
    var mGoogleMap: GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        mGoogleMap
        val sydney = LatLng(-34.0, 151.0) // toạ độ location

        mGoogleMap?.addMarker(
            MarkerOptions() // thêm tiêu vào vị trí toạ độ
                .position(sydney)
                .title("Marker in Sydney")
        )
        mGoogleMap?.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

}