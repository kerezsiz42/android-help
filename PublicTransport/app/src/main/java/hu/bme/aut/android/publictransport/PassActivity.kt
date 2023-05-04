package hu.bme.aut.android.publictransport

import android.os.Bundle
import androidx.activity.ComponentActivity
import hu.bme.aut.android.publictransport.databinding.ActivityPassBinding

class PassActivity : ComponentActivity() {
    private lateinit var binding: ActivityPassBinding

    companion object {
        const val KEY_DATE_STRING = "KEY_DATE_STRING"
        const val KEY_TYPE_STRING = "KEY_TYPE_STRING"
    }
//M0W4LW
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTicketType.text = intent.getStringExtra(KEY_TYPE_STRING)
        binding.tvDates.text = intent.getStringExtra(KEY_DATE_STRING)
    }
}