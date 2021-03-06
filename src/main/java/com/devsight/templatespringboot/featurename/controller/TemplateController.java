package com.devsight.templatespringboot.featurename.controller;

import com.devsight.templatespringboot.featurename.model.TemplateEntity;
import com.devsight.templatespringboot.featurename.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping("/data")
    public TemplateEntity getData() {
        return templateService.getData();
    }
}
