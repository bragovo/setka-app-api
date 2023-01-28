package app.setka.api.internal.status

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/internal/status")
class IndexController {

  @GetMapping
  fun call (): ResponseEntity<Void> {
    return ResponseEntity(HttpStatus.OK)
  }
}
