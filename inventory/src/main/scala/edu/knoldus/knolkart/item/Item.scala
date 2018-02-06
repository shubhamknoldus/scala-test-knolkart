package edu.knoldus.knolkart.item

import edu.master.MasterDataEntities

case class Item(
                 name: String,
                 price: Double,
                 description: String,
                 vendor: String,
                 category: String,
                 count: Int,
                 rating: Int) extends MasterDataEntities
