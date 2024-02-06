class Triangle (length: Double,var width: Double) : Shape("Triangle", length), TwoDimensional {
    override fun getSize(): String {
        length.toString()
        width.toString()
        var fixedlength = "%.3f".format(length)
        var finxedwidth = "%.3f".format(width)
        var size = "$fixedlength,$finxedwidth"
        return size
    }

    override fun area(): Double {
        var area = 0.5 * width * length
        return area
    }

    override fun perimeter(): Double {
        var widthhalf = width/2
        var Pythagorean =Math.sqrt(Math.pow(widthhalf,2.0) + Math.pow(length,2.0))
        var peri = Pythagorean+Pythagorean+ width
        return peri
    }
}