package in.codetripper.blueprint;

import static in.codetripper.blueprint.Constants.PACKAGE_NAME_FOR_SCANNING;

import in.codetripper.blueprint.domain.Greeter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ComponentScan(PACKAGE_NAME_FOR_SCANNING)
public class Application {
  public static void main(String[] args) {
    log.debug("hello world");
    ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
    Greeter greeter = context.getBean(Greeter.class);
    greeter.greet();
  }

}
