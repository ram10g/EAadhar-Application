import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { HomepageComponent } from './homepage/homepage.component';
import { RegisPageComponent } from './regis-page/regis-page.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { UpdateComponent } from './update/update.component';

const appRoutes: Routes = [
  {path: '', component:SignInComponent},
  {path: 'signup', component:RegisPageComponent},
  {path: 'homepage', component:HomepageComponent},
  {path: 'update', component:UpdateComponent},
  {path: 'adminlogin', component:AdminloginComponent},
  {path: 'adminpage', component:AdminPageComponent},
];
@NgModule({
  declarations: [
    AppComponent,
    AdminPageComponent,
    AdminloginComponent,
    HomepageComponent,
    RegisPageComponent,
    SignInComponent,
    UpdateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(appRoutes),
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
