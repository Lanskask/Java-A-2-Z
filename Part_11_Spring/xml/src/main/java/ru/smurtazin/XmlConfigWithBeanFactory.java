package ru.smurtazin;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import ru.smurtazin.models.Oracle;

public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory =
                new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new
//                ClassPathResource("META-INF/spring/xml-bean-factory-context.xml"));
                ClassPathResource("xml-bean-factory-context.xml"));
        Oracle oracle = (Oracle) factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }

}
