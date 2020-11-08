package qbo.com.appqbogooglemaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMapClickListener,
    GoogleMap.OnMarkerDragListener {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //Agregar el evento para hacer click sobre el mapa.
        mMap.setOnMapClickListener(this)
        //Agregar eventos de arrastre de marcadores
        mMap.setOnMarkerDragListener(this)
        val sydney = LatLng(-12.066957,  -77.035824)
        mMap.addMarker(MarkerOptions()
            .position(sydney)
            .title("IDAT Lima Centro")
            .snippet("Ahora mismo no estamos aqui")
            .draggable(true)
            .flat(true))
        mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16.0f))
    }

    override fun onMapClick(p0: LatLng?) {
        TODO("Not yet implemented")
    }

    override fun onMarkerDragStart(p0: Marker?) {
        TODO("Not yet implemented")
    }

    override fun onMarkerDrag(p0: Marker?) {
        TODO("Not yet implemented")
    }

    override fun onMarkerDragEnd(p0: Marker?) {
        TODO("Not yet implemented")
    }
}