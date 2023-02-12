// Factorial bucle FOR
let n1 = 10
let factorial1=1;

for (let i = 1; i <= n1; i++){
    factorial1 *=i
}

// Factorial bucle WHILE
let n2 = 10
let factorial2=1;

while(n2>=1){
  factorial2 *= n2
  n2-=1
}

//Factorial BREAK 
let n3 = 10;
let factorial3 = 1;
while(true){
    factorial3 *=n3
    n3--
    
    if(n3 === 1)
    break;
}