package com.glqdlt.myho.webapp.site.item;

import com.glqdlt.myho.webapp.navigation.NavMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author glqdlt
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @NavMenu(displayName = "아이템 보기", iconCssName = "fa fa-table")
    @GetMapping
    public String getItem() {
        return "base_page";
    }

}
