"use strict";
let Fibonacci = 1;
let sum = 2;
let Fibonacci2 = 1;
for (let i = 0; i < 15; i++) {
    if (i > 2) {
        let str;
        str = Fibonacci;
        Fibonacci2 = str;
        Fibonacci += Fibonacci2;
        sum += Fibonacci;
        console.log(Fibonacci);
    }
    else if (i == 1 || i == 2) {
        console.log(Fibonacci);
    }
    else {
        console.log(0);
    }
}
console.log(sum);
