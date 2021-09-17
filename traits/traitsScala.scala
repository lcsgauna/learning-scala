object traitsScala extends App{
    
    trait Speaker {
        def speak():String
    }

    trait TailWager{
        def startTail():Unit = println("tail is wagging")
        def stopTail():Unit = println("tail is stopped")
    }

    trait Runner {
        def startRunning():Unit = println("I'm running")
        def stopRunning():Unit = println("Stopped running")
    }

    class Dog(name:String) extends Speaker with TailWager with Runner {
        def speak(): String = "woof"
    }

    class Cat extends Speaker with TailWager with Runner {
        def speak(): String = "meow"
        override def startRunning(): Unit = println("Yeah.. I don't run")
        override def stopRunning(): Unit = println("No need to stop")
    }

}