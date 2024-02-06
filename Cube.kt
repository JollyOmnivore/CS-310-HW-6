class Cube(length: Double) : Shape("Cube", length),ThreeDimensional {


    override fun getSize(): String {
        length.toString()
        var fixedlength = "%.3f".format(length)
        return fixedlength
    }
    override fun volume(): Double {
        return (length * length * length)
    }


    override fun surfaceArea(): Double {
        var surfaceArea = (length * length)
        surfaceArea = surfaceArea * 6
        return surfaceArea
    }
}