package br.com.kotlinlearning.datasource

import br.com.kotlinlearning.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}