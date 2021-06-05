import { Flight } from "./flight";
import { Flyable } from "./flyable";

function display(){
    let obj:Flyable = new Flight();
    obj.fly();
}

display();