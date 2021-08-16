package com.example.learningkotlin

class Dog() {
  var name = ""
  var age = 0
  var furColor = ""

  fun dogInfo() : String {
     return name + " is " + age + " years old and has " + furColor + " fur"
  }
}

fun printHello() {
   println("Hello World")
}

fun addTwoNumbers(n1 : Int, n2 : Int) : Int {
 //  println(n1 + n2)
   return n1 + n2
}

fun nameAndAge(name : String, age : Int) : String {
   return "The Dog's name is " + name + " and its age is " + age

}


fun main(args:Array<String>) {
   println("Hello World!")
   // non mutable variable
   val name: String = "Georgios Leandros Kyriazis"
   var age: Int = 28
   var weather = "The weather is hot"
   var wallet: Int = 120

   // find circumference of a circle
   val pi : Double = 3.14
   var radius : Int = 5
   var c = pi * radius * 2
   println(c)
   // var that holds my weight
   var weight = 79
   weight -= 5

   println(weight)

   // If statements and Booleans
   var isTheLightOn : Boolean = true

   if (isTheLightOn) {
      println("Walk across the room")
   } else {
      println("Don't move a muscle")
   }
   // That is another thing someone can do
   var canRide : Boolean = age > 11

   if (age > 11) {
      println("Enjoy the ride")
   } else {
      println("Sorry son maybe another day")
   }

   // only allow someone on slide above 80 pounds
   if (weight > 80){
      println("Enjoy the ride")
   } else {
      println("Sorry son another day")
   }
   // lists and arrays
   // you can't change things inside of lists
   //var topCandy : List<String> = listOf("Fun Dip", "Snickers", "100 Grand Bar")
   // where as in arrays you can
   //var topCandy : Array<String> = arrayOf("Fun Dip", "Snickers", "100 Grand Bar")
   var topCandy : MutableList<String> = mutableListOf("Fun Dip", "Snickers", "100 Grand Bar")



   println(topCandy[0])
   topCandy.add (0,"Black Candy")
   println(topCandy[0])

   // Create a mutable list of my favorite three movies
   var movies : MutableList<String> = mutableListOf("movie1", "movie2", "movie3")
   movies.add("movie4")

   // For loops
   //for (x in 1..100) {
   //   println(x)
  //}

   for (candy in topCandy){
      println(candy)

   }

   for (i in 0..topCandy.size-1){
      println(topCandy[i])
   }

  // for (i in 0..1_000) {
  //    if (i > 453){
  //       println(i)
  //    }
  // }

   printHello()

   var x = addTwoNumbers(10,5)
   println(x)
   var s = nameAndAge("Bob", 5)
   println(s)


   var myDog = Dog()
   myDog.age = 6
   myDog.name = "Fido"
   myDog.furColor = "Brown"
   println(myDog.dogInfo())
}