package in.codetripper.blueprint;

import in.codetripper.blueprint.domain.Greeter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ComponentScan("in.codetripper.blueprint")
public class Application {
  public static void main(String[] args) {
    log.debug("hello world");
    ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
    Greeter greeter = context.getBean(Greeter.class);
    greeter.greet();
  }

}
