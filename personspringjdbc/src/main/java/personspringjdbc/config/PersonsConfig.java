package personspringjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import personspringjdbc.dao.PersonsDaoImpl;
import personspringjdbc.service.PersonsServiceImpl;

@Configuration
public class PersonsConfig {
	
	@Bean
	public DriverManagerDataSource createDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}
	
	@Bean
	public PersonsDaoImpl getPersonDao() {
		PersonsDaoImpl dao = new PersonsDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;
	}
	
	@Bean(name="pservice")
	public PersonsServiceImpl getPersonService() {
		PersonsServiceImpl service = new PersonsServiceImpl();
		service.setDao(getPersonDao());
		return service;
	}

}
