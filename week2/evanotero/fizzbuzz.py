# FizzBuzz

def fizzbuzz(n):
    s = ""
    if n % 3 == 0:
        s += "Fizz"
    if n % 5 == 0:
        s += "Buzz"
    return s if s else n

for num in range(1,101):
    print fizzbuzz(num)
