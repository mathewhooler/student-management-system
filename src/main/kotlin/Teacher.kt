open class Teacher(name: String, val teacherId: String, val subject: Subject) : Person(name) {
  fun displayClassDetails() {
    println("Teacher Name: $personName")
    println("Teacher ID: $teacherId")
    println("Subject: $subject")
  }
}
