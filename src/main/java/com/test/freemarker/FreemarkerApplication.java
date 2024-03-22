package com.test.freemarker;

import com.test.freemarker.application.FreeMarkerCommandLineRunner;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

@SpringBootApplication
@Log4j2
public class FreemarkerApplication {

	private final static FreeMarkerCommandLineRunner service = new FreeMarkerCommandLineRunner();
	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);

	}

	@Bean
	public Configuration config()  {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
		try {
			String extBasePath = "C:\\FPF-Fondimpresa";
			File extDir = new File(extBasePath);
			if (extDir.exists() && extDir.isDirectory()){
				cfg.setTemplateLoader(new FileTemplateLoader(extDir));
			}else{
				// Where do we load the templates from:
				cfg.setClassForTemplateLoading(this.getClass(), "/templates");
			}
			// Some other recommended settings:
			cfg.setIncompatibleImprovements(new Version(2, 3, 20));
			cfg.setDefaultEncoding("UTF-8");
			cfg.setLocale(Locale.US);
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

			return cfg;
		} catch (IOException e) {
			log.error(e);
			throw new RuntimeException(e);
		}

	}

}
