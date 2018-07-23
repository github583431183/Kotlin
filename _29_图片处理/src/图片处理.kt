import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * Created by wujiazhen on 2018/7/23.
 */
fun main(args: Array<String>) {
    var image = BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
    var w = 0 .. 99
    var h = 0 .. 99
    image.apply {
        for (i in w){
            for (j in h){
                //this.
                        setRGB(i,j,0xff0000)
            }
        }
    }
    ImageIO.write(image,"bmp", File("a.bmp"))
}