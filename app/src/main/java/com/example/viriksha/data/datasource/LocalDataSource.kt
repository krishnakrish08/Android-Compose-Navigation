package com.example.viriksha.data.datasource

import com.example.viriksha.domain.model.CategoriesModel
import com.example.viriksha.domain.model.NewsModel

val newsCategories = listOf(
    CategoriesModel(1, "India"),
    CategoriesModel(2, "World"),
    CategoriesModel(3, "Business"),
    CategoriesModel(4, "Tech"),
    CategoriesModel(5, "Sports"),
    CategoriesModel(6, "Entertainment"),
    CategoriesModel(7, "Auto"),
    CategoriesModel(8, "TV"),
    CategoriesModel(9, "WebSeries"),
    CategoriesModel(10, "Life & Style"),
    CategoriesModel(11, "Education"),
    CategoriesModel(12, "Jobs"),
    CategoriesModel(13, "Podcasts"),
    CategoriesModel(14, "Photos"),
    CategoriesModel(15, "Videos")
)

val news = listOf(
    NewsModel(
        "State govt. revises TDR guidelines, aims to revitalise stalled infrastructure projects",
        "In a significant policy shift, the Karnataka government has updated its guidelines for evaluating compensation under the Transferable Development Rights (TDR) scheme. This change is expected to rejuvenate numerous stalled infrastructure projects across the city, directly benefiting several property owners who had previously opposed the acquisition of their properties under the old TDR policy."
    ),
    NewsModel(
        heading = "Bengaluru | FoB between Krishnarajapuram railway station and K.R. Pura metro station facing three-month delay",
        description = "Members of the Mahadevapura Task Force-Mobility said the casting of the second-level beam for the FOB at K.R. Pura metro station is complete, but the project is currently delayed by approximately three months. \n"
    ),
    NewsModel(
        heading = "Delay in work on new parking complex leads to traffic chaos on Gandhi Bazaar main road",
        description = "\n" +
                "Parking on either side of the narrow Gandhi Bazaar main road in Bengaluru is further adding to the chaos, causing traffic snarls every day. Commuters and shoppers have to wait longer for relief from this everyday ordeal as the multi-level car parking (MLCP) being built in place of the old Gandhi Bazaar market is expected to be completed only by this year-end, if not later."
    )
)