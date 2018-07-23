/**
 * Created by wujiazhen on 2018/7/23.
 */
/*var print = fun print(name:String):Unit{
    println(name)
}*/
var printName = fun (name:String):Unit{
    println(name)
}

fun main(args: Array<String>) {
    var names = listOf<String>("1","2","3")
    //(T) -> Unit
    //(String) -> Unit
    //for (element in this) action(element)
    names.forEach(printName)
    names.forEach {
        name -> println(name)
    }
    names.forEach {
        println(it) // 默认 参数 it
    }
}