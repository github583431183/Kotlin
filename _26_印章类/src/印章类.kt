/**
 * Created by wujiazhen on 2018/7/23.
 */

/*
印章类 更在意 类型
枚举 更在意 数据
* */
sealed class Son{
    fun sayHello(){
        println("大家好!")
    }
    class 小小驴:Son()
    class 小小骡:Son()
}

fun main(args: Array<String>) {
    var s1:Son = Son.小小驴()
    var s2:Son = Son.小小骡()
    var s3:Son = Son.小小驴()

    var list = listOf<Son>(s1,s2,s2)
    for (son in list) {
        if (son is Son.小小骡){
            son.sayHello()
        }
    }
}