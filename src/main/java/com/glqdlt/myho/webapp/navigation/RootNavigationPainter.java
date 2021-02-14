package com.glqdlt.myho.webapp.navigation;

import com.glqdlt.myho.api.UrlIdentity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author glqdlt
 */
public class RootNavigationPainter implements NavigationPainter, UrlIdentity {

    private List<AbstractNavigationMenuPainter> child = new ArrayList<>();

    public void append(AbstractNavigationMenuPainter mainMenu) {
        mainMenu.setupMainMenu();
        child.add(mainMenu);
    }

    @Override
    public String draw() {
        StringBuilder childDrawSource = new StringBuilder();

        for (AbstractNavigationMenuPainter c : child) {
            childDrawSource.append(c.draw());
        }
        return childDrawSource.toString();
    }

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getPath() {
        return "/";
    }
}
