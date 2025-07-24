package com.example.ticket;

import java.util.Optional;

public class ChangeTicketStatusUseCase {
    public void execute(Long ticketId, TicketStatus newStatus, UserRole userRole) {
        // TODO: Récupérer le ticket depuis le repository
        Optional<Ticket> ticketOpt = Optional.empty();

        if (ticketOpt.isEmpty()) {
            throw new RuntimeException("Ticket not found");
        }

        Ticket ticket = ticketOpt.get();

        // TODO: Implémenter la logique métier (règles, validation, audit...)
    }
}
