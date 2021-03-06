package io.ginger.kotlin.tutorial.callable

/**
 * Created by wufan on 2017/5/27.
 */

fun main(args : Array<String>) {
    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}

fun length(s : String) = s.length

fun <A, B, C> compose(f : (B) -> C, g: (A) -> B) : (A) -> C {
    return { x->f(g(x)) }
}