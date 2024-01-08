package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Ward;
import com.hms.service.WardService;


@RestController
@RequestMapping("/wards")
public class WardController {
	
	@Autowired
    private WardService wardService;

    @GetMapping
    public List<Ward> getAllWards() {
        return wardService.getAllWards();
    }

    @GetMapping("/{id}")
    public Ward getWardById(@PathVariable int id) {
        return wardService.getWardById(id);
    }

}
