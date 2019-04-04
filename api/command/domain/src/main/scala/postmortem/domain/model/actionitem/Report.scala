package postmortem.domain.model.actionitem

case class Report(
    timeLines: TimeLines,
    summary: Summary,
    impact: Impact,
    trigger: Trigger,
    rootCause: RootCause,
    resolution: Resolution
)

object Report {

  val initial: Report = Report(
    timeLines = TimeLines.noTimeLines,
    summary = Summary.initial,
    impact = Impact.initial,
    trigger = Trigger.initial,
    rootCause = RootCause.initial,
    resolution = Resolution.initial
  )

}
