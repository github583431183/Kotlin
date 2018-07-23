/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    var a = "123"
    var b = 123

    a = b.toString()

    b = a.toInt()

    var c = "a3"
    //Exception in thread "main" java.lang.NumberFormatException: For input string: "a3"
    //var e = c.toInt()

}