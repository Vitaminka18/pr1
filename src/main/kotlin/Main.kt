import kotlin.math.*
fun main(args: Array<String>) {
// 1
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved += 1
    //2
    var age:Int = 18
    //3
    var age1:Double=17.0
    age1=(age1+30)/2
    //4
    val testNumber:Int=5432
   val evenOdd:Double=testNumber%2.0
    //5
    var answer:Int=0
    answer=((answer+1+10)*10) shr 3
    println(answer)
    //6
    age=16
    println(age)
    age=30
    println(age)
    //7
    val a:Double=46.0
    val b:Double=10.0
    val answer1=a*100+b
    println(answer1)
    val answer2=a*100+b*100
    println(answer2)
    val answer3=a+100+b/10
    println(answer3)
    //8
    println("vz = " + (5*3-4/2*2))
    //9
    val average = (a + b) / 2
    //10
    val fahrenheit:Double=180.0
    val celcius :Double=(180.0-32.0)/1.8
    //11
    val position: Int = 45
    val row: Int = position / 8
    val cul: Int = position % 8
    //12
    val degrees:Double=60.0
    val radians:Double= PI*degrees/180.0
    //13
    val x1:Double=3.0
    val x2:Double=7.0
    val y1:Double=4.0
   val y2:Double=9.0
    val distance:Double=math.sqrt  ((x2-x1).pow(2))+((y2-y1).pow(2))

}




