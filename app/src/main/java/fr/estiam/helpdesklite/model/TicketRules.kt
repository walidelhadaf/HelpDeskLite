package fr.estiam.helpdesklite.model

object TicketRules {
    fun canTransition(from: Status, to: Status): Boolean {
        return (from == Status.OPEN && to == Status.IN_PROGRESS) ||
                (from == Status.IN_PROGRESS && to == Status.RESOLVED)
    }

    fun sortByPriority(tickets: List<SupportTicket>): List<SupportTicket> {
        return tickets.sortedByDescending { it.priority }
    }
}
