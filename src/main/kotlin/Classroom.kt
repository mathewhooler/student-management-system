class Classroom(val subject: Subject) : Assessee {
  private val students: MutableSet<Student> = mutableSetOf()
  private var teacher: Teacher? = null

  fun addStudent(student: Student) {
    students.add(student)
  }

  fun removeStudent(studentId: String) {
    students.removeIf { it.studentId == studentId }
  }

  fun setTeacher(teacherNew: Teacher) {
    teacher = teacherNew
  }

  fun getClassroomGrades(): List<Int> {
    return students.flatMap { it.getGrades() }
  }

  override fun calculateAverageGrade(): Double {
    val allGrades = getClassroomGrades()
    return if (allGrades.isNotEmpty()) allGrades.average() else 0.0
  }

  override fun displayDetails() {
    println("Classroom Subject: $subject")
    println("Average Classroom Grade: ${calculateAverageGrade()}")
    println("Students: ${students.joinToString { it. studentId }}")
    teacher?.displayClassDetails()
  }
}