"use strict";
exports.__esModule = true;
exports.Emp = void 0;
var Emp = /** @class */ (function () {
    function Emp(eid, ename, salary) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }
    // getter and setters
    Emp.prototype.getSalary = function () {
        return this.salary;
    };
    Emp.prototype.setSalary = function (sal) {
        this.salary = sal;
    };
    Emp.prototype.getName = function () {
        return this.ename;
    };
    Emp.prototype.setName = function (ename) {
        this.ename = ename;
    };
    Emp.prototype.getEid = function () {
        return this.eid;
    };
    Emp.prototype.setEid = function (eid) {
        this.eid = eid;
    };
    return Emp;
}());
exports.Emp = Emp;
