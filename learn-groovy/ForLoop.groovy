// List
def fruits = ['Apple', 'Banana', 'Cherry']

for (fruit in fruits) {
  println fruit
}

println ""

// Iterating Over a Range
for (i in 1..5) {
  println "Number: $i"
}

println ""

// Exclusive upper bound
for (i in 1..<5) {
  println "Number (exclusive): $i"
}

println ""

// With Map
def colors = [red: '#FF000', green: '#00FF00', blue: '#0000FF']

for (color in colors) {
  println "${color.key}: ${color.value}"
}

println ""

// Alternaively, you can destructure the map entries
colors.each {key, value ->
  println "$key: $value"
}

println ""

// Using each and eachWithIndex
fruits.each { fruit ->
  println fruit
}

println ""

fruits.eachWithIndex { fruit, index ->
  println "Fruit at index $index: $fruit"
}