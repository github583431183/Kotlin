/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var result1 = heat("水")
    //var result11 = heat(null)
    println(result1)
    var result2 = heat问号(null)
    println(result2)
}

//接收一个非空的String类型，加 ？表示参数可以为空
fun heat(str:String):String{
    return "热"+str
}
fun heat问号(str:String?):String{
    return "热"+str
}