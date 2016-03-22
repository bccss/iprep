require 'minitest/autorun'
require_relative 'fizz_buzz'

# Fizz Buzz Test
class FizzBuzzTest < MiniTest::Unit::TestCase
  def test_fizz
    assert_equal 'Fizz', FizzBuzz.fizz_buzz(3)
  end

  def test_fizz_again
    assert_equal 'Fizz', FizzBuzz.fizz_buzz(6)
  end

  def test_buzz
    assert_equal 'Buzz', FizzBuzz.fizz_buzz(5)
  end

  def test_buzz_again
    assert_equal 'Buzz', FizzBuzz.fizz_buzz(10)
  end

  def test_fizz_buzz
    assert_equal 'FizzBuzz', FizzBuzz.fizz_buzz(15)
  end

  def test_fizz_buzz_again
    assert_equal 'FizzBuzz', FizzBuzz.fizz_buzz(30)
  end

  def test_ordinary_number
    assert_equal '2', FizzBuzz.fizz_buzz(2)
  end

  def test_ordinary_number_again
    assert_equal '4', FizzBuzz.fizz_buzz(4)
  end
end
