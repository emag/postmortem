package postmortem.domain.model.actionitem

case class Duration(openDate: OpenDate, closedDate: Option[ClosedDate])

object Duration {

  def initial(openDate: OpenDate): Duration = Duration(
    openDate = openDate,
    closedDate = None
  )

}
