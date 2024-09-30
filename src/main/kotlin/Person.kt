open class Person(val personName: String, private var age: String? = null) {
  private var city: String? = null

  open fun displayDetails() {
    println("Name: $personName")
    println("Age: $age")
    println("City: $city")
  }

  fun setAge(age: String) {
    this.age = age
  }

  fun setCity(city: String) {
    this.city = city
  }
}