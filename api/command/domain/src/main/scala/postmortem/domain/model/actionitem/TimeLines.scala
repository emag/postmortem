package postmortem.domain.model.actionitem

case class TimeLines(breachEncapsulationOfValues: Set[TimeLine])

object TimeLines {

  val noTimeLines: TimeLines = TimeLines(Set.empty)

}
