const listArm = [3,4,5,6,7,8,9,153,267,325,409,1524,7584,9874];
const iterator = listArm[Symbol.iterator]();
function getnext(){
    
    return  iterator.next().value;
}

function* arms() {
    let current = 1;
    let next = 2;
    while (true) {
      let reset = yield current;
      [current, next] = [next, getnext(next)];
      if (reset) {
          current = 1;
          next = 2;
  
      }
    }
  }
  
  const s = arms();
  console.log(s.next().value); 
  console.log(s.next().value); 
  console.log(s.next().value); 
  console.log(s.next().value);
  console.log(s.next().value);
  console.log(s.next().value);
 
  console.log(s.next().value);
  console.log(s.next().value); 
  console.log(s.next().value);
  console.log(s.next().value); 

  console.log(s.next(true).value);

  console.log(s.next().value); 
  console.log(s.next().value); 