package com.khk

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testUserLazy() {
        val user = User()

        println("not init")

        Assert.assertNotNull(user.httpText)
    }

    @Test
    fun testUserNameObserv() {
        val user = User()

        user.name = "john"
        user.name = "james"
    }

    @Test
    fun testAnimalByMap() {
        val animal = Animal(mutableMapOf(
            "name" to "cat",
            "age" to 20
        ))

        Assert.assertEquals("cat", animal.name)
        Assert.assertEquals(20, animal.age)

        animal.age = 21
        animal.name = "dog"

        Assert.assertEquals("dog", animal.map["name"])
        Assert.assertEquals(21, animal.map["age"])
    }

    @Test
    fun testFruit() {
        val fr1 = Fruit("바나나", "바나나 노란색")
        val fr2 = Fruit("바나나", "바나나 노란색")

        println(fr1)
        println(fr2)

        Assert.assertEquals(fr1, fr2)
        Assert.assertEquals(fr1.hashCode(), fr2.hashCode())
    }

    @Test
    fun testLambda() {
        println(sum(1, 2))

        Assert.assertEquals(4, sum(1, 3))

        Assert.assertEquals(4, { x: Int, y: Int -> x * y }(2,2) )

        val exp = { x : Int, y : Int -> {z : Int -> (x+y) * z}}

        val exp2 = exp(3, 2)
        val result = exp2(4)

        Assert.assertEquals(20, result)
    }

    @Test
    fun testCollection() {
        val list = listOf(1, "2", 3, 4, 5.7, 1, 2)

        println(list.filter { item -> item is Int })
        println(list.filter { it is Int })

        println(list.map { "value : ${it}" })
        println(list.filter { it is Int }.map { "value: ${it}" })
        println(list.find { it is Double })

        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))
        println(list2)

        println(list2.map { "value: ${it}" })
        println(list2.flatMap { it.toList() })
    }

    @Test
    fun testExtensions() {
        val str = "Hello, Extensions"

        println(str.lastString())
        Assert.assertEquals("n", str.lastString())
    }
}
