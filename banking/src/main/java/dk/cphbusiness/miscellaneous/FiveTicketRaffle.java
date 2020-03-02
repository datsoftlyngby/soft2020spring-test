package dk.cphbusiness.miscellaneous;

import java.util.Set;

public class FiveTicketRaffle extends Raffle {
  @Override
  protected Set<Integer> createTickets() {
    return Set.of(7, 9, 13, 47, 11);
    }
}
