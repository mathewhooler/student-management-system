import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RemoveStudentTest {

  private lateinit var classroom: Classroom

  @BeforeEach
  fun setup() {
    val students = arrayOf(
      "Mathew",
      "Mark",
      "Tina",
      "Tim",
      "Steve"
    )
    classroom = Classroom(Subject.MATHS, students.toList())
  }

  @Test
  fun testRemoveStudent() {
    classroom.removeStudent("Steve")

    val expectedStudents = arrayOf(
      "Mathew",
      "Mark",
      "Tina",
      "Tim"
    ).toList()
    val actualStudents = classroom.setOfStudents()

    assertEquals(expectedStudents, actualStudents)
  }
}