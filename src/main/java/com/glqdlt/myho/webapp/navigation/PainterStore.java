package com.glqdlt.myho.webapp.navigation;

import java.util.List;

public interface PainterStore {
    NavigationPainter getRoot();

    List<AbstractNavigationMenuPainter> findAll();

    void append(AbstractNavigationMenuPainter navigationPainter);
}
