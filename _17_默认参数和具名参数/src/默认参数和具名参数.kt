/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var a = 获取长方形面积(3.0f,3.0f)
    println(a)

    //具名参数
    a = 获取圆的面积_半径(半径 = 2.0f)
    println(a)
}

val pi = 3.14159f

fun 获取长方形面积(长:Float,宽:Float):Float{
    return 长*宽
}
//默认参数
fun 获取圆的面积_半径(PI:Float = pi,半径:Float):Float{
    return 2*PI*半径
}

fun 获取圆的周长_直径(PI:Float,直径:Float):Float{
    return 2*PI*直径
}

fun 圆柱体体积(PI:Float,半径:Float,高:Float):Float{
    return PI*半径*半径*高
}

fun 获取球体的表面积(PI:Float,半径:Float):Float{
    return PI*半径*半径*4
}