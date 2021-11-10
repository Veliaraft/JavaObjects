open class Square(edge: Double){
    protected var Edge: Double = 0.0;
    protected val center: ArrayList<Double> = arrayListOf(0.0, 0.0);
    init {
        Edge = edge;
        center[0] = edge/2;
        center[1] = edge/2;
    }
    public fun diagonal(): Double = Math.sqrt(Edge*Edge + Edge*Edge)
}

class Rectangle(edge: Double, width: Double): Square(edge) {
    private var Width: Double = 0.0;
    init{
        Edge = edge;
        Width = width;
        center[0] = edge/2;
        center[1] = width/2;
    }
    public fun rectangle_area(): Double = Edge*Width;
}

fun main(){
    val sqr: Square = Square(2.0);
    println("Диагональ созданного нами квадрата равна " + sqr.diagonal());
    var rect: Rectangle = Rectangle(2.0, 4.0);
    println("Площадь созданного нами прямоугольника равна " + rect.rectangle_area())
}