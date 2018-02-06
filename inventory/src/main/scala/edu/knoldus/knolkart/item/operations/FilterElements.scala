package edu.knoldus.knolkart.item.operations


import edu.knoldus.knolkart.item.Item

import scala.io.StdIn._

object ImplicitObject {

  implicit class SortMap(mapToSort: Map[Int, Item]) {
    def sortByPrice: List[Item] = {
      mapToSort.values.toList.sortWith((firstItem, secondItem) => firstItem.price <= secondItem.price)
    }

    def sortByPriceHighToLow: List[Item] = {
      sortByPrice.reverse
    }

    def sortByCategory: List[Item] = {
      mapToSort.values.toList.sortWith((firstItem, secondItem) => firstItem.category <= secondItem.category)
    }

    def sortByRating: List[Item] = {
      mapToSort.values.toList.sortWith((firstItem, secondItem) => firstItem.rating >= secondItem.rating)
    }
    def sortByRatingLowToHigh: List[Item] = {
      sortByRating.reverse
    }
  }

}


case class FilterElements(mapToFilter: Map[Int, Item]) {

  import ImplicitObject._

  def filterElements: Map[Int, Item] = {
    if (mapToFilter.isEmpty) {
      mapToFilter
    } else {
      displaySortedElements(mapToFilter.sortByPrice)
      val choice = readInt()
      if (choice == 1) {
        val choice = readInt()
        if (choice == 1) {
          displaySortedElements(mapToFilter.sortByPriceHighToLow)
        }
        choice match {
          case 1 => displaySortedElements(mapToFilter.sortByPriceHighToLow)
          case 2 => displaySortedElements(mapToFilter.sortByCategory)
        }
      }
      mapToFilter
    }
  }

  private def displaySortedElements(listToDisplay: List[Item]): Unit = {
   // listToDisplay.map(item => logger.info(s"\n${item.name}\t${item.description}\t${item.category}\t${item.price}\n"))
  }
}

