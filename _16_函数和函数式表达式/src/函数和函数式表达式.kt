/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {

    var i = {x:Int,y:Int -> x+y}
    var j:(Int,Int)->Int = {x,y -> x+y}

    println(add1(3, 5))
    println(add2(3, 5))
    println(i(3, 5))
    println(j(3, 5))
}

fun add1(x:Int,y:Int):Int{
    return x+y
}

fun add2(x:Int,y:Int):Int = x+y
