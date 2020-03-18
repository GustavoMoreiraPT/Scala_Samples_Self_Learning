val aList:List[Int] = List(1, 2, 3)
val bList=List("edom", "odsoft", "tap")
val cList=List('a', 'b')
val dList=List(true, false)
val e=5.6
val fList = List(1.0, 2, 3)
val g='i'

bList.flatten //1
bList.flatMap(_.toList) //1

bList.map(x => x.hashCode) //2

aList:::bList //3

"ola"::e::Nil //4

5::e::Nil //5

// exercicio 2
//a)
List.range(1, 11, 2)
//b)
List.tabulate(5)(x => 2*x + 1)

//exercício 3
//obter List("Joana", "José")
val ex3 =  List("Maria", "Ana", "Joana", "Julia", "Paulo", "Jose")

ex3.filter(x => x.startsWith("Jo"))

//yield
//example : for (elem <- List(1,2,3,4,5,6) if elem % 2 == 0) yield elem

for (elem <- ex3 if elem.startsWith("Jo")) yield elem

//exercicio 4

val x = (y:Int) => Math.abs(y)
List(1, 2, 3, -1, -2, -3, 0).map(x)

//exercicio 5
def hasDigit(x: Any): Boolean = {
  x::5
}












