interface Assessee {
  val students: Set<Student>
  fun calculateAverageGrade(subject: Subject): Double
  fun displayDetails()
  fun getGrade(student: Student, subject: Subject): Int?
}
