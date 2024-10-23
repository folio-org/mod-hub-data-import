package org.folio.hub.data.importing;

import static org.springframework.context.annotation.FilterType.REGEX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "org.folio", excludeFilters = @ComponentScan.Filter(type = REGEX, pattern =
  {"org.folio.spring.tools.systemuser.*", "org.folio.spring.tools.batch.*"}))
public class HubDataImportApplication {

  public static void main(String[] args) {
    SpringApplication.run(HubDataImportApplication.class, args);
  }

}
