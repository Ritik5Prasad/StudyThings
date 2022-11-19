function display(msg){
    console.log(msg);
}

let myPromise =new Promise(function(resolve,reject){
let x=1;
if(x==0)
resolve("OK");
else
reject("Error");
})

myPromise.then(
function(value){
    display(value);
},
function(err){
    display(err);
}
)
setTimeout(myFile,3000);
async function myFile(){
    let myPromise= new Promise(function(res,rej){
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
await myPromise;
}

 



