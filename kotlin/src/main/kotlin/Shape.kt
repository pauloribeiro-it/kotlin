open class Shape {
    open val vertexCount: Int = 0
    open fun draw() { }
    fun fill() { }
}

class Rectangle : Shape() {
    override val vertexCount = 4
}

class Circle() : Shape() {
    override fun draw() { }
}