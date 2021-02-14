package com.glqdlt.myho.webapp.navigation;

/**
 * @author glqdlt
 */
public class NavigationDisplayTextRenders {
    public static NavigationDisplayTextRender MAIN_MENU = (s) -> String.format("<span>%s</span>", s);
    public static NavigationDisplayTextRender SUB_MENU = (s) -> s;
}
