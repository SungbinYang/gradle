// Byte
byte b = 10;
println "Byte: $b"
println b.class

// Short
short s = 30000
println "Short: $s"

// Integer
int i = 100000
println "Integer: $i"

// Long
long l = 10000000000L
println "Long: $l"

// Float
float f = 10.5F
println "Float: $f"

// Double
double d = 20.99
println "Double: $d"

// Character
char c = 'A'
println "Character: $c"

// Boolean
boolean bool = true
println "Boolean: $bool"

// -- Reference Data Types
// String
String str = "Hello, Groovy!"
println "String: $str"

// BigInteger
BigInteger bigInt = new BigInteger("12345678901234567890")
println "BigInteger: $bigInt"

// BigDecimal
BigDecimal bigDec = new BigDecimal("12345.6789")
println "BigDecimal: $bigDec"

// List
List<Integer> list = [1, 2, 3, 4, 5]
println "List: $list"

// Map
Map<String, Integer> map = [name: 1, age: 25]
println "Map: $map"

// Range
Range range = 1..5
println "Range: $range"

// -- Special Data Types
// Closure
def sayHello = { println "Hello, Groovy!" }
sayHello()

def add = { a1, a2 -> a1 + a2 }
println add(5, 3)

def greet = { name -> println "Hello, $name!" }
greet("Groovy")

// implicit parameter :: 파라미터를 넣어주면 파라미터 선언없이 it로 대체 가능
def square = {it * it}
println square(4)

def greetWithDefault = {name = "Stranger" -> println "Hello, $name!" }
greetWithDefault()
greetWithDefault("Bob")

def operate(a, b, operation) {
  return operation(a, b)
}

def result = operate(4, 5, {x, y -> x + y})
println result

// Null and Safe Navigation Operator
String nullableString = null
println "Nullable String Length: ${nullableString?.length()}"

// -- Dynamic Typing with def
def dynamicVar = "I am a string"
println "Dynamic Variable: $dynamicVar (Type: ${dynamicVar.getClass().name})"

dynamicVar = 42
println "Dynamic Variable: $dynamicVar (Type: ${dynamicVar.getClass().name})"

dynamicVar = [1, 2, 3]
println "Dynamic Variable: $dynamicVar (Type: ${dynamicVar.getClass().name})"

