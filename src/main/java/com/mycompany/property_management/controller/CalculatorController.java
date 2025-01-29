package com.mycompany.property_management.controller;


import com.mycompany.property_management.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Calculator")
public class CalculatorController {

    @GetMapping("/add") //Method level mapping of url to controller function
    //http://localhost:8080/api/v1/Calculator/add?num11=6.7&num=1.6
    public Double add(@RequestParam("num1") Double num1,@RequestParam("num2")  Double num2)
    {
        return num1 + num2;
    }

    @GetMapping("/sub/{num1}/{num2}")  //Map the value of url to java variable by path Variable method
    public Double substract(@PathVariable("num1") Double num1,@PathVariable("num2") Double num2){
        Double Result = null;
        if(num1>num2){
            Result = num1-num2;
        }
        else {
            Result = num2 - num1;
        }
        return Result;
    }
    @PostMapping("/mul")
    public  ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double Result = null;
        Result = calculatorDTO.getNum1() * calculatorDTO.getNum2() *calculatorDTO.getNum3() * calculatorDTO.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(Result, HttpStatus.CREATED);
        return responseEntity;
    }
}
