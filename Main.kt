import kotlin.random.Random

fun drand(random: Random): Double{
    return random.nextDouble(0.0,100.0)
}

fun main() {
    val size = 20
    val random = Random(size)
    val shapes = arrayOfNulls<Shape>(size)
    for(i in 0 until size){
        when(random.nextInt(8)){
            0 -> shapes[i] = Square(drand(random))
            1 -> shapes[i] = Circle(drand(random))
            2 -> shapes[i] = Cube(drand(random))
            3 -> shapes[i] = Sphere(drand(random))
            4 -> shapes[i] = Triangle(drand(random), drand(random))
            5 -> shapes[i] = Rectangle(drand(random), drand(random))
            6 -> shapes[i] = Cylinder(drand(random), drand(random))
            7 -> shapes[i] = Cone(drand(random), drand(random))
        }
    }

    for(shape in shapes){
        when(shape){
            is TwoDimensional -> {
                println(String.format("%s (%s): area = %.3f, perimeter = %.3f", shape.type, shape.getSize(), shape.area(), shape.perimeter()))
            }
            is ThreeDimensional -> {
                println(String.format("%s (%s): volume = %.3f, surface area = %.3f", shape.type, shape.getSize(), shape.volume(), shape.surfaceArea()))
            }
        }

    }

}