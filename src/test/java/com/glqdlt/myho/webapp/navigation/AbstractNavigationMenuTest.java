package com.glqdlt.myho.webapp.navigation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class AbstractNavigationMenuTest {

    @Test
    void name() {

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

        String expected = "<li class='treeview' style='height: auto;'><a href='#'><i class='fa fa-circle-o'></i><span>0</span><span class='pull-right-container'><i class='fa fa-angle-left pull-right'></i></span></a><ul class='treeview-menu' style='display: none;'><li><a href='#'><i class='fa fa-circle-o'></i>1</a></li><li class='treeview' style='height: auto;'><a href='#'><i class='fa fa-circle-o'></i>2<span class='pull-right-container'><i class='fa fa-angle-left pull-right'></i></span></a><ul class='treeview-menu' style='display: none;'><li><a href='#'><i class='fa fa-circle-o'></i>2-1</a></li><li><a href='#'><i class='fa fa-circle-o'></i>2-2</a></li></ul></li><li><a href='#'><i class='fa fa-circle-o'></i>3</a></li></ul></li>";
        Assertions.assertEquals(expected, root.draw());
    }
}