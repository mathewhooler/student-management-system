interface Assessee {
  val students: Set<Student>
  fun calculateAverageGrade(): Double
  fun displayDetails()
  abstract fun getGrade(subject: Subject): Int
}
