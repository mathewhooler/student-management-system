open class Teacher(val name: String, val teacherId: String, val subject: String): Person(name) {
  var students = mutableListOf<Student>()

  fun addStudent(student: Student){
    students.add(student)
  }

  fun removeStudent(student: Student) {
    students.remove(student)
  }


  fun getAverageGrade(): Double {
    students.map  { it.calculateAverageGrade() }.average()
  // val allGrades = students.flatMap { it.grades }
  //   return allGrades.average()
  }

  fun displayClassDetails() {
    println("Teacher ID: $teacherId")
    println("Subject: $subject")
    println("Average Grade of Class: ${getAverageGrade()}")
  }
}