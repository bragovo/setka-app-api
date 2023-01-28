package app.setka.api.repositories

import app.setka.api.models.LeagueModel
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.UUID

interface LeagueRepo : ReactiveCrudRepository<LeagueModel, UUID>