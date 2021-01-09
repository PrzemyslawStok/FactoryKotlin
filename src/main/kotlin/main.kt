interface Car{
    fun drive()
    fun playMusic(){
        println("Zaczynam odtwarzać muzykę")
    }
    fun stop()
    fun primaryFunction()
    fun carInfo()
}

class BMW: Car{
    override fun drive() {
    }

    override fun stop() {
    }

    override fun primaryFunction() {
    }

    override fun carInfo() {
        println("BMW")
    }
}

class Audi: Car{
    override fun drive() {

    }

    override fun stop() {

    }

    override fun primaryFunction() {
    }

    override fun carInfo() {
        println("AUDI")
    }

}

enum class CarType{
    BMW,AUDI
}

class CarFactory{
    companion object{
        fun createCar(carType: CarType):Car?{
            return when(carType){
                else->null
            }
        }
    }
}

fun main(){
    val car1: Car? = CarFactory.createCar(CarType.BMW)
    val car2: Car? = CarFactory.createCar(CarType.AUDI)

    car1?.carInfo()
}
