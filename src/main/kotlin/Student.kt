class Student(name: String, val studentId: String) : Person(name), Assessee {
  private val grades = mutableMapOf<Subject, MutableList<Int>>()

  fun addGrade(subject: Subject, grade: Int) {
    grades.computeIfAbsent(subject) { mutableListOf() }.add(grade)
  }

  fun getGrades(): List<Int> {
    return grades.values.flatten()
  }

  override fun calculateAverageGrade(): Double {
    val allGrades = getGrades()
    return if (allGrades.isNotEmpty()) allGrades.average() else 0.0
  }

  fun displaydetails() {
    println("Student ID: $studentId")
    println("Grades: $grades")
    println("Student's Average Grade: ${calculateAverageGrade()}")
    super.displayDetails()
  }

  override fun equals(other: Any?): Boolean {
    return (other as? Student)?.studentId == this.studentId
  }
}