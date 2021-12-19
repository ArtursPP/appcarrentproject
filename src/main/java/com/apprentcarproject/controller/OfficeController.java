package com.apprentcarproject.controller;


import com.apprentcarproject.mapper.OfficeMapper;
import com.apprentcarproject.service.OfficeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/rest/Office.svc")
@AllArgsConstructor
@CrossOrigin
public class OfficeController {

    private OfficeMapper officeMapper;

    private OfficeService officeService;



}
