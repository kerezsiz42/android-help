package hu.bme.aut.android.publictransport

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import hu.bme.aut.android.publictransport.databinding.ActivityListBinding

class ListActivity : ComponentActivity() {
    private lateinit var binding: ActivityListBinding

    companion object {
        const val TYPE_BIKE = 1
        const val TYPE_BUS = 2
        const val TYPE_TRAIN = 3
        const val TYPE_BOAT = 4
    }
//M0W4LW
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBike.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_BIKE)
            startActivity(intent)
        }
        binding.btnBus.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_BUS)
            startActivity(intent)
        }
        binding.btnTrain.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_TRAIN)
            startActivity(intent)
        }
        binding.btnBoat.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_BOAT)
            startActivity(intent)
        }
    }
}