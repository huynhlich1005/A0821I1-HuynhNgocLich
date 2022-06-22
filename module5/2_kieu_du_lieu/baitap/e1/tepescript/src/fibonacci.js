var Fibonacci = 1;
var sum = 2;
var Fibonacci2 = 1;
for (var i = 0; i < 15; i++) {
    if (i > 2) {
        var str = void 0;
        str = Fibonacci;
        Fibonacci += Fibonacci2;
        Fibonacci2 = str;
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
console.log("T\u1ED5ng s\u1ED1 fibonacci:  ".concat(sum));
