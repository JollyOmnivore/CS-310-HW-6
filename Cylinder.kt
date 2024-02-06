import kotlin.math.PI

class Cylinder(length: Double,var height: Double) : Shape("Cylinder", length),ThreeDimensional {
    override fun getSize(): String {
        length.toString()
        height.toString()
        var fixedlength = "%.3f".format(length)
        var finxedwidth = "%.3f".format(height)
        var size = "$fixedlength,$finxedwidth"
        return size
    }

    override fun surfaceArea(): Double {
        var x1 = 2* PI * length * height
        var x2 = 2* PI * Math.pow(length,2.0)
        var surface = x1 + x2
        return surface
    }

    override fun volume(): Double {
        var R: Double = length/2
        var v = PI * Math.pow(R,2.0) * height
        return v
    }


}