package com.example.ticket;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private Long id;
    private TicketStatus status;
    private UserRole ownerRole;
    private Instant creationDate;
    private List<AuditLogEntry> auditLog = new ArrayList<>();

    // Getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public TicketStatus getStatus() { return status; }
    public void setStatus(TicketStatus status) { this.status = status; }

    public UserRole getOwnerRole() { return ownerRole; }
    public void setOwnerRole(UserRole ownerRole) { this.ownerRole = ownerRole; }

    public Instant getCreationDate() { return creationDate; }
    public void setCreationDate(Instant creationDate) { this.creationDate = creationDate; }

    public List<AuditLogEntry> getAuditLog() { return auditLog; }
}
