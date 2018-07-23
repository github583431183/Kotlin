/**
 * Created by wujiazhen on 2018/7/23.
 */
class Fathor : IWashBowl by Son{
    override fun washing() {
        println("start")
        Son.washing()
        println("end")
    }
}