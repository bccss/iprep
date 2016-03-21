# Fizz Buzz
class FizzBuzz
  class << self
    def print_from_0_to_100
      (1..100).map { |num| puts fizz_buzz(num) }
    end

    def fizz_buzz(num)
      return 'FizzBuzz' if fizz?(num) && buzz?(num)
      return 'Fizz' if fizz?(num)
      return 'Buzz' if buzz?(num)
      num.to_s
    end

    def fizz?(num)
      num % 3 == 0
    end

    def buzz?(num)
      num % 5 == 0
    end
  end
end

FizzBuzz.print_from_0_to_100
