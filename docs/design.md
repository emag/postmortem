# Design

## Actors

* User
    * Issuer
    * Asignee

## Events

### Action Item

* As a issuer, a user opens an action item with the detection
* Every user can assign someone to an action item
* Assignees record the following items for each action item
    * timelines
    * summary
    * impact
    * trigger
    * route cause
    * resolution
* Every user can change an action item status
* Every user can tag/untag to an action item

### Authentication

* Every user needs to log-in to use this `postmortem` app
