package com.glqdlt.myho.webapp.site;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author glqdlt
 */
//@Component
public class DynamicController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String zz = request.getRequestURI();
        if (zz.startsWith("/asd")) {
            modelAndView.setViewName("base_page");

        }
        if (zz.startsWith("/api")) {
            MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();

        }
        return modelAndView;
    }
}
