package com.glqdlt.myho.webapp;

import com.glqdlt.myho.webapp.navigation.AbstractNavigationMenuPainter;
import com.glqdlt.myho.webapp.navigation.PainterStore;
import com.glqdlt.myho.webapp.navigation.NavMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author glqdlt
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Bean
    public PainterStore painterStore() {
        return new HardCodingMenuPainter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InvokeNavigationPainter(painterStore(), false));
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<>(new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent se) {

            }

            @Override
            public void sessionDestroyed(HttpSessionEvent se) {

            }
        });
    }

    private static Function<String, String[]> replace = (x) -> x.substring(1, x.length() - 1).split(" ");

    @Autowired
    public void resolveHandlerMapping(RequestMappingHandlerMapping r, PainterStore painterStore) {
        Map<RequestMappingInfo, HandlerMethod> methods = r.getHandlerMethods();
        List<AbstractNavigationMenuPainter.Single> completeItems = methods.keySet().stream().filter(x -> {
            HandlerMethod ccc = methods.get(x);
            return ccc.getMethodAnnotation(NavMenu.class) != null;
        }).map(x -> {
            HandlerMethod r2 = methods.get(x);
            NavMenu navMenuAppendInfor = r2.getMethodAnnotation(NavMenu.class);
            AbstractNavigationMenuPainter.Single single = new AbstractNavigationMenuPainter.Single();
            single.setupMainMenu();
            String[] a = replace.apply(x.toString());
            single.setLinkUrl(a[1]);
            single.setDisplayText(navMenuAppendInfor.displayName());
            if (!navMenuAppendInfor.iconCssName().equals("")) {
                single.setCssClassName(navMenuAppendInfor.iconCssName());
            }
            return single;
        }).collect(Collectors.toList());
        for (AbstractNavigationMenuPainter.Single c : completeItems) {
            painterStore.append(c);
        }
    }

}
