import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ClassroomTest {

  private lateinit var classRoom: Classroom

  @BeforeEach
  fun setup() {
    classRoom = Classroom(Subject.MATHS)

    val studentsWithGrades = arrayOf(
      Pair("Mathew", 99),
      Pair("Mark", 81),
      Pair("Tina", 96),
      Pair("Tim", 55),
      Pair("Steve", 68)
    )

    for ((name, grade) in studentsWithGrades) {
      val student = Student(name, name.length.toString())
      student.addGrade(Subject.MATHS, grade)
      classRoom.addStudent(student)
    }
  }

  @Test
  fun testGetClassroomGrades() {
    val expectedGrades = mapOf(
      "Mathew" to 99,
      "Mark" to 81,
      "Tina" to 96,
      "Tim" to 55,
      "Steve" to 68
    )

    val actualGrades = classRoom.getClassroomGrades()
    assertEquals(expectedGrades, actualGrades)
  }

  @Test
  fun testCalculateAverageGrade() {
    val expectedAverage = (99 + 81 + 96 + 55 + 68) / 5.0
    val actualAverage = classRoom.calculateAverageGrade()
    assertEquals(expectedAverage, actualAverage)
  }
}
