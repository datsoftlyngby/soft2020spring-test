package dk.cphbusiness.banking;

public class BankDummy implements Bank {

  @Override
  public Account getAccount(String number) {
    throw new UnsupportedOperationException();
    }

  @Override
  public Customer getCustomer(String number) {
    return null;
    }

  @Override
  public String getName() {
    throw new UnsupportedOperationException();
    }
  }
