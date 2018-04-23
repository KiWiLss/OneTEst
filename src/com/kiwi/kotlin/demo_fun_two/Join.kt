
//修改文件类名
//注解指定类名
@file:JvmName("SringFunctions")
//包的声明跟在文件注解之后
package strings

//导包,重命名
import com.kiwi.kotlin.demo_fun_two.lastChar as last

fun <T>joinToString3(collection: Collection<T>,
                     separator: String =";", prefix: String = "{"
                     , postfix: String= "}") : String {
    val sb = StringBuilder(prefix)
    for ((index,element) in collection.withIndex()){
        if (index > 0) sb.append(separator)
        sb.append(element)
    }

    sb.append(postfix)
    return sb.toString()
}

fun main(args: Array<String>) {
    val lastChar = "java".last()
    println(lastChar)
}
