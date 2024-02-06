class Circle(length: Double) : Shape("Circle", length), TwoDimensional {


    override fun getSize(): String {
        length.toString()
        var fixedlength = "%.3f".format(length)
        return fixedlength
    }
    override fun area(): Double {
        return length * length * Math.PI
    }


    override fun perimeter(): Double {
        val radius = length
        return 2 * Math.PI * radius
    }

}