//> using scala 3.5.2

import java.io.*
import scala.collection.mutable.ListBuffer


trait Animal:
  def speak(): Unit

trait HasTail:
  def wagTail(): Unit

class Dog extends Animal, HasTail:
  def speak(): Unit = println("Woof")
  def wagTail(): Unit = println("⎞⎜⎛  ⎞⎜⎛")

def printAndGetLength(input: String): Int = {
	val len = input.length()
	/*
	for (c <- input) {
		print(s"$c ")
	}
	*/
	input.foreach(print)
	print("\n")
	len
}

class Section(title: String, class_no: Int):
	def printSectionInfo(): Unit = println(f"$title (no. $class_no)\n")

trait CanRegister:
	def addSection(adding: Section): Unit

class Student(name: String) extends CanRegister {
	var sections = ListBuffer[Section]()

	override def toString = s"name: $name"

	def addSection(adding: Section): Unit = this.sections += adding
	def printSections(): Unit = this.sections.foreach(_.printSectionInfo())
	
	def getName: String = this.name
	def printName() = println(s"printName: $name")
	//def printName = println(name)
}

def testFn(input: String): Unit = {
	val xs: List[Double] = List(1, 2, 3, 4, 5)
	for x <- xs do {
		println(x)
	}

	print("input (only a's): ")
	var n = 0L
	for c <- input if (c == 'a') do {
		print(s"$c")
		n += 1
	}
	print("\n")
	print(s"n chars: $n\n")
}

object TestExample extends App {
	val testStr = "test"
	printf("%s\n", testStr)

	val a = 3
	val b = 3.0d
	printf("a: %d, b: %f\n", a, b)
	println(f"$a%d, $b%.2f")

	val testStr2 = raw"test\ntest2"
	println(testStr2)

	var i = BigInt(1_234_567_890_123_456_789L)
	var j = BigDecimal(123_456.789_123e20)
	println(s"i: $i, j: $j")

	val x = -1
	printf("abs(x): ")

	println(x.abs)
	val ret = printAndGetLength("Naveen")

	println(ret)
	println(ret.getClass)

	testFn("Naveen Chakicherla")

	val st1 = Student("Naveen")
	println(st1.toString)
	st1.printName()
	st1.addSection(Section("Math", 101))
	st1.printSections()
	//val name = st1.getName
	println(f"name: ${st1.getName}")
}

//@main
def testRun(input: String): Unit = {

	val list1 = List(1, 2, 3)

	val list2 = {
		for x <- list1 if (x % 2 == 0)
			yield x
	}
	printf("%s: ", "list2")
	list2.foreach(println)

	val list3 = {
		for x <- list1 if (x % 2 == 0)
			yield x
	}
	printf("list3: ")
	list3.foreach(printf("%d", _))
	print("\n")

	val myName = "Naveen Chakicherla"
	myName.foreach(print(_))
	print("\n")

	println(input)
	printAndGetLength(input)
	val myDog = Dog()
	println(myDog)

	val br = BufferedReader(FileReader("./hello.scala"))
	println(br)
	val b: Double = 3.14e10
	val c: Double = b + 1.00e10;
	println((b + c))
}