package tests;

import org.junit.Test;
import resources.Account;
import resources.AccountTestResources;
import org.junit.Assert;


public class AccountTest {
    @Test
    public void checkNameToEmboss() {

        Account newAccount = new Account(AccountTestResources.TEST_ROW);
        newAccount.checkNameToEmboss();
        Assert.assertTrue(newAccount.checkNameToEmboss());
    }

    @Test
    public void checkNameLength() {
        Account newAccount = new Account(AccountTestResources.TEST_ROW);
        Assert.assertTrue(newAccount.checkNameLength());
    }

    @Test
    public void checkSpaceChar() {
        Account newAccount = new Account(AccountTestResources.TEST_ROW);
        Assert.assertTrue(newAccount.checkSpaceChar());
    }

    @Test
    public void checkMediumSpace() {
        Account newAccount = new Account(AccountTestResources.TEST_ROW);
        Assert.assertTrue(newAccount.checkMediumSpace());
    }
}
