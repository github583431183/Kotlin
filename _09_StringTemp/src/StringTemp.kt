/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var s = stringTemp("笔记本")
    println(s)
}
fun stringTemp(placeName:String):String{
    var temple = """
    我的${placeName},${placeName.length}
    """
    return temple
}