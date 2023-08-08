package br.com.kotlinlearning.datasource.mock

import org.springframework.stereotype.Repository

import br.com.kotlinlearning.datasource.BankDataSource
import br.com.kotlinlearning.model.Bank

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 7),
        Bank("6661", 4.57, 0),
        Bank("9892", 0.0, 9),
        Bank("4554", 0.1, 12),
    )
    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber } ?:
        throw NoSuchElementException("Could not find a bank with account number $accountNumber")
}