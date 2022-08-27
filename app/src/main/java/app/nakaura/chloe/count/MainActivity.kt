package app.nakaura.chloe.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakaura.chloe.count.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.plusButton.setOnClickListener{
            number = number + 1
            changeText()
        }

        binding.minusButton.setOnClickListener{
            number = number - 1
            changeText()
        }

        binding.clearButton.setOnClickListener{
            number = 0
            changeText()
        }

    }

    fun changeText() {
        if (number != 0 && number % 3 == 0){
            binding.numberTextView.setTextColor(Color.GREEN)
        }else{
            binding.numberTextView.setTextColor(Color.BLACK)
        }
        binding.numberTextView.text = number.toString()
    }
}