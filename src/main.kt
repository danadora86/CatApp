fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("flathead", 7, 10)
    val cupra = Cat("cupra", 2, 7)

   // binnie.walk()
   // clyde.walk()
   // flathead.walk()
    // cupra.walk()

    binnie.walk( 4)
    clyde.walk(2)
    cupra.eat(2)
    flathead.eat(10)

    println(binnie)
    println(clyde)
    println(flathead)
    println(cupra)

}