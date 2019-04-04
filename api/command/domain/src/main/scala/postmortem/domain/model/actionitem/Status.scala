package postmortem.domain.model.actionitem

sealed trait Status

object Status {

  case object NotAssigned   extends Status
  case object Investigating extends Status
  case object Fixed         extends Status
  case object WontFix       extends Status

}
