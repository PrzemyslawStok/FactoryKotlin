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
        println("drift...")
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
        println("Przemieszczanie się")
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
                CarType.BMW->BMW()
                CarType.AUDI->Audi()
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
