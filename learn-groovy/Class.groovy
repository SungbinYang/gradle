class Person {
  String name
  int age

  // override
  def getName() {
    "My name is ${name}"
  }

  def showDetails() {
    println "Name: $name, Age: $age" 
  }
}

p = new Person(name: 'Joon', age: 40)
p.showDetails()

// getter나 setter에서 가져온다. 다만, 기본 getter와 setter를 만들어주는데 오버라이드 개념으로 선언을 하면 오버라이딩 된 getter나 setter가 가져온다.
println(p.name)

// -- Constructor
class Car {
  String model
  int year

  // Custom Constructor
  Car(String model, int year) {
    this.model = model
    this.year = year
  }
}

def car = new Car("Tesla", 2024)
println "Model: ${car.model}, Year: ${car.year}"

// -- Inheritance
class Animal {
  def speak() {
    println "Animal sound"
  }
}

class Dog extends Animal {
  @Override
  def speak() {
    println "Bark"
  }
}

def dog = new Dog()
dog.speak()

// -- Static Methods and Properties
class Calculator {
  static double PI = 3.141592

  static double square(double num) {
    return num * num
  }
}

println Calculator.PI
println Calculator.square(5)