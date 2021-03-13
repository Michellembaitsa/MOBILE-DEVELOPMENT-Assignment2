fun main() {
   printName()
    intro("Michelle Mbaitsa", 24)
    println(hold("michelle"))
    facts("Michelle")
    facts("Kendi")
}
fun printName(){
    var name="Akirachix"
    var a=(name[0])
    var b=(name[2])
    var c=(name[3])
println("$a$b$c")
}
fun intro(name:String,age:Int){
    println("Hi my name is $name, I am $age years old.")
}
fun hold(a:String):Int{
    return a.length
}
fun facts(name:String) {
    if (name=="Michelle"){
    println("That is me!")
    }
    else {println("I don't know who that is")
    }

}