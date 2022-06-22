let Fibonacci : number=1;
let sum : number =2;
let Fibonacci2 : number =1;
for(let i= 0; i < 15;i++){
    if(i>2){
        let str: number;
        str = Fibonacci;
        Fibonacci += Fibonacci2;
        Fibonacci2 = str;
        sum += Fibonacci;
        console.log(Fibonacci);
    }else if(i==1||i==2){
        console.log(Fibonacci);
    }else{
        console.log(0);
    }
}
console.log(`Tổng số fibonacci:  ${sum}`);