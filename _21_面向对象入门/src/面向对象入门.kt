/**
 * Created by wujiazhen on 2018/7/23.
 */

class Rect(var height:Int,var width:Int)

class Girl(var chactor:String,var voice:String){
    fun smile(){
        println("笑")
    }
    fun cry(){
        println("哭")
    }
}
fun main(args: Array<String>) {
    var rect01 = Rect(20,20)
    println("矩形的高度:${rect01.height}")
    println("矩形的宽度:${rect01.width}")

    var girl = Girl("彪悍","甜美")
    println("girl的声音:${girl.voice}")
    girl.smile()
    girl.cry()
}

