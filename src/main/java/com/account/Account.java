package com.account;

public class Account {

	private int accNumber;
	private String owner;
	private String agency;
	private double balance;
	private double accManutentionTax;

	public int getAccNumber() {
		return accNumber;
	}

	public String getOwner() {
		return owner;
	}

	public String getAgency() {
		return agency;
	}

	public double getBalance() {
		return balance;
	}

	public double getAccManutentionTax() {
		return accManutentionTax;
	}

	public static class Builder {

		private int accNumber;
		private String owner;
		private String agency;
		private double balance;
		private double accManutentionTax;

		public Builder(int accNumber) {
			this.accNumber = accNumber;
		}

		public Builder withOwner(String owner) {
			this.owner = owner;

			return this;
		}

		public Builder atAgency(String agency) {
			this.agency = agency;

			return this;
		}

		public Builder openingBalance(double balance) {
			this.balance = balance;

			return this;
		}

		public Builder withAccManutentionTax(double accManutentionTax) {
			this.accManutentionTax = accManutentionTax;

			return this;
		}

		public Account build() {
			Account acc = new Account();
			acc.accNumber = this.accNumber;
			acc.owner = this.owner;
			acc.agency = this.agency;
			acc.balance = this.balance;
			acc.accManutentionTax = this.accManutentionTax;

			return acc;
		}
	}

	private Account() {

	}
}
