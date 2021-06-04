export abstract class Emp {
    constructor(private eid:number,private ename:string,private salary:number){}
    
    abstract display():void;
    abstract calcSal():number;
    // getter and setters
    getSalary():number{
        return this.salary;
    }
    setSalary(sal:number):void{
        this.salary=sal;
    }
    getName():string{
        return this.ename;
    }
    setName(ename:string):void{
        this.ename=ename;
    }
    getEid():number{
        return this.eid;
    }
    setEid(eid:number):void{
        this.eid=eid;
    }

}