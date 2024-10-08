open class Teacher(name: String, val subjects: Set<Subject>) : Person(name) {
  fun displayClassDetails() {
    println("Teacher Name: $personName")
    println("Subjects: ${subjects.joinToString()}")
  }
}
