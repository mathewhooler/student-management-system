class Classroom(val subject: Subject) : Assessee {
  override val students: MutableSet<Student> = mutableSetOf()
  private var teacher: Teacher? = null

  fun addStudent(student: Student) {
    students.add(student)
  }

  fun removeStudent(name: String) {
    students.removeIf { it.personName == name }
  }

  fun setTeacher(teacherNew: Teacher) {
    teacher = teacherNew
  }

  fun getClassroomGrades(): Map<String, Int> {
    return students.associate { it.personName to it.getGrade(subject) }
  }

  override fun calculateAverageGrade(): Double {
    val allGrades = getClassroomGrades().values
    return if (allGrades.isNotEmpty()) allGrades.average() else 0.0
  }

  override fun displayDetails() {
    println("Classroom Subject: $subject")
    println("Average Classroom Grade: ${calculateAverageGrade()}")
    println("Students: ${students.joinToString { it.personName }}")
    teacher?.displayClassDetails()
  }

  override fun getGrade(subject: Subject): Int {
    TODO("Not yet implemented")
  }
}
