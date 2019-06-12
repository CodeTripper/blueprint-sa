package in.codetripper.blueprint;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:db.properties"),
    @PropertySource("classpath:application.properties")
})
@Data
public class Config{
  @Value("${blueprint.appname}")
  private String appName;
  @Value("${blueprint.greeting.english}")
  private String englishGreeting;
  @Value("${blueprint.greeting.spanish}")
  private String spanishGreeting;
  @Value("${blueprint.template.location}")
  private String templateLocation;
}
