package alekseybykov.portfolio.springcore.mixedconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Aleksey Bykov
 * @since 16.09.2020
 */
@Configuration
@ComponentScan("alekseybykov.portfolio.springcore.mixedconfig")
@ImportResource("mixedconfig/application-context.xml")
public class ApplicationConfig { }
