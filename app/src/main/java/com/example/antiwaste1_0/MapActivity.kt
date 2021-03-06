package com.example.antiwaste1_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.data.kml.KmlLayer

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)






    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


        val layer = KmlLayer(
            mMap,
            R.raw.raw_map,
            this@MapActivity)
        layer.addLayerToMap()


        // Add marker in Sydney and move camera
        val sydney = LatLng(-34.0, 151.0)

        mMap.addMarker(MarkerOptions().position(sydney).title("This is sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

}