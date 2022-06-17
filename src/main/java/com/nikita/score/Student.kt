package com.nikita.com.nikita.score

class Student (var name:String, var english:Int, var math:Int){
    init {
        println("testing")
    }

    fun print(){
        println("$name\t$english\t$math\t${getAverage()}")
    }



    fun getAverage():Int{
        return (english+math)/2
    }


}

fun main() {
    val bo = Student("bo", 53, 87)
    println(bo.math)
}