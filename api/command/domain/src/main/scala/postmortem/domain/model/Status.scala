package postmortem.domain.model

sealed trait Status

object Status {

  case object Investigating extends Status
  case object Fixed         extends Status
  case object WontFix       extends Status

}
