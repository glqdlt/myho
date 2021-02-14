package com.glqdlt.myho.webapp.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping
public class RootController {
    @GetMapping()
    public String getRoot() {
        return "redirect:/dashboard";
    }

}
