fun main(){
    var student= Human("Ayugi",23,78)
    println(student.name)
    println(student.age)
    student.Eat(30)
    student.Addweight(30)
    println(student.weight)
    student.speak("Respect yourself")
    student.Birthday()

    var person= Student("Ayugi","Sophia","ayugisophiaangela@gmail.com","0758183543",635640)
    println(person.email)
    println(person.lastname)


}

class Human(var name:String, var age: Int, var weight: Int){
    fun Eat(foodweight: Int){
        println("I am eating $foodweight kgs of food")
    }
    fun Addweight(foodweight: Int): Int{
        weight=weight + foodweight
        return weight
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun Birthday(){
        age++
        println(age)


    }

}

data class Student( var firstname : String, var lastname: String, var email:String, var phonenumber: String, var password:Int) {


}
