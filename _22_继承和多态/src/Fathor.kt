/**
 * Created by wujiazhen on 2018/7/23.
 */
open class Fathor(name:String) : Human(name){
    override fun eat() {
        println("${name}吃饭")
    }

    var chactor:String = "性格内向"
    open fun action(){
        println("哈哈")
    }
}