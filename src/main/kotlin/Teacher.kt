open class Teacher(name: String, val subject: Subject) : Person(name) {
  fun displayClassDetails() {
    println("Teacher Name: $personName")
    println("Subject: $subject")
  }
}
