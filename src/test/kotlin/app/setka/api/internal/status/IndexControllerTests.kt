package app.setka.api.internal.status

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import kotlin.test.assertEquals

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTests {
  @Autowired
  lateinit var controller: IndexController

  @Test
  fun call() {
    assertEquals(HttpStatus.OK, controller.call().statusCode)
  }
}