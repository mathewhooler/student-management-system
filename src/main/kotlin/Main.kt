fun main() {
    val student1 = Student("Mathew")
    student1.addGrade(Subject.OOP, 80)
    student1.addGrade(Subject.MATHS, 55)
    student1.addGrade(Subject.MUSIC, 100)
    student1.setAge("37")
    student1.setCity("Melbourne")
    student1.displayDetails()

    val student2 = Student("Mark", "456")
    student2.addGrade(Subject.OOP, 90)
    student2.addGrade(Subject.MATHS, 89)
    student2.setAge("35")
    student2.setCity("Sydney")
    student2.displayDetails()

    val teacher = Teacher("Kats", "999", Subject.OOP )
    teacher.setAge("39")

    val classroom1 = Classroom(Subject.OOP)
    classroom1.setTeacher(teacher)
    classroom1.addStudent(student1)
    classroom1.addStudent(student2)
    classroom1.displayDetails()

    val assessees: List<Assessee> = listOf(student1, student2, classroom1)
    assessees.forEach { it.displayDetails() }
}
