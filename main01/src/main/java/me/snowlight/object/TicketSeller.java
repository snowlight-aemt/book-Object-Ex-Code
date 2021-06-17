package me.snowlight.object;

public class TicketSeller {
    private TicketOffice ticketOffice;
    
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice gTicketOffice() {
        return ticketOffice;
    }
}
