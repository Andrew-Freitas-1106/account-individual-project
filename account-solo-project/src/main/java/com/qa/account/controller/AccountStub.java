package com.qa.account.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.account.model.Account;

public class AccountStub {
	private static Map<Long, Account> accounts = new HashMap<Long, Account>();
	private static Long idIndex = 3L;

	static {
		Account a = new Account(1L, "Andrew", "Freitas", "A001", "123 Sunshine Road", "afreitas@qa.com", "22");
		accounts.put(1L, a);
		Account b = new Account(2L, "Nathan", "Athens","T246", "666 Gloomy Road", "nathens@qa.com", "18");
		accounts.put(2L, b);
		Account c = new Account(3L, "Michael", "Massey","D032", "212 Cheerful Street", "mmassey@qa.com", "24");
		accounts.put(3L, c);
		Account d = new Account(4L, "Brigitte", "Roth","D122", "101 Kingston High Street", "broth@qa.com", "25");
		accounts.put(4L, d);
	}

	public static List<Account> list() {
		return new ArrayList<Account>(accounts.values());
	}

	public static Account create(Account account) {
		idIndex += idIndex;
		account.setId(idIndex);
		accounts.put(idIndex, account);
		return account;
	}

	public static Account get(Long id) {
		return accounts.get(id);
	}

	public static Account update(Long id, Account account) {
		accounts.put(id, account);
		return account;
	}

	public static Account delete(Long id) {
		return accounts.remove(id);
	}
}
