package in.codetripper.blueprint.domain;

import in.codetripper.blueprint.Config;
import in.codetripper.blueprint.domain.services.GreetingService;
import in.codetripper.blueprint.infra.io.FileReaderAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Greeter {
  @Autowired
  FileReaderAdapter fileAdapter;
  @Autowired
  Config config;
  private GreetingService greetingService;

  public Greeter(@QualifierType("ciao") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public void greet() {
    log.info("{} world", greetingService.getGreeting());
    fileAdapter.readFile(config.getTemplateLocation());
  }

}
