package telran.spring.account.service;

import telran.spring.account.model.Account;

public interface AccountingService {
	Boolean addAccount(Account account);
	Boolean deleteAccount(String username);
	Boolean updateAccount(Account account);
	Boolean isExist(String username);

}
