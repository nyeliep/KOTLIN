fun main(args: Array<String>) {
    greetPerson( "Ada")
    division(32,12)
    sum(42,65,69,93)
    mySelf("i love reading novels")




}
fun greetPerson(name: String){
    println("Hi $name")
}
fun division (num1: Int, num2: Int):Int{
    var result = num1 .rem(num2)
    println("$num1 / $num2: $result")
    return result

}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum=num1 + num2 + num3 + num4
    println(sum)
    return sum

}
fun mySelf(sentence: String){
    println("$sentence")
}


