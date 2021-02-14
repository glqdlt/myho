package com.glqdlt.myho.webapp.site.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping("/dashboard")
public class DashBoardController {

    @GetMapping
    public String getDashboard(){
        return "site/dashboard";
    }
}
