package app.setka.api.internal.status

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import kotlin.test.assertEquals

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StatusControllerTests {
  @Autowired
  lateinit var controller: StatusController

  @Test
  fun call() {
    assertEquals(HttpStatus.OK, controller.call().statusCode)
  }
}
