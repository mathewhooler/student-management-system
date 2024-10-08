class Classroom(val subject: Subject) : Assessee {
  private val studentsSet: MutableSet<Student> = mutableSetOf()
  private var teacher: Teacher? = null

  override val students: Set<Student>
    get() = studentsSet

  fun addStudent(student: Student) {
    studentsSet.add(student)
  }

  fun removeStudent(name: String) {
    studentsSet.removeIf { it.personName == name }
  }

  fun setTeacher(teacherNew: Teacher) {
    teacher = teacherNew
  }

  override fun calculateAverageGrade(subject: Subject): Double {
    val allGrades = students.flatMap { it.getGrades(subject) }
    return if (allGrades.isNotEmpty()) allGrades.average() else 0.0
  }

  override fun displayDetails() {
    println("Classroom Teacher: $teacher")
    println("Classroom Subject: $subject")
    println("Average Classroom Grade: ${calculateAverageGrade(subject)}")
    println("Students: ${students.joinToString { it.personName }}")
    teacher?.displayClassDetails()
  }

  override fun getGrade(student: Student, subject: Subject): Int? {
    return student.getGrades(subject).lastOrNull()
  }

  fun getClassroomGrades(): Map<String, Int?> {
    return students.associate { it.personName to getGrade(it, subject) }
  }
}
