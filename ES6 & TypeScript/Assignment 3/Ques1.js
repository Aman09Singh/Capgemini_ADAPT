let p = Promise.resolve(
    Math.floor(Math.random() * 10)
)
let q = Promise.resolve(
    Math.floor(Math.random() * 10)
)
Promise.all([p,q]).then(values => {
    
    // logging generated values
    console.log(`The generated values : ${values}`);
    
    // logging the sum
    console.log(`Sum : ${values[0] + values[1]}`);
}).catch((message)=>{
    console.log(`Error while processing...`);
})