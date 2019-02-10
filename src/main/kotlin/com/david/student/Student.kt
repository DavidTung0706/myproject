package com.kotlin

import java.util.*

fun main(args: Array<String>) {
    //userInput()
    val stu = Student("David", 60, 99)
    stu.print()
    // Kotlin 字串連結可以用 $ 但如果連結的是呼叫方法用 ${ 呼叫方法 }
    println("High score : ${stu.highest()}")
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    /* Kotlin 如方法是回傳運算式，可直接在方法後加上運算式
     例: fun 方法名稱()= 運算式*/
    fun passOrFailed() =
    //Kotlin if..else 可以寫在 print 內
        if (getAverage() >= 60) "PASS" else "FAILED"

    fun grading() = when (getAverage()) {
        // Kotlin 如是範圍值可使用 例: in 100..120
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english + math) / 2


    fun highest() = if (english > math) {
        println("english:")
        english
    } else {
        println("math: ")
        math

        /*Kotlin if..else 可直接加在變數後去判斷
         例: max = if (zzz > aaa) zzz else aaa*/


        /* if(english > math){
            max = english
        }else{
            max = math
        }*/

    }

    fun nameCheck() = print(name?.length)

    private fun userInput() {
        val scanner = Scanner(System.`in`)
        print("Please enter student's name:")
        //var name = scanner.next()
        var name = null
        print("Please enter student's english score:")
        var english = scanner.nextInt()
        print("Please enter student's math score:")
        var math = scanner.nextInt()

        val stu = Student(name, english, math)
        stu.print()
        stu.nameCheck()
    }

}