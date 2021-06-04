"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Contract = void 0;
var Emp_1 = require("./Emp");
var Contract = /** @class */ (function (_super) {
    __extends(Contract, _super);
    function Contract(eid, ename, salary, days) {
        var _this = _super.call(this, eid, ename, salary) || this;
        _this.days = days;
        return _this;
    }
    Contract.prototype.display = function () {
        console.log("EID: " + this.getEid() + " ,\n\t        EName : " + this.getName() + " ,\n\t        Salary : " + this.getSalary() + " ,\n\t        DA : na ,\n\t        PF : na,\n\t        Days : " + this.days + " ,\n\t        NetSalary : " + this.calcSal());
        console.log("--------------------------------------------------------------");
    };
    Contract.prototype.calcSal = function () {
        return this.getSalary() * this.days;
    };
    return Contract;
}(Emp_1.Emp));
exports.Contract = Contract;
