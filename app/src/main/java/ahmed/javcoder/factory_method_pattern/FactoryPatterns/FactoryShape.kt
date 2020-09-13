package ahmed.javcoder.factory_method_pattern.FactoryPatterns

class FactoryShape {

    companion object {
        fun getShapeType(shape :String) : Shape? {
            when(shape) {
                "Circle" -> return Circle()
                "Square" -> return Square()
                "Rectangle" -> return Rectangle()
                else -> return null
            }
        }
    }
}