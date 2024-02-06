import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Square(length: Double) : Shape("Square", length),TwoDimensional {

    override fun getSize(): String {
        length.toString()
        var fixedlength = "%.3f".format(length)
        return fixedlength
    }
    override fun area(): Double {
        return (length * length)
    }
    override fun perimeter(): Double {
        return (length + length + length + length)
    }
}