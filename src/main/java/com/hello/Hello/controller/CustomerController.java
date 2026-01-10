package com.hello.Hello.controller;
@RestController
@RequestMapping("/api/customer")
@PreAuthorize("hasRole('CUSTOMER')")
public class CustomerController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Customer Dashboard";
    }
}
