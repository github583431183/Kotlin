/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var a = 8
    var b = 5
    println("${a}和${b}中较大的那个数的值为${returnBig(a,b)}")
}

fun returnBig(a:Int,b:Int):Int{
    if (a>b)return a else return b
}