package com.glqdlt.myho.webapp.site;

import com.glqdlt.myho.webapp.navigation.AbstractNavigationMenuPainter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;

/**
 * @author glqdlt
 */
public class ViewTypeControllerBase {
    @ModelAttribute
    public void setupNav(Model model) {

        AbstractNavigationMenuPainter f = new AbstractNavigationMenuPainter.Single();
        f.setDisplayText("1");

        AbstractNavigationMenuPainter fff = new AbstractNavigationMenuPainter.Single();
        fff.setDisplayText("2-1");
        AbstractNavigationMenuPainter fff2 = new AbstractNavigationMenuPainter.Single();
        fff2.setDisplayText("2-2");


        AbstractNavigationMenuPainter f3 = new AbstractNavigationMenuPainter.Single();
        f3.setDisplayText("3");


        AbstractNavigationMenuPainter f2 = new AbstractNavigationMenuPainter.Multiple(Arrays.asList(fff, fff2));
        f2.setDisplayText("2");
        AbstractNavigationMenuPainter root = new AbstractNavigationMenuPainter.Multiple(Arrays.asList(f, f2, f3));
        root.setDisplayText("0");
        root.setupRootMenu();

        model.addAttribute("navSource", root.draw());
    }
}
