package com.kiwi.jujy.three.`object`



import java.io.File

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary(){
        for (person in allEmployees){
            println(person.name)
        }
    }

}


object CaseInsensitiveFileComparator : Comparator<File>{
    override fun compare(o1: File?, o2: File?): Int {
        return o1!!.path.compareTo(o2!!.path,ignoreCase = true)
    }


}


data class Person(val name: String){
    object NameComparator : Comparator<Person>{
        override fun compare(o1: Person?, o2: Person?): Int {
            return o1!!.name.compareTo(o2!!.name)
        }
    }
}


fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("alice"))
    Payroll.allEmployees.add(Person("bob"))
    Payroll.calculateSalary()
    println(CaseInsensitiveFileComparator.compare
    (File("/User"),File("/user")))

    println("--------------------")
    val list = listOf(Person("bob"), Person("alice"))
    println(list.sortedWith(Person.NameComparator))

}