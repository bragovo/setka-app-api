package app.setka.api.web.leagues

import app.setka.api.models.LeagueModel
import app.setka.api.repositories.LeagueRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/leagues")
class LeagueIndexController(
  val repo: LeagueRepo
) {
  @GetMapping
  fun call (): Flux<LeagueModel> {
    return repo.findAll()
  }
}

