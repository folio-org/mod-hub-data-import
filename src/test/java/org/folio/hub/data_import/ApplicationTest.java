package org.folio.hub.data_import;

import org.folio.spring.testing.extension.EnablePostgres;
import org.folio.spring.testing.type.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@EnablePostgres
@IntegrationTest
@SpringBootTest
public class ApplicationTest {

  @Test
  void testApplicationIsUp() {
    assertTrue(true);
  }
}
