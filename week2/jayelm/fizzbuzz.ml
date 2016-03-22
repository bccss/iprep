let fizzbuzz n =
  let rec print_fb i =
    if i <= n then
      let to_print = match i with
      | i when (i mod 15 == 0) -> "FizzBuzz"
      | i when (i mod 5 == 0) -> "Buzz"
      | i when (i mod 3 == 0) -> "Fizz"
      | i -> string_of_int i in
      let _ = print_endline to_print in
      print_fb (i + 1)
  in
  print_fb 1;;

fizzbuzz 100;;
