package com.hello.Hello.controller;
@RestController
@RequestMapping("/api/distributor")
@PreAuthorize("hasRole('DISTRIBUTOR')")
public class DistributorController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Distributor Dashboard";
    }
}
