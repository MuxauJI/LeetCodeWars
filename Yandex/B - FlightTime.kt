import java.time.Duration
import java.time.LocalTime

fun main() {
    /*val startTime = readLine()!!.toString()
    val endTime = readLine()!!.toString()
    val diff = readLine()!!.toString()*/
    val startTime ="00:00"
    val endTime = "06:25"
    val diff = "0"
    val duration = Duration.between(LocalTime.parse(startTime),LocalTime.parse(endTime)).toMinutes()
    val diffMinutes = diff.toInt() * 60
    val allTime = duration - diffMinutes
    println(duration.toString())
    println(diffMinutes.toString())
    println(allTime.toString())
    var h = allTime / 60
    var m = allTime % 60
    var a = "%d:%02d".format(h,m)
    println(a)
}
