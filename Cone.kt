import kotlin.math.PI

class Cone(length: Double, var height: Double) : Shape("Cone", length),ThreeDimensional {
    override fun getSize(): String {
        length.toString()
        height.toString()
        var fixedlength = "%.3f".format(length)
        var finxedwidth = "%.3f".format(height)
        var size = "$fixedlength,$finxedwidth"
        return size
    }

    override fun surfaceArea(): Double {
        var R = length
        var para = R + Math.sqrt(Math.pow(height,2.0)+ Math.pow(R,2.0))
        var out = PI * R
        var area = out * para
        return area
    }

    override fun volume(): Double {
        var R = length/2
        var vol  = PI * Math.pow(R,2.0) * height/3
        return vol
    }

}