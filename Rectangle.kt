class Rectangle (length: Double,var width: Double) : Shape("Rectangle", length), TwoDimensional {
    override fun getSize(): String {
        length.toString()
        width.toString()
        var fixedlength = "%.3f".format(length)
        var finxedwidth = "%.3f".format(width)
        var size = "$fixedlength,$finxedwidth"
        return size
    }

    override fun area(): Double {
        var ar = length*width
        return ar
    }
    override fun perimeter(): Double {
        var per = length+length+width+width
        return per
    }


}