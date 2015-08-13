package io.vertx.ext.asyncsql;

import io.vertx.core.json.JsonObject;
import org.junit.Before;

public class MySQLClientTest extends SQLTestBase2 {


  @Before
  public void init() {
    client = MySQLClient.createNonShared(vertx,
        new JsonObject()
            .put("host", "192.168.59.103") // Boot2docker.
    );
  }
}
