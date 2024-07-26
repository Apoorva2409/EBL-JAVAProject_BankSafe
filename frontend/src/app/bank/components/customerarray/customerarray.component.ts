import { Component } from '@angular/core';
// import { FormGroup, FormBuilder, Validators } from '@angular/forms';
// import { of } from 'rxjs';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',
  // standalone: true,
  // imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  
  customer: CustomerTS=new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User", "1")
  customer2: CustomerTS=new CustomerTS("John Doe1", "john1@example.com", "john_doe1", "password123", "Admin", "2")

  customers: CustomerTS[] = [this.customer,this.customer2];
  

}

