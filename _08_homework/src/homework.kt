/**
 * Created by wujiazhen on 2018/7/21.
 */
fun sayHello(name:String):String{
    return "hello"+name
}
fun checkAge(age:Int):Boolean{
    if (age>18)return true else return false
}
fun saveLog(logLevel:Int){

}

fun main(args: Array<String>) {
    println(sayHello("haha"))
    println(checkAge(1))
}