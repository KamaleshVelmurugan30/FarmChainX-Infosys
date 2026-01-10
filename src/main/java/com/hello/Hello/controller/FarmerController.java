package com.hello.Hello.controller;

@RestController
@RequestMapping("/api/farmer")
@PreAuthorize("hasRole('FARMER')")
public class FarmerController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Farmer Dashboard";
    }
}}
