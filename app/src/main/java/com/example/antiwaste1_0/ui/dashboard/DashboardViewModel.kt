package com.example.antiwaste1_0.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.antiwaste1_0.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

}


/**
class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    /**
     * In the onCreate method of your activity,
     * call the setContentView method and set the layout file as the content view
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_maps)
    }

    /**
     * Use the onMapReady callback method to get a handle to the GoogleMapobject
     * callback is triggered when the map is ready to receive user input
     * provides a non-null instance of the GoogleMap class that you can use to update the map.
     * In this example the onMapReady callback retrieves a handle to the GoogleMap object
     * and then a marker is added to the map
     */

    val mapFragment = supportFragmentManager
        .findFragmentById(R.id.map) as SupportMapFragment?
    mapFragment?.getMapAsync(this)




    override fun onMapReady(p0: GoogleMap?) {
        TODO("Not yet implemented")
    }
}
**/