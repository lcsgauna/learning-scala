import _root_.java.io.FileNotFoundException
import java.io.IOException
object controlStructures extends App {
    
    // IF ELSE
    if (test1){
        doA()
    }else if (test2){
        dob()
    }else if (test3){
        doC()
    }else{
        doD()
    }

    //Ternary operator
    val x = if (a < b) a else b

    //Match Expressions
    val results = i match {
        case 1 => "one"
        case 2 => "two"
        case _ => "not 1 or 2"
    }

    val booleanAsString = bool match {
        case true => "true"
        case false => "false"
    }

    def getClassAsString(x:Any):String = x match {
        case s : String => s + " is a String"
        case i : Int => i + " Int"
        case f : Float => f + " Float"
        case l : List[_] => "List"
        case p : Person => "Person"
        case _ => "Unknow"
    }

    // Try/Catch
    try{
        writeToFile(text)
    }catch {
        case fnfe : FileNotFoundException => println(fnfe)
        case ioe : IOException => println(ioe)
    }

    // For loops and expressions
    for (arg <- args) println(args)
    for(i<-0 to 5) println(i)
    for(i<-0 to 10 by 2) println(i)

    val x = for (i<-i to 5 ) yield i * 2
    
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
        f <- fruits
        if f.length > 4
    }yield f.length
    

    //While and do/while
        while(condition){
            statement(a)
            statement(b)
        }

        do{
            statement(a)
            statement(b)
        }while(condition)
    

}