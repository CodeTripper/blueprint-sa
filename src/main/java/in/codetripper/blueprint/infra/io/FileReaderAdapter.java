package in.codetripper.blueprint.infra.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class FileReaderAdapter {
  @Autowired
  private final ResourceLoader resourceLoader;
  public void readFile(String path){
    Resource resource = resourceLoader.getResource(path);
    try {
      File file = resource.getFile();
      try (Stream linesStream = Files.lines(file.toPath())) {
        linesStream.forEach(line -> {
          log.debug("line {}",line);
        });
      }
    } catch (IOException e) {
      log.error("error while reading file",e);
    }
  }


}
