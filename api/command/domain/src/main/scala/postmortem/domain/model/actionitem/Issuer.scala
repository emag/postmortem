package postmortem.domain.model.actionitem

case class Issuer(id: IssuerId) {

  def openActionItem(actionItemId: ActionItemId, openDate: OpenDate, detection: Detection, tags: Tags): ActionItem =
    ActionItem.open(
      id = actionItemId,
      openDate = openDate,
      issuer = this,
      detection = detection,
      tags = tags
    )

}
