async function fetchDetails(){
     const Username= await fetch(`https://jsonplaceholder.typicode.com/users/1`);
     const Userdata=await Username.json();
     console.log(Userdata);
}

fetchDetails();