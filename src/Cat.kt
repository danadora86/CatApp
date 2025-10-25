class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk(times: Int= 1 ) {
       weight = weight-times
    }

    fun eat(times: Int= 1) {
        weight = weight+times
    }

    override fun toString() : String {
        return "Name: $name Age: $age weight: $weight"
    }
}
