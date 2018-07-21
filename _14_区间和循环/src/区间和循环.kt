/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    var nums = 1 .. 100 //[1,100]
    var plus = 0
    for (num in nums){
        plus += num
    }
    println("结果:"+plus)

    var untilNums = 1 until 100 //[1,100)
    println(untilNums)

    for (num in untilNums step 2){
        print("${num} ,")
    }
    println()
    val reversed = untilNums.reversed()
    println(reversed)
    println("总数为："+reversed.count())
}