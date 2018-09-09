package com.raquo.laminar.fixtures

import scala.collection.mutable

object AirstreamFixtures {

  case class Calculation[V](name: String, value: V)

  object Calculation {

    def log[V](name: String, to: mutable.Buffer[Calculation[V]])(value: V): V = {
      val calculation = Calculation(name, value)
      // println(calculation)
      to += calculation
      value
    }
  }

  case class Effect[V](name: String, value: V)

}
