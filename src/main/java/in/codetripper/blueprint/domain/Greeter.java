package in.codetripper.blueprint.domain;

import in.codetripper.blueprint.domain.services.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Greeter {


  private GreetingService greetingService;

  public Greeter(@QualifierType("ciao") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public void greet() {
    log.info("{} world", greetingService.getGreeting());
  }

}
