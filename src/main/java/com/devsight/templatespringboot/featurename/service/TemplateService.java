package com.devsight.templatespringboot.featurename.service;

import com.devsight.templatespringboot.featurename.dao.TemplateDao;
import com.devsight.templatespringboot.featurename.model.TemplateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    private TemplateDao templateDao;

    @Autowired
    public TemplateService(TemplateDao templateDao) {
        this.templateDao = templateDao;
    }

    public TemplateEntity getData() {
        return templateDao.getData();
    }
}
