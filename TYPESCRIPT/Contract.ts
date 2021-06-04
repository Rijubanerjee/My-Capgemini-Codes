import { Emp } from "./Emp";
	
	export class Contract extends Emp{
	    constructor(eid:number,ename:string,salary:number,private days:number){
	        super(eid,ename,salary);
	    }
	    display(): void {
	        console.log(`EID: ${this.getEid()} ,
	        EName : ${this.getName()} ,
	        Salary : ${this.getSalary()} ,
	        DA : na ,
	        PF : na,
	        Days : ${this.days} ,
	        NetSalary : ${this.calcSal()}`);
	        console.log("--------------------------------------------------------------");
	    }
	    calcSal(): number {
	       return this.getSalary()*this.days;
	    }
	    
	}