package com.glqdlt.myho.webapp.navigation;

import com.glqdlt.myho.api.UrlIdentity;

public interface NavigationMenu extends UrlIdentity {
    String getDisplayText();

    String getCssClassName();

}
