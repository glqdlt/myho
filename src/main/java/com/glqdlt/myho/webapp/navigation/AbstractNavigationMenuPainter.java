package com.glqdlt.myho.webapp.navigation;

import java.util.LinkedList;
import java.util.List;

/**
 * @author glqdlt
 */
public abstract class AbstractNavigationMenuPainter implements NavigationPainter, NavigationMenu {
    private String displayText = "";
    private String cssClassName = "fa fa-minus";
    private String linkUrl = "#";

    @Override
    public String getMethod() {
        return "GET";
    }

    private NavigationDisplayTextRender navigationDisplayTextRender = NavigationDisplayTextRenders.SUB_MENU;

    public void setupMainMenu() {
        this.navigationDisplayTextRender = NavigationDisplayTextRenders.MAIN_MENU;
    }

    public void setNavigationDisplayTextRender(NavigationDisplayTextRender navigationDisplayTextRender) {
        this.navigationDisplayTextRender = navigationDisplayTextRender;
    }

    public abstract String draw();

    public String getNavigationDisplayTextRender() {
        return navigationDisplayTextRender.render(getDisplayText());
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getCssClassName() {
        return cssClassName;
    }

    public void setCssClassName(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    public String getPath() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public static class Single extends AbstractNavigationMenuPainter {

        @Override
        public String draw() {
            return String.format("<li><a href='%s'><i class='%s'></i>%s</a></li>", getPath(), getCssClassName(), getNavigationDisplayTextRender());
        }
    }

    public static class Multiple extends AbstractNavigationMenuPainter {

        private final List<AbstractNavigationMenuPainter> child = new LinkedList<>();

        public Multiple() {
            super.setCssClassName("fa fa-plus");
        }


        public Multiple(List<AbstractNavigationMenuPainter> child) {
            super();
            this.child.addAll(child);
        }

        public void add(AbstractNavigationMenuPainter child) {
            this.child.add(child);
        }

        public List<AbstractNavigationMenuPainter> getChild() {
            return child;
        }

        @Override
        public String draw() {
            StringBuilder childDrawSource = new StringBuilder();

            for (AbstractNavigationMenuPainter c : getChild()) {
                childDrawSource.append(c.draw());
            }

            return String.format("<li class='treeview' style='height: auto;'>" +
                    "<a href='%s'>" +
                    "<i class='%s'></i>" +
                    "%s" +
                    "<span class='pull-right-container'>" +
                    "<i class='fa fa-angle-left pull-right'></i>" +
                    "</span>" +
                    "</a>" +
                    "<ul class='treeview-menu' style='display: none;'>" +
                    "%s" +
                    "</ul>" +
                    "</li>", getPath(), getCssClassName(), getNavigationDisplayTextRender(), childDrawSource.toString());
        }
    }
}
