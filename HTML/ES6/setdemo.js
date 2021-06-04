function display() {
    var set = new Set();
    set.add("neem");
    set.add("ka");
    set.add("patta");
    set.add("karwa");
    set.add("hai");
    console.log(set);
    console.log(set.has("karwa"));
    set.delete("karwa");
    set.forEach(e=>console.log(e));
}

display();