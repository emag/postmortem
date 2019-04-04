package postmortem.domain.model.actionitem

case class Assignees(breachEncapsulationOfValues: Set[Assignee])

object Assignees {

  val noAssignees: Assignees = Assignees(Set.empty)

}
