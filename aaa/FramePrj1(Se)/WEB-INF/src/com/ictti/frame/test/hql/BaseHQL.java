package com.ictti.frame.test.hql;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class BaseHQL {
	static protected XmlBeanFactory getFactory() {
		Resource resource = new FileSystemResource("WEB-INF/action-servlet.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);

		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();
		cfg.setLocation(new FileSystemResource(
				"WEB-INF/src/database.properties"));
		cfg.postProcessBeanFactory(beanFactory);
		return beanFactory;
	}
}
