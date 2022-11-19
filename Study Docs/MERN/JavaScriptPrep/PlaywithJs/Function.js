//Normal Function
function myFunction(){
    console.log("Helllo");
}
myFunction();

//Self-Invoking Function

(function self(){
    console.log("SElf-Invoked");
})()

//Function Hoisting
after();
function after(){
    console.log("I can run before Declaration");
}

//Arrow Function or Fat-Arrow

(()=>{
     console.log("Arrrow");                   //Arrow Self Invoked
})()
const Arrow=()=>{
    return "Ritik";
}
console.log(Arrow());