const add=(function(){
  let count=0;
   return function(){
       count++;
       return count;
   }
})()

console.log(add());