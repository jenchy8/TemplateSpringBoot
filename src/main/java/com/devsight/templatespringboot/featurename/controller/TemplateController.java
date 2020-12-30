package com.devsight.templatespringboot.featurename.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsight.templatespringboot.featurename.model.TemplateEntity;
import com.devsight.templatespringboot.featurename.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping("/data")
    public TemplateEntity getData() {
        return templateService.getData();
    }
}
