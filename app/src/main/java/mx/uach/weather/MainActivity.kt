package mx.uach.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ciudad = intent.getStringExtra("CITY")
        //Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.google.com"

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url, Response.Listener<String> { response ->
                //Map using google GSON to convert JSON to Kotlin Object
                Log.i("DATA", response.toString())
            }, Response.ErrorListener { error ->
                Log.i("DATA", "eroooorrrr" +error)
            })

        // Add the request to the RequestQueue.
        queue.add(stringRequest)

    }
}
