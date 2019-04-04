package postmortem.domain.model.actionitem

import java.time.Instant

import org.scalatest.{DiagrammedAssertions, FlatSpec}

class IssuerTest extends FlatSpec with DiagrammedAssertions {

  behavior of Issuer.getClass.getName

  // FIXME use property based test
  it should "open an action item" in {
    val actionItemId = ActionItemId("new-action-item-id")
    val detection    = Detection("something went wrong")
    val tags         = Tags(Set(Tag("tag1"), Tag("tag2")))
    val reporter     = Issuer(IssuerId("an-issuer-id"))

    val actionItem = reporter.openActionItem(
      actionItemId = actionItemId,
      openDate = OpenDate(Instant.now()),
      detection = detection,
      tags = tags
    )

    println(actionItem)
  }

}
