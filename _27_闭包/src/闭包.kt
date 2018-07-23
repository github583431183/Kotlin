/**
 * Created by wujiazhen on 2018/7/23.
 */
//函数是一等公民
fun Func(){
    var a = 3
    fun innerFunc(){

    }
}

fun test(){
    var i = 3
    i++
    println(i)
}

/*
闭包 Closure
让函数成为编程语言的一等公民
让函数具有对象所具有的能力(封装)
让函数具有状态
* */
fun test2():()->Unit{
    var i = 3
    return fun(){
        i++
        println(i)
    }
}


fun main(args: Array<String>) {
    test() // 4
    test() // 4
    test() // 4

    println("---")
    var t= test2() // 返回 fun
    t() //4  fun () 调用
    t() //5
    t() //6
    t() //7
}