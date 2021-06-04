import { Calculator } from "./calculator";

function display(){
    let obj:Calculator = new Calculator();
    obj.amt = 5000;
    obj.years = 2;
    obj.rate = 2.5;
    obj.radius = 2;
    console.log(`Simple interest = ${obj.calcSimple().toFixed(2)}`);
    console.log(`Simple interest = ${obj.calcCompound().toFixed(2)}`);
    console.log(`Area of the circle ${obj.calcArea()}`);
    console.log(`Perimeter of the circle ${obj.calcPerimeter()}`);
}

display();