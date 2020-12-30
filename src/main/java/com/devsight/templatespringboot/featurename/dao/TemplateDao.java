package com.devsight.templatespringboot.featurename.dao;

import com.devsight.templatespringboot.featurename.model.TemplateEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TemplateDao {

    public TemplateEntity getData() {
        TemplateEntity entity = new TemplateEntity();
        entity.setId(1);
        entity.setName("Entity name");
        return entity;
    }
}
