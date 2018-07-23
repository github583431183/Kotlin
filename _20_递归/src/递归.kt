import java.math.BigInteger

/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    //阶乘
    var num = BigInteger("100")
    println(fact(num))

    //累加 1000000000
    //Exception in thread "main" java.lang.StackOverflowError
    println(ollAdd(10,0))
}

//尾递归优化
tailrec fun ollAdd(num:Int,result: Int):Int{
    println("计算机第${num}次元算,result=${result }")
    if(num == 1){
        return 1
    }else{
        return ollAdd(num-1,result+num)
    }
}

fun fact(num:BigInteger):BigInteger{
    if (num == BigInteger.ONE){
        return BigInteger.ONE
    }else{
        return num*fact(num- BigInteger.ONE)
    }
}