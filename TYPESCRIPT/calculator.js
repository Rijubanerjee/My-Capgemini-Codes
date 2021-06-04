"use strict";
exports.__esModule = true;
exports.Calculator = void 0;
var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.calcSimple = function () {
        return this.amt * this.years * this.rate / 100.0;
    };
    Calculator.prototype.calcCompound = function () {
        return this.amt * Math.pow((1 + this.rate / 100.0), this.years) - this.amt;
    };
    Calculator.prototype.calcArea = function () {
        return 3.14 * this.radius * this.radius;
    };
    Calculator.prototype.calcPerimeter = function () {
        return 2 * 3.14 * this.radius;
    };
    return Calculator;
}());
exports.Calculator = Calculator;
