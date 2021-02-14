package com.glqdlt.myho.webapp;

import com.glqdlt.myho.webapp.navigation.AbstractNavigationMenuPainter;
import com.glqdlt.myho.webapp.navigation.NavigationPainter;
import com.glqdlt.myho.webapp.navigation.PainterStore;

import java.util.Arrays;

public class HardCodingMenuPainter implements PainterStore {
    public NavigationPainter getAllSource() {
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
        return root;
    }

}
