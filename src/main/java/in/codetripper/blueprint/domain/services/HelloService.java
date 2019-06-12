package in.codetripper.blueprint.domain.services;

import in.codetripper.blueprint.Config;
import in.codetripper.blueprint.domain.QualifierType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@QualifierType("hello")
public class HelloService implements GreetingService {
  @Autowired
  Config config;
  @Override
  public String getGreeting() {
    return config.getEnglishGreeting();
  }
}
