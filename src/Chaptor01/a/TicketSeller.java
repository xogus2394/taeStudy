package Chaptor01.a;

import Chaptor01.a.TicketOffice;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public  TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
