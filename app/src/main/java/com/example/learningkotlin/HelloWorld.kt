package com.example.learningkotlin

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

}