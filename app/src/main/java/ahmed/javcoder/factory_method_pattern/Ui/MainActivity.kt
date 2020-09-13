package ahmed.javcoder.factory_method_pattern.Ui

import ahmed.javcoder.factory_method_pattern.FactoryPatterns.FactoryShape
import ahmed.javcoder.factory_method_pattern.FactoryPatterns.Shape
import ahmed.javcoder.factory_method_pattern.R
import ahmed.javcoder.factory_method_pattern.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding :  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        val shape: Shape? = FactoryShape.getShapeType("Circle")
        val shape2 : Shape? = FactoryShape.getShapeType("Rectangle")
        val shape3 : Shape? = FactoryShape.getShapeType("Square")
        binding.circleId.setOnClickListener(){
            binding.shapeTypeId.text = shape?.draw("this is circle shape")
        }
        binding.rectangleId.setOnClickListener(){
            binding.shapeTypeId.text = shape2?.draw("this is rectangle shape")
        }
        binding.squareId.setOnClickListener(){
            binding.shapeTypeId.text = shape3?.draw("this is square shape")
        }


    }
}