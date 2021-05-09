import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { UserService } from './services/user.service';
import {EcommerceComponent} from "./ecommerce/ecommerce.component";
import {ProductsComponent} from "./products/products.component";
import {ShoppingCartComponent} from "./shopping-cart/shopping-cart.component";
import {OrdersComponent} from "./orders/orders.component";
import {EcommerceService} from "./services/EcommerceService";

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    AppComponent,
    EcommerceComponent,
    ProductsComponent,
    ShoppingCartComponent,
    OrdersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService, EcommerceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
