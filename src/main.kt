fun main(){
    getEvenIndices(mutableListOf("Book","pen","Pencil","Ruler","Desk","Chair"))

    heightInMeters(mutableListOf<Double>(12.5,23.0,14.9,16.13,17.0,24.0))

    var verite = Person("Verite",24,1.65,70.0)
    var collins = Person("Collins",45,2.15,102.1)
    var judy = Person("Judy",19,1.03,59.0)
    var zipporah = Person("Zipporah",18,1.70,60.0)

    var people = listOf(verite,collins,judy,zipporah)
    var peo = people.sortedByDescending { a -> a.age }
    println(peo)

    var ritha = Person("Ritha",23,1.60,50.0)
    var claissie = Person("Claissie",17,1.80,65.0)
    var peoplee = listOf(ritha,claissie)
    var z = addMorePeople(people.plus(peoplee))
    println(z)

    var mercedes = Car("RAG 123 C",50.5)
    var toyota = Car("RAE 113 A",54.2)
    var audi = Car("RAD 234 Z",45.9)
    var nissan = Car("RAB 547 X",51.5)
    var myCars = listOf(mercedes,toyota,audi,nissan)
    var v = findAverageMileage(myCars)
    println(v)

}
fun getEvenIndices(word:List<String>):List<String>{
    word.forEachIndexed { index, w ->
        if ( index % 2 == 0){
            println(w)
        }
    }
    return word
}
fun heightInMeters(height:List<Double>):Double{
      var sum = height.sum()
      println(sum)
      var average = height.sum()/height.count()
      println(average)
      return sum
      return average
}
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun addMorePeople(more:List<Person>):List<Person>{
       return more
}
data class Car(var registration:String, var mileage:Double)
fun findAverageMileage(car: List<Car>):Double{
    var sum = 0.0
    car.forEach { c ->
        sum+=c.mileage
    }
    return sum/car.count()
}