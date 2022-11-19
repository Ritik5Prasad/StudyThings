//BORROW METGOD FROM OTHER OBJECT
const person={
    firstName:"Nick",
    lastName:"Colen",
    fullName:function(){
        return this.firstName+" "+this.lastName;
    }
}

const person1={
    firstName:"Ritik",
    lastName:"Prasad"
}

let bind=person.fullName.bind(person1);
console.log(bind());