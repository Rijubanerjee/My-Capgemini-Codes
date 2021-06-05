import { Flyable } from "./Flyable";
	
	export class Flight implements Flyable{
	    maxage: number=100;
	
	    fly(): void {
	        console.log("Flight");
	        console.log(this.maxage);
	    }
	    
	}