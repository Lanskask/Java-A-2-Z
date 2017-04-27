package ru.smurtazin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by a1 on 27.04.17.
 */
public class WebDesc extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                SpringRootConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                SpringWebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "*.do"
        };
    }
}
