package com.glqdlt.myho.webapp.site.dashboard;

import com.glqdlt.myho.webapp.site.ViewTypeControllerBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping("/dashboard")
public class DashBoardController extends ViewTypeControllerBase {

    @GetMapping
    public String getDashboard() {
        return "site/dashboard";
    }

}
