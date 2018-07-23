/**
 * Created by wujiazhen on 2018/7/23.
 */
class WashMachine(var module: String, var size: Int) {
    var isDoorOpen = true
    var currentMode = 0
    fun openDoor() {
        println("开门")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("关门")
        isDoorOpen = false
    }

    fun start() {
        if (isDoorOpen) {
            println("门未关闭")
        } else {
            when (currentMode) {
                0 -> {
                }
                1 -> {
                    println("放水")
                    println("水满")
                    println("转-慢")
                    setMotorSpeed(100)
                    println("洗好")
                }
                2 -> {
                    println("放水")
                    println("水满")
                    println("转-快")
                    setMotorSpeed(2000)
                    println("洗好")
                }
                else -> {
                    println("错误")
                }
            }

        }
    }

    fun selectMode(mode:Int){
        currentMode = mode
        when (currentMode) {
            0 -> {
                println("初始模式")
            }
            1 -> println("轻柔")
            2 -> println("狂柔")
            else -> {
                println("其他")
            }
        }
    }

    private fun setMotorSpeed(speed:Int){
        println("当前转速${speed}圈/秒")
    }
}

fun main(args: Array<String>) {
    val washMachine = WashMachine("小天鹅", 12)
    washMachine.openDoor()
    washMachine.closeDoor()
    washMachine.selectMode(1)
    //washMachine.setMotorSpeed(1000)
    washMachine.start()
}