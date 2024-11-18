//Your task is to implement a simplified version of a banking system. All operations that should be supported are listed below.
//
//Solving this task consists of several levels. Subsequent levels are opened when the current level is correctly solved. You always have access to the data for the current and all previous levels.
//
//Requirements
//Your task is to implement a simplified version of a banking system. Plan your design according to the level specifications below:
//
//Level 1: The banking system should support creating new accounts and depositing money into and withdrawing/paying money from accounts.
//Level 2: The banking system should support ranking accounts based on the total value of transactions.
//Level 3: The banking system should support scheduling transfers and checking the scheduled transfer status.
//        Level 4: The banking system should support merging two accounts while retaining the balances and transaction histories of the original accounts.
//To move to the next level, you should pass all the tests at the current level.
//
//Note
//
//You will receive a list of queries to the system, and the final output should be an array of strings representing the returned values of all queries. Each query will only call one operation.
//
//All queries will have a timestamp parameter — a stringified timestamp in milliseconds. It is guaranteed that all timestamps are unique and are in a range from 1 to 109. Queries will be given in the order of strictly increasing timestamps.

//Level 1
//The banking system should support creating new accounts and depositing money into and withdrawing/paying money from accounts.
//
//CREATE_ACCOUNT <timestamp> <accountId> — should create a new account with the given accountId if it doesn't already exist. Returns "true" if the account was successfully created or "false" if an account with accountId already exists.
//
//DEPOSIT <timestamp> <accountId> <amount> — should deposit the given amount of money to the specified account accountId. Returns a string representing the total amount of money in the account (balance) after processing the query. If the specified account does not exist, should return an empty string.
//
//        PAY <timestamp> <accountId> <amount> — should withdraw the given amount of money from the specified account. Returns a string representing the amount of money in the account (balance) after processing the query. If the specified account does not exist, or if the account has insufficient funds to perform the withdrawal, should return an empty string.
//
//        Examples
//The example below shows how these operations should work (the section is scrollable to the right):
//
//Queries	Explanations
//queries = [
//        ["CREATE_ACCOUNT", "1", "account1"],
//        ["CREATE_ACCOUNT", "2", "account1"],
//        ["CREATE_ACCOUNT", "3", "account2"],
//        ["DEPOSIT", "4", "non-existing", "2700"],
//        ["DEPOSIT", "5", "account1", "2700"],
//        ["PAY", "6", "non-existing", "2700"],
//        ["PAY", "7", "account1", "2701"],
//        ["PAY", "8", "account1", "200"]
//        ]
//
//returns "true"
//returns "false"; an account with this identifier already exists
//returns "true"
//returns ""; an account with this identifier does not exist
//returns "2700"
//returns ""; an account with this identifier does not exist
//returns ""; this account has insufficient funds
//returns "2500"
//
//the output should be ["true", "false", "true", "", "2700", "", "", "2500"].
//
//Input/Output
//
//[execution time limit] 3 seconds (java)


package com.brainstrom.interview;

public class EgenTest {
}
