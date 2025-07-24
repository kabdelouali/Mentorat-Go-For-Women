package com.example.ticket;

import java.time.Instant;

public class AuditLogEntry {
    private Instant timestamp;
    private UserRole changedBy;
    private TicketStatus oldStatus;
    private TicketStatus newStatus;

    public AuditLogEntry(Instant timestamp, UserRole changedBy, TicketStatus oldStatus, TicketStatus newStatus) {
        this.timestamp = timestamp;
        this.changedBy = changedBy;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
    }

    public Instant getTimestamp() { return timestamp; }
    public UserRole getChangedBy() { return changedBy; }
    public TicketStatus getOldStatus() { return oldStatus; }
    public TicketStatus getNewStatus() { return newStatus; }
}
