package com.example.demo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String phone;




    // lombok is used to generate getters and setters automatically
    // public String getName() {
    //     return name;
    // }

    // public String getPhone() {
    //     return phone;
    // }

    // public Employee(String name, String phone) {
    //     this.name = name;
    //     this.phone = phone;
    // }

    
}
