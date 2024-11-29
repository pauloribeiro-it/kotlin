class Car (val year: Int, var model: String, val documentNumber: Int){

    var color:String? = null
        get(){
            return field?.uppercase() //field is a reference for the original field
        }
    val carInfo: String
        get() {return "year: {$year} ,model ={$model},documentNumber = {$documentNumber}, color = {${this.color}}"}

}

fun main() {
    var car = Car(2019, "Toyota Yaris", 1234)
    car.color = "Blue"
    println(car.carInfo)
}