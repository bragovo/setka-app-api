package app.setka.api.models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table(name = "leagues")
class LeagueModel (
  @Id
  val id: UUID = UUID.randomUUID(),
  val name: String
)
