class Classroom {
  private val students = mutableListOf<Student>()

  fun addStudent(student: Student){
    students.add(student)
  }
  fun removeStudent(studentId: String){
    students.removeIf { it.studentId == studentId }
  }
  fun getAverageGrade(): Double {
    val allGrades = students.flatMap { it.grades }
    return allGrades.average()
  }
  fun displayClassDetails(){
    println("Classroom Details:")
    println("Average Grade: ${getAverageGrade()}")
    println("Students: $students")
  }
}