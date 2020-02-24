package dk.cphbusiness.banking;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

  @Test
  public void testCreateAccount() throws Exception {
    Bank bank = new BankDummy();
    Customer customer = new CustomerDummy();
    String number = null;
    Account account = new Account(bank, customer, number);
    assertNotNull(account);
    }

  @Test
  public void testCreateAccountWithBank() {
    Bank bank = new BankDummy();
    Customer customer = new CustomerDummy();
    String number = null;
    Account account = new Account(bank, customer, number);
    assertEquals(bank, account.getBank());
    assertNotNull(account.getBank());
    }

  @Test
  public void testCreateAccountWithNumber() {
    Bank bank = new BankDummy();
    Customer customer = new CustomerDummy();
    String number = "ABC12345";
    Account account = new Account(bank, customer, number);
    assertEquals(number, account.getNumber());
    assertNotNull(account.getNumber());
    }

  @Test
  public void testCreateAccountWithZeroBalance() {
    Bank bank = new BankDummy();
    Customer customer = new CustomerDummy();
    String number = "ABC12345";
    Account account = new Account(bank, customer, number);
    assertEquals(0L, account.getBalance());
    }

  }
