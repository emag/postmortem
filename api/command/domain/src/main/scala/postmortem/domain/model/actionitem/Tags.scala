package postmortem.domain.model.actionitem

case class Tags(breachEncapsulationOfValues: Set[Tag])

object Tags {

  val noTags: Tags = Tags(Set.empty)

}
