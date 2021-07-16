package spittr.config;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}
	@Override
	protected ApplicationContextInitializer<?>[] getServletApplicationContextInitializers() {
		
		return super.getServletApplicationContextInitializers();
	}
	@Override
	protected void registerContextLoaderListener(ServletContext servletContext) {
		// TODO Auto-generated method stub
		super.registerContextLoaderListener(servletContext);
	}
}
