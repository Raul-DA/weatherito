package mx.uach.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class cityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "CITY"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        val btnCuu = findViewById<Button>(R.id.btnCuu)
        val btnMexico = findViewById<Button>(R.id.btnMexico)

        btnCuu.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Chihuahua", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "CUU")
            startActivity(intent)
        })


        btnMexico.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "México", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "MEXICO")
            startActivity(intent)
        })
    }
}
