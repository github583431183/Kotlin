/**
 * Created by wujiazhen on 2018/7/23.
 */
data class Girl(var name:String,var age:Int,var address:String)

var list = listOf<Girl>(
        Girl("1",1,"1"),
        Girl("2",2,"2"),
        Girl("3",2,"3"),
        Girl("4",4,"4"),
        Girl("5",5,"4")
)

//DSL 领域特定语言
//中缀表达式
infix fun List<Girl>.查找年龄(age:Int){
    filter {
        it.age<age
    }.forEach(::println)
}

fun main(args: Array<String>) {
    println(list.count())
    //maxBy 最大值
    println(list.maxBy { it.age })
    //filter 过滤
    println(list.filter { (it.age > 3) and (it.address == "4") })
    //map 映射成新的集合
    println(list.map { "${it.name}:${it.age}" })
    //any 满足条件的数据
    println(list.any { it.age == 1 })
    //find 查找符合条件的数据并返回第一个
    println(list.find { it.address == "1" })
    //groupBy 分组
    val message = list.groupBy { it.address }
    println(message)
    println(message["1"])

    list 查找年龄 1
}