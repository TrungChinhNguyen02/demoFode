package com.example.demofode

//import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MediatorLiveData
import com.example.demofode.databinding.ActivityMainBinding
//import com.google.android.gms.maps.GoogleMap


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
//    var mGoogleMap: GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val txtView = binding.txtLive
//        val liveDataA = MutableLiveData<String>()
//        val liveDataB = MutableLiveData<String>()
//        val mediatorLiveData = MediatorLiveData<String>()

        //2.1 tao quan sát
//        mediatorLiveData.addSource(
//            liveDataA
//        ) { s -> mediatorLiveData.setValue(s) }
//        mediatorLiveData.addSource(
//            liveDataB
//        ) { s -> mediatorLiveData.setValue(s) }
//        mediatorLiveData.observe(
//            this
//        ) { s -> txtView.setText(s) }


        //2.2

//         1. khoi tao livedata trong class
//        var liveData: MutableLiveData<String> = MutableLiveData()
//        var liveData : MutableLiveData<String> =  MutableLiveData()
        //2.tao quan sat du lieu thay doi trong class
//        val observerLiveData: Observer<String> =
//            Observer<String> { s ->
//                txtView.setText(s)
//            }
        //3 dang kí quan sát trong oncreate (activity hoặc onAttrach(fragment)
//        liveData.observe(this, observerLiveData);
//
//        binding.btnlivedata.setOnClickListener{
//
//            Toast.makeText(this@MainActivity, "hello", Toast.LENGTH_SHORT).show()
//
//        }
//        binding.btnlivedata.setOnClickListener {
//            var number : Double = Math.random()
//            liveData.setValue(number.toString())
//        }
//
//        binding.btnlivedataB.setOnClickListener {
//            var number : Double = Math.random()
//            liveDataB.setValue(number.toString())
//        }
// đồng bộ fragment map
        // đồng bộ fragment map
//            val mapFragment = supportFragmentManager
//                .findFragmentById(R.id.map) as SupportMapFragment?
//            mapFragment!!.getMapAsync(this)
//    }
//
//    override fun onMapReady(p0: GoogleMap) {
//        mGoogleMap
//        val sydney = LatLng(-34.0, 151.0) // toạ độ location
//
//        mGoogleMap!!.addMarker(
//            MarkerOptions() // thêm tiêu vào vị trí toạ độ
//                .position(sydney)
//                .title("Marker in Sydney")
//        )
//        mGoogleMap!!.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}