package com.devsight.templatespringboot.controller;

import com.devsight.templatespringboot.featurename.controller.TemplateController;
import com.devsight.templatespringboot.featurename.service.TemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(TemplateController.class)
public class TemplateControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TemplateService templateService;

    @Test
    public void testGetData() throws Exception {
        this.mvc.perform(get("/data")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
