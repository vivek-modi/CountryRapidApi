package com.vivek.rapidapi

import org.junit.Assert
import org.junit.Test
import org.koin.test.KoinTest

class ExampleUnitTest : KoinTest {

    @Test
    fun `unit test`() {
        val countryApplication = CountryApplication()
        Assert.assertNotNull(countryApplication)
    }


}
