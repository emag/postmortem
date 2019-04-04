package postmortem.domain.model.actionitem

case class RootCause(value: String)

object RootCause {

  val initial: RootCause = RootCause("")

}
