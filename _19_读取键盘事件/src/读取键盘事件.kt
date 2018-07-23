/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    while (true) {
        println("请输入第一个数字")
        var num1Str = readLine()
        println("请输入第二个数字")
        var num2Str = readLine()

        try {
            //？：表示当前是否对象可以为空
            //！！：表示当前对象不为空的情况下执行
            var num1: Int = num1Str!!.toInt()
            var num2: Int = num2Str!!.toInt()

            println("${num1}+${num2}=${num1 + num2}")
        } catch (e: Exception) {
            println(e.message)
        }
    }
}