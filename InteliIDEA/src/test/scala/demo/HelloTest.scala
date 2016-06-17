package demo

import org.scalatest.FunSuite

/**
  * Created by lendable on 17/06/16.
  */
class HelloTest extends FunSuite {
  test("Say Hello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }

}
