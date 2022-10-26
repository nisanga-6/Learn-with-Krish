import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { LkrFormatterPipe } from './employees/shared/lkr-formatter.pipe';
import{FormsModule} from '@angular/forms';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { HomeComponent } from './home/home.component'
import { RouterModule } from '@angular/router';
import { CreateemployeeGuard } from './employees/createemployee.guard';

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    LkrFormatterPipe,
    ProgressBarComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([

      {path: 'employees', component:EmployeesComponent},
      {path: 'employees/id', component:EmployeesComponent ,canActivate:[CreateemployeeGuard]},
      {path:'home',component:HomeComponent},
      {path:'',redirectTo:'home',pathMatch:'full'}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
