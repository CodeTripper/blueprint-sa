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
  @Value("${appname}")
  private String appName;
  @Value("${greeting.english}")
  private String englishGreeting;
  @Value("${greeting.spanish}")
  private String spanishGreeting;
}
