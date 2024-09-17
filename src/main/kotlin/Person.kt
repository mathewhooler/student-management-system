open class Person(val personName: String) {
  private var age: String? = null
  private var address: String? = null

  open fun displayDetails(){
    println("Name: $personName")
    println("Age: $age")
    println("Address: $address")
  }
  fun setAge(age: String){
    this.age = age
  }
  fun setAddress(address: String){
    this.address = address
  }

}

interface Assessee {
  fun calculateAverageGrade(): Double
}

fun main(){
  val student1 = Student("Mathew", "123")
  student1.addGrade(99)
  student1.addGrade(106)
  student1.setAge("37")
  student1.setAddress("Melbourne")
  student1.displayDetails()

  student1.personName

  val student2 = Student("Mark", "789")
  student2.addGrade(85)
  student2.addGrade(70)
  student2.setAge("35")
  student2.setAddress("Sydney")
  student2.displayDetails()


  val t = Teacher("Kats", "456", "OOP")
  t.setAge("39")
  t.addStudent(student1)
  t.addStudent(student2)
  t.displayClassDetails()

  // val a = listOf<Assessee>(student1, student2, t)
}