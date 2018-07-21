/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var str1 = "haha"
    var str2 = "haha"
    println(str1.equals(str2))
    println(str1 == str2) // == 非内存地址比较
    println(str1.equals(str2,true))//忽略大小写
}