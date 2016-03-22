#include <stdio.h>

int main() {
    for (int num = 1; num <= 100; num++) {
        if (num % 3 == 0)
            printf("Fizz");
        if (num % 5 == 0)
            printf("Buzz");
        if ((num % 3 != 0) && (num % 5 != 0))
            printf("%d", num);
        printf("\n");
    }
}