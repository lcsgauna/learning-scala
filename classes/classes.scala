object classes extends App {

    class Person(var firstName:String, var lastName: String){
        def printFullName() = println(s"$firstName $lastName")
    }

    class Pizza (
        var crutSize: CrustSize,
        var crustType: CrutType,
    ){
        def addTopping(t:Topping):Unit = topping += t
        def removeTopping(t:Topping):Unit = topping -= t
        def removeAllTopping(t:Topping):Unit = toppings.clear()
    }
    
    
    val p = new Person("Julia", "Kern")
    println(p.firstName)
    p.lastName = "Manes"
    p.printFullName()





}