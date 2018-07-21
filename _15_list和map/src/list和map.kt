import java.util.*

/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var lists = listOf("买鸡蛋","买大米")
    for ((i,e) in lists.withIndex()) {
        println("$i $e")
    }
    for (list in lists.withIndex()) {
        println(list)
    }
    /*
    0 买鸡蛋
    1 买大米
    IndexedValue(index=0, value=买鸡蛋)
    IndexedValue(index=1, value=买大米)
    */

    var map = TreeMap<String,String>()
    map["好"] = "good"
    map["学习"] = "study"
    println(map["好"])
}