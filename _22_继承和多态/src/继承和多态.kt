/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    var fathor = Fathor("小头爸爸")
    var son = Son("大头儿子")
    println("儿子性格${son.chactor}")
    son.action()
    son.eat()

    var hList = listOf<Human>(fathor,son)
    for (human in hList) {
        human.eat()
    }
}