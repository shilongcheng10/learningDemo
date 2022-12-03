package com.fengjunzi.learning.scala.difference.writing

/**
 * @author: Shi, LongCheng
 * @createTime: 3/12/2022$ PM8:00$
 * @version 1.0
 * @description
 */
class simpleDemoWithScala {
  /**
   * scala way to get whether has upper case for 1 string
   * @param name
   * @return true if has upper case, false otherwise
   */
    def nameHasUpperCase(name: String): Boolean = {
      name.exists(_.isUpper)
    }

    def greeting(): Unit = println("Hello, World")

    def loopDemo(args: Array[String]): Unit = {
      var i = 0;
      while(i < args.length){
        println(args(i))
        i += 1
      }
    }

    def loopDemoWithForEach(args: Array[String]): Unit = {
      args.foreach(arg => println(arg))
      args.foreach((arg:String) => println(arg))
      args.foreach(println)
      for (arg <- args) {
        println(arg)
      }
    }

    def printArray(): Unit = {
      val greetStrings = new Array[String](3)
      // val greetStrings : Array[String] = new Array[String](3)
      greetStrings(0) = "Hello"
      greetStrings(1) = ", "
      greetStrings(2) = "World!\n"
      for (i <- 0 to 2){
        print(greetStrings(i))
      }
    }

    def createArray(): Unit = {
      val numNames = Array("Zero", "One", "Two")
      val numNames1 = Array.apply("Zero", "One", "Two")
    }

    def createList(): Unit = {
      val oneTwo = List(1, 2)
      val threeFour = List(3, 4)
      val oneTwoThreeFour = oneTwo ::: threeFour
      println(oneTwo + " and " + threeFour + " were not mutated")
      printLn("Thus, " + oneTwoThreeFour + " is a new list")

      val twoThree = List(2, 3)
      var oneTwoThree = 1 :: twoThree
      println(oneTwoThree)
      oneTwoThree = 1 :: 2 :: 3 :: Nil
      println(oneTwoThree)
    }
}
