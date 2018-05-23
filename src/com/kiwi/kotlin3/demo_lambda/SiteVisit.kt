package com.kiwi.kotlin3.demo_lambda

import java.util.concurrent.locks.Lock
import java.util.function.BiPredicate

/**
 * Copyright (C), 2017-2018, XXX有限公司
 * FileName: SiteVisit
 * Author:   kiwilss
 * Date:     2018/5/23 15:44
 * Description: sitevisit
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
data class SiteVisit(val path: String,
                     val duration: Double,
                     val os: OS)

enum class OS{
    WINDOWS,LINUX,MAC,IOS,ANDROID
}

fun main(args: Array<String>) {
    val log = listOf(
            SiteVisit("/",34.0,OS.WINDOWS),
            SiteVisit("/",22.0,OS.MAC),
            SiteVisit("/login",12.0,OS.WINDOWS),
            SiteVisit("/signup",8.0,OS.IOS),
            SiteVisit("/",16.3,OS.ANDROID)
    )

    val averageWindowsDuration = log.filter {
        it.os == OS.WINDOWS
    }.map (SiteVisit::duration)
            .average()

    println(averageWindowsDuration)

    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))

    val averageMobileDuration = log.filter {
        it.os in setOf(OS.IOS,OS.ANDROID)
    }.map {
        it.duration
    }.average()
    println(averageMobileDuration)

    println("------------------------")
    println(log.avergeDurationFor2 {
        it.os in setOf(OS.ANDROID,OS.IOS)
    })
    println(log.avergeDurationFor2 {
        it.os == OS.IOS && it.path == "/signup"
    })




}

/**
 * 内联函数
 */

inline fun <T>synchronized(lock: Lock, action: () -> T) : T{
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

/**
 * 高阶函数去除重复代码
 */
fun List<SiteVisit>.avergeDurationFor2(predicate: (SiteVisit) -> Boolean ) =
        filter(predicate)
                .map(SiteVisit::duration).average()


fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter {
            it.os == os
        }.map(SiteVisit::duration).average()