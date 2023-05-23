package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab22toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    fun showMessage(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        showMessage(getString(R.string.ncreate))
    }

    override fun onStart() {
        super.onStart()
        showMessage(getString(R.string.nstart))
    }

    override fun onResume() {
        super.onResume()
        showMessage(getString(R.string.nresume))
    }

    override fun onPause() {
        super.onPause()
        showMessage(getString(R.string.npause))
    }

    override fun onStop() {
        super.onStop()
        showMessage(getString(R.string.nstop))
    }

    override fun onRestart() {
        super.onRestart()
        showMessage(getString(R.string.nrestart))
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage(getString(R.string.ndestroy))
    }
}
