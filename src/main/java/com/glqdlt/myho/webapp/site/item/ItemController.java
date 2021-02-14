package com.glqdlt.myho.webapp.site.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @GetMapping
    public String aaa() {
        return "bb";
    }

    @PostMapping("/aaaa")
    public String gg() {
        return "aa";
    }
}
