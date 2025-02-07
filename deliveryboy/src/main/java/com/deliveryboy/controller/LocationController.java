package com.deliveryboy.controller;

import com.deliveryboy.service.kafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private kafkaService kafkaService;

    @PostMapping("/update")
     public ResponseEntity<?> updateLocation(){
        IntStream.range(0,2).forEach((i) -> {
            kafkaService.updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )");
        });
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
