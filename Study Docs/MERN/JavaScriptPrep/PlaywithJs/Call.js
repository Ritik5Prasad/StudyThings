//CALL IS USED TO PASS PARAMETER TO FUNCTION
const person={
    fullName:function(){
           return this.firstName;
}}

const person1={
    firstName:"Ritik",
}
console.log(person.fullName.call(person1));