class Sphere(length: Double) : Shape("Sphere", length),ThreeDimensional {
    override fun getSize(): String {
        var fixedlength = "%.3f".format(length.toString())
        return fixedlength
    }
    override fun volume(): Double {
        return 4.0 / 3 * Math.PI * length * length * length
    }


    override fun surfaceArea(): Double {
        var sarea: Double = length * length * Math.PI
        sarea = sarea * 4
        return sarea
    }


}