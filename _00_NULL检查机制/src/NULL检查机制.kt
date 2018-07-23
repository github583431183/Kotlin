/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    //类型后面加?表示可为空
    var age: String? = "23"
    println(age)//23
    //抛出空指针异常
    //age=null
    val ages = age!!.toInt()//Exception in thread "main" kotlin.KotlinNullPointerException
    println(ages)//23
    //不做处理返回 null
    age = null
    val ages1 = age?.toInt()
    println(ages1)//null
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(ages2)//-1
}