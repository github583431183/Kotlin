/**
 * Created by wujiazhen on 2018/7/21.
 */

fun main(args: Array<String>) {
    gradeStudent(5)
    strTemp("笔记本")
}

fun gradeStudent(score:Int){
    when(score){
        10 -> println("满分")
        9 -> println("不错")
        8 -> println("可以")
        7 -> println("努力")
        6 -> println("及格")
        else -> println("加油")
    }
}

fun strTemp(placeName:String){
    var str = """我的${placeName} ${numToChinese(placeName.length)}"""
    println(str)
}

fun numToChinese(num:Int):String{
    var str = when(num){
        1 -> "一"
        2 -> "二"
        else -> "其他"
    }
    return str
}