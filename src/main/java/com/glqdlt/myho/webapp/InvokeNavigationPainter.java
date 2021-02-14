package com.glqdlt.myho.webapp;

import com.glqdlt.myho.webapp.navigation.PainterStore;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * @author glqdlt
 */
public class InvokeNavigationPainter implements HandlerInterceptor {
    private PainterStore store;

    private Boolean isSecurity;

    private static final String KEY = "_navigationSource";

    public InvokeNavigationPainter(PainterStore store, Boolean isSecurity) {
        this.store = store;
        this.isSecurity = isSecurity;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HttpSession session = request.getSession();
        if (session != null && session.getAttribute(KEY) == null) {
            final String source;
            if (isSecurity) {
                Principal principal = request.getUserPrincipal();
                source = store.getRoot().draw();
            } else {
                source = store.getRoot().draw();
            }
            session.setAttribute(KEY, source);
        }

    }


}
