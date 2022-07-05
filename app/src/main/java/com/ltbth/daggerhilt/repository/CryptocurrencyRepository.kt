package com.ltbth.daggerhilt.repository

import com.ltbth.daggerhilt.model.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}