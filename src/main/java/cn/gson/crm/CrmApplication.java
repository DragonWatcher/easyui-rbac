package cn.gson.crm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class CrmApplication {
    
    private static final Logger logger = LoggerFactory.getLogger(CrmApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
		logger.info("-------------------------启动完毕-------------------------");
	}
}
