class Student(name: String) : Person(name) {
  private val grades = mutableMapOf<Subject, MutableList<Int>>()

  fun addGrade(subject: Subject, grade: Int) {
    grades.computeIfAbsent(subject) { mutableListOf() }.add(grade)
  }

  fun getGrades(subject: Subject): List<Int> {
    return grades[subject] ?: emptyList()
  }

  fun calculateAverageGrade(subject: Subject): Double {
    val allGrades = getGrades(subject)
    return if (allGrades.isNotEmpty()) allGrades.average() else 0.0
  }

  override fun displayDetails() {
    println("Student Name: ${this.personName}")
    println("Grades: $grades")
    Subject.values().forEach { subject ->
      println("Average Grade in ${subject.name}: ${calculateAverageGrade(subject)}")
      super.displayDetails()
    }

  }
}
