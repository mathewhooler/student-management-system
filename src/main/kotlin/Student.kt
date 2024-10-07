class Student(name: String) : Person(name), Assessee {
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

  override fun displayDetails() {
    println("Student Name: ${this.personName}")
    println("Grades: $grades")
    println("Student's Average Grade: ${calculateAverageGrade()}")
    super.displayDetails()
  }

  override fun getGrade(subject: Subject): Int {
    TODO("Not yet implemented")
  }
}
