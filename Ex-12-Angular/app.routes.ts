import { Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { Component } from '@angular/core';

export const routes: Routes = [
    {path: 'reg-com', component: RegistrationComponent},
    {path: 'log-com', component: LoginComponent}
];