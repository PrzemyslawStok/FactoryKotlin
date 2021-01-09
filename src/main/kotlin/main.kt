interface Car{
    fun drive()
    fun playMusic(){
        println("Zaczynam odtwarzać muzykę")
    }
    fun stop()

}

class BMW: Car{
    override fun drive() {
    }

    override fun stop() {
    }
}

class CarFactory{
    companion object{
        fun createCar():Car?{
            return null
        }
    }
}

fun main(){
    val car1: Car? = CarFactory.createCar()
}
