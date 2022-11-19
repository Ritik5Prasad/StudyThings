//Asynchronus Function

const { reject } = require("async");

setTimeout(()=>{
    console.log("I am Asynchronous beacuse I am calling back")
},200)

//Synchronus Function
console.log("I am Synchoronus");

                                 //HOW TO HANDLE ASYNCHRONUS OPERATION

//1.USING  SET TIMEOUT
function run(){setTimeout(()=>{
    console.log("Run");
},3500)}

setTimeout(()=>{
    run();
},2);

//2.USING PROMISE          
//PROMISE HAS FOUR STATE-->  Resolve,reject,pending,succes

let myPromise =new Promise(function(resolve,reject){
    let x=1;
    if(x==0)
    resolve("OK");
    else
    reject("Error");
    })
    
    myPromise.then(
    function(value){
        console.log(value);
    },
    function(err){
        console.log(err);
    }
    )

//USing Try Catch
try{
  consale.log("Welcone");
}catch(err){
console.log(err);
}


//USING ASYNC AWAIT
setTimeout(myFile(),500);
async function myFile(){
    let myPromisee= new Promise(function(res,rej){
        let x=1;
if(x==1)
res("OK");
else
rej("Error");
}).then(function(value){
    console.log(value);
},
function(err){
    console.log(err);
}
)
await myPromisee;
}

 