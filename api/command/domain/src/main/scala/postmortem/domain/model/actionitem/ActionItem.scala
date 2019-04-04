package postmortem.domain.model.actionitem

import postmortem.domain.model.actionitem.Status.NotAssigned

sealed abstract case class ActionItem(
    id: ActionItemId,
    duration: Duration,
    issuer: Issuer,
    detection: Detection,
    status: Status,
    assignees: Assignees,
    report: Report,
    tags: Tags
)

object ActionItem {

  def open(id: ActionItemId, openDate: OpenDate, issuer: Issuer, detection: Detection, tags: Tags): ActionItem =
    new ActionItem(
      id = id,
      duration = Duration.initial(openDate),
      issuer = issuer,
      detection = detection,
      status = NotAssigned,
      assignees = Assignees.noAssignees,
      report = Report.initial,
      tags = tags
    ) {}

}
