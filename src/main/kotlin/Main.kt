fun main() {
    val mathew = Student("Mathew")
    mathew.addGrade(Subject.OOP, 80)
    mathew.addGrade(Subject.MATHS, 55)
    mathew.addGrade(Subject.MUSIC, 100)


    val mark = Student("Mark")
    mark.addGrade(Subject.OOP, 90)
    mark.addGrade(Subject.MATHS, 89)


    val teacher = Teacher("Mr. Kats", setOf(Subject.OOP ))

    val classroom1 = Classroom(Subject.OOP)
    classroom1.setTeacher(teacher)
    classroom1.addStudent(mathew)
    classroom1.addStudent(mark)
    classroom1.displayDetails()

    classroom1.displayDetails()
    mathew.displayDetails()
    mark.displayDetails()

}
