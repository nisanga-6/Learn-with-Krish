import { Component, OnInit } from '@angular/core';
import { Employee } from '../employees.model';
import employees from './Data/employees.json'

@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  title:String= 'Employee Management Solution'
  showIcon:Boolean = false
  employees:Employee[] = employees
  filteredEmployees:Employee[] = employees
  message:string=""
 private _designationFilter :string=""

 set designationFilter(value:string){

  console.log("Setter Fired" +value)
  this._designationFilter=value
  this.filterByDesignation()
 }

 get designationFilter():string{

  return this._designationFilter;
 }

  constructor() { }

  ngOnInit(): void {
  }

  toggleIcon(){

    this.showIcon=!this.showIcon;
  }

  filterByDesignation(){

  this.filteredEmployees =   this.employees.filter(employee=>employee.designation.includes(this.designationFilter))
  }

  onMessageReceived(value:string){
    this.message=value
  }

}
