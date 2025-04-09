int add1(int a, int b) {
  return a + b // 자바처럼
}

println(add1(a = 3, b = 4))

def add2(int a, int b) {
  return a + b // 파이썬 처럼
}

println(add2(a = 3, b = 4))

def add4(a, b) {
  a * b // 이 부분은 스킵
  a + b // 이 부분이 반환
}

println(add4(a = 3, b = 4))

int add5(int a, int b) {
  a + b // return 생략 : 표준
}

println(add5(a = 3, b = 4))