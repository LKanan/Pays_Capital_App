package com.example.infopays.data

import com.example.infopays.R
import com.example.infopays.model.Country

class DataSource {
    fun loadCountries(): List<Country> {
        return listOf<Country>(
            Country(
                R.drawable.flag_democratic_republic_congo,
                R.string.countryName1,
                R.string.countryCapital1,
                R.string.countryCode1,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_burundi,
                R.string.countryName2,
                R.string.countryCapital2,
                R.string.countryCode2,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_egypt,
                R.string.countryName3,
                R.string.countryCapital3,
                R.string.countryCode3,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_ethiopia,
                R.string.countryName4,
                R.string.countryCapital4,
                R.string.countryCode4,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_ghana,
                R.string.countryName5,
                R.string.countryCapital5,
                R.string.countryCode5,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_kenya,
                R.string.countryName6,
                R.string.countryCapital6,
                R.string.countryCode6,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_somali,
                R.string.countryName7,
                R.string.countryCapital7,
                R.string.countryCode7,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_tanzania,
                R.string.countryName8,
                R.string.countryCapital8,
                R.string.countryCode8,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_tunisia,
                R.string.countryName9,
                R.string.countryCapital9,
                R.string.countryCode9,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_uganda,
                R.string.countryName10,
                R.string.countryCapital10,
                R.string.countryCode10,
                R.string.countryDescription1
            ),
            Country(
                R.drawable.flag_zimbabwe,
                R.string.countryName11,
                R.string.countryCapital11,
                R.string.countryCode11,
                R.string.countryDescription1
            )
        )
    }
}