package com.test.freemarker;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.*;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.MySQLContainer;

import java.util.List;

@Log4j2
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@Testcontainers
@ContextConfiguration
@ExtendWith(SpringExtension.class)
//@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
//@Sql({"classpath:db/ddl.sql", "classpath:db/insert_data.sql"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ApplicationTest.class)

class FreemarkerApplicationTests {

//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "toor";
//	private static final String DATABASE_NAME = "fcoop";
//	private static final MySQLContainer<?> MY_SQL_CONTAINER;
//	static {
//		MY_SQL_CONTAINER = new MySQLContainer<>("mysql:8.1")
//				.withUsername(USERNAME)
//				.withPassword(PASSWORD)
//				.withDatabaseName(DATABASE_NAME);
//		MY_SQL_CONTAINER.start();
//	}
//
//	@DynamicPropertySource
//	private static void configureTestProperties (DynamicPropertyRegistry registry) {
//		registry.add("spring.datasource.url", MY_SQL_CONTAINER::getJdbcUrl);
//		registry.add("spring.datasource.username", MY_SQL_CONTAINER::getUsername);
//		registry.add("spring.datasource.password", MY_SQL_CONTAINER::getPassword);
//	}

	@Test
	void contextLoads() {

		log.info("Is the same {}","".equals(null));
		String empty = null;
		log.info("Is the same {}","".equals(empty));



		Boolean b = null;
		log.info(Boolean.TRUE.equals(b));


		logQuery(1,Boolean.TRUE);
	}
	public void logQuery(Integer idPiano, Boolean delegazionePagamento) {

		

	}
}
