import kotlin.random.Random

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

class Mercedes:Car{
    override fun drive() {

    }

    override fun stop() {

    }

    override fun primaryFunction() {

    }

    override fun carInfo() {
        println("MERCEDES")
    }

}

enum class CarType{
    BMW,AUDI,MERCEDES
}

class CarFactory{
    companion object{
        fun createCar(carType: CarType):Car{
            return when(carType){
                CarType.BMW->BMW()
                CarType.AUDI->Audi()
                CarType.MERCEDES->Mercedes()
            }
        }

        fun createRandomCar():Car{
            //val random = (Math.random()*CarType.values().size).toInt()
            val rand1 = Random.nextInt(0,CarType.values().size)

            return createCar(CarType.values()[rand1])
        }
    }
}

fun main(){
    val car1: Car = CarFactory.createCar(CarType.BMW)
    val car2: Car = CarFactory.createCar(CarType.AUDI)

    car1.carInfo()

    for(i in 1..100)
        CarFactory.createRandomCar().carInfo()


}
