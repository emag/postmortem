package postmortem.domain.model.actionitem

import java.time.Instant

case class TimeLine(dateTime: Instant, content: String)
