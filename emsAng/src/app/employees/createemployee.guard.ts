import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CreateemployeeGuard implements CanActivate {

  constructor(private route:Router){}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

      let depID: number = Number(route.paramMap.get("id"));

      if(depID%2==0){
        alert("You are not authorized to create an Employee Here")
        this.route.navigate(["/home"])
      }
    return true;
  }
  
}
