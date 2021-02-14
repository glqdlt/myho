package com.glqdlt.myho.webapp.site.attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@RequestMapping("/attribute")
@Controller
public class AttributeController {
    @RequestMapping
    public String aaaa(){
        return "aa";
    }
}
