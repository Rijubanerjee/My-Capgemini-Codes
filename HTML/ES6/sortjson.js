var empjsonarr=[{"eid":1008,"name":"saitama","salary":426996.0},
             {"eid":1009,"name":"guy sensei","salary":99.0},
             {"eid":1001,"name":"goku","salary":99999.9}];

function display(){
    console.log("sort by id");
    empjsonarr.sort((a,b)=>a.eid-b.eid).forEach(e=>console.log(e));
    console.log("sort by name");
    empjsonarr.sort((a,b)=>a.name.localeCompare(b.name)).forEach(e=>console.log(e));
    console.log("sort by salary");
    empjsonarr.sort((a,b)=>a.salary-b.salary).forEach(e=>console.log(e));
    console.log("to uppercase");
    empjsonarr.map((e)=>e.name.toUpperCase()).forEach((e)=>console.log(e));
}

display();