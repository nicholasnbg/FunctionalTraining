package com.rea.higherorder

object Composing {
  def main(args: Array[String]) {
    println(addTwoMinusThree(6) + " should equal 5")
  }

  def add(a: Int, b: Int) = a + b

  // We want to partially apply add
  def addTwo: Int => Int = add(2,_)

  def subtract(a: Int, b: Int) = a - b

  // We want to partially apply subtract
  def minusThree: Int => Int = subtract(_,3)

  // How do we create a new function from addTwo and minusThree?
  val addTwoMinusThree: Int => Int = addTwo compose minusThree

  // How do we convert f and g into a brand new function?
  def compose_[A, B, C](f: A => B, g: B => C): A => C = ???

}


