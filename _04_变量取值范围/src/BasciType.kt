/**
 * Created by wujiazhen on 2018/7/21.
 */
fun main(args: Array<String>) {
    val aByte:Byte = Byte.MAX_VALUE
    val bByte:Byte = Byte.MIN_VALUE
    println("Byte的最大值："+aByte)
    println("Byte的最小值："+bByte)

    val aLong:Long = Long.MAX_VALUE
    val bLong:Long = Long.MIN_VALUE
    println("Long的最大值："+aLong)
    println("Long的最小值："+bLong)

    //二进制赋值
    val aInt:Int = 0b0011
    println("aInt的值："+aInt)
}