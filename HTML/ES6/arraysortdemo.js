var arr=[10,100,17,20,69,5];
function display(){
    console.log("ascending order")
    arr.sort((a,b)=>a-b).forEach(e=>console.log(e));
    console.log("descending order")
    arr.sort((a,b)=>b-a).forEach(e=>console.log(e));
    console.log("transform")
    arr.map((e)=>Math.pow(e,2)).forEach((e)=>console.log(e));
}

display();