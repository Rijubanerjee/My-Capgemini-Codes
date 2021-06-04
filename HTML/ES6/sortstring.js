var str=["capgemini","taka","debe","na","amader"];

function display(){
    console.log(str);
    console.log("ascending order");
    str.sort().forEach(e=>console.log(e));
    console.log("descending order");
    str.sort((a,b)=>b.localeCompare(a)).forEach(e=>console.log(e));
    console.log("starts with C");
    str.sort().filter((c)=>c.startsWith("c")).forEach(e=>console.log(e));
}
function remove(a){
    let idx = str.indexOf(a);
    console.log("remove");
    str.splice(idx,1);
    str.forEach(e=>console.log(e));
}

display();
remove("na");