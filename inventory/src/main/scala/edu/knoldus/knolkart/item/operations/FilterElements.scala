package edu.knoldus.knolkart.item.operations


import edu.knoldus.knolkart.item.Item


case class FilterElements(mapToFilter: Map[Int, Item]) {

  def sortByPrice: List[Item] = {
    mapToFilter.values.toList.sortWith((firstItem, secondItem) => firstItem.price <= secondItem.price)
  }

  def sortByPriceHighToLow: List[Item] = {
    sortByPrice.reverse
  }


  def sortByRating: List[Item] = {
    mapToFilter.values.toList.sortWith((firstItem, secondItem) => firstItem.rating >= secondItem.rating)
  }

  def sortByRatingLowToHigh: List[Item] = {
    sortByRating.reverse
  }
}

