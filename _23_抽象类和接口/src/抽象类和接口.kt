/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    /*
    接口是事物的能力
    抽象类是事物的本质
    */

    var man = Man()
    man.xdd()
    man.eat()

    var taijian = TaiJian()
    taijian.eat()

    var hList = listOf<Human>(man,taijian)
    for (human in hList) {
        if (human is IMan){
            human.eat()
        }
    }

}