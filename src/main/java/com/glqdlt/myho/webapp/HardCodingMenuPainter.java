package com.glqdlt.myho.webapp;

import com.glqdlt.myho.webapp.navigation.AbstractNavigationMenuPainter;
import com.glqdlt.myho.webapp.navigation.NavigationPainter;
import com.glqdlt.myho.webapp.navigation.PainterStore;
import com.glqdlt.myho.webapp.navigation.RootNavigationPainter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author glqdlt
 */
public class HardCodingMenuPainter implements PainterStore {
    private final List<AbstractNavigationMenuPainter> sources = new LinkedList<>();

    public HardCodingMenuPainter() {
        AbstractNavigationMenuPainter.Single dashboard = new AbstractNavigationMenuPainter.Single();
        dashboard.setDisplayText("대시보드");
        dashboard.setCssClassName("fa fa-dashboard");

        AbstractNavigationMenuPainter.Multiple item = new AbstractNavigationMenuPainter.Multiple();
        item.setDisplayText("아이템");
        item.setCssClassName("fa fa-table");

        AbstractNavigationMenuPainter.Single item1 = new AbstractNavigationMenuPainter.Single();
        item1.setDisplayText("아이템 보기");
        item1.setLinkUrl("/item");

        AbstractNavigationMenuPainter.Single item2 = new AbstractNavigationMenuPainter.Single();
        item2.setDisplayText("아이템 관리");
        item2.setLinkUrl("/item/setup");

        item.add(item1);
        item.add(item2);

        sources.add(dashboard);
        sources.add(item);
    }

    public NavigationPainter getRoot() {
        RootNavigationPainter root = new RootNavigationPainter();
        for (AbstractNavigationMenuPainter d : findAll()) {
            root.append(d);
        }
        return root;
    }

    @Override
    public List<AbstractNavigationMenuPainter> findAll() {
        return new ArrayList<>(this.sources);
    }

    @Override
    public void append(AbstractNavigationMenuPainter navigationPainter) {
        this.sources.add(navigationPainter);
    }

}
