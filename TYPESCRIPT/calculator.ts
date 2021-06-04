export class Calculator{
    amt:number;
    years:number;
    rate:number;
    radius:number;

    calcSimple ():number{
        return this.amt * this.years * this.rate / 100.0;
    }

    calcCompound():number{
        return this.amt * Math.pow((1+this.rate / 100.0),this.years) - this.amt;
    }
    calcArea():number{
        return 3.14 * this.radius * this.radius;
    }
    calcPerimeter():number{
        return 2 * 3.14 * this.radius;
    }
}