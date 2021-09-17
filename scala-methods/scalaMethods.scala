object scalaMethods extends App {
    def sum(a:Int, b:Int):Int = a + b// def sum(a:Int, b:Int) = a + b
    def concatenate(s1:String, s2:String):String = s1+s2//def concatenate(s1:String, s2:String) = s1+s2

    val x = sum(1,2)
    val y = concatenate("foo", "bar")

    println(x)
    println(y)

    
}