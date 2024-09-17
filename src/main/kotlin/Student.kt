class Student(name: String, val studentId: String): Person(name), Assessee {
  private val grades = mutableListOf<Int>()

  fun addGrade(grade: Int){
  grades.add(grade)
  }

  fun getGrade(): List<Int>{
    return grades
  }



  override fun calculateAverageGrade(): Double {
    val gradeAverage = grades.average()
    return gradeAverage
  }

  override fun displayDetails(){
    println("Student ID: $studentId")
    println("Grades: $grades")
    println("Average Grade: ${calculateAverageGrade()}")
    super.displayDetails()
  }
}