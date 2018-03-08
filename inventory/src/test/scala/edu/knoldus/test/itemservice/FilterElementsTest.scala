package edu.knoldus.test.itemservice

import edu.knoldus.knolkart.item.Item
import edu.knoldus.knolkart.item.operations.FilterElements
import org.scalatest.FunSuite

class FilterElementsTest extends FunSuite {

  val item1 = Item("iPhone 6", 12340.45, "64GB 13MP", "Apple", "Smart Phone", 12, 5)
  val item2 = Item("Levis Jeans", 1800, "Cotton Denim", "Levi's", "Mens wear", 10, 4.7)
  val item3 = Item("G-Shock", 2599, "Golden Water Resistance", "Casio", "Wrist Watch", 6, 4.3)
  val item4 = Item("Nivea Fresh Active", 189, "48hrs Fragrence", "Nivea", "Deodorant", 100, 3.2)
  val item5 = Item("Dell Vostro", 45000, "1TB 8GB Ubuntu", "Dell", "Laptop", 6, 4)
  val item6 = Item("Philips juicer and Grinder",17999, "2 jars 500 watt motor", "Philips", "Juicer and Grinders", 4, 3)

  val itemMap: Map[Int, Item] = Map(
    1 -> item1,
    2 -> item2,
    3 -> item3,
    4 -> item4,
    5 -> item5,
    6 -> item6)
  val filterObject = FilterElements(itemMap)

  val sortedListByPrice: List[Item] = List(item4, item2, item3, item1, item6, item5)
  val sortedListByPriceHighToLow: List[Item] = sortedListByPrice.reverse
  val sortedByCategory: List[Item] = List(item4, item6, item5, item2, item1, item3)
  val sortedByRating: List[Item] = List(item6, item4, item5, item3, item2, item1)
  val sortedByRatingHighToLow: List[Item] = sortedByRating.reverse

  test("It should sort the Items of the map as per the price Low to High"){
    assert(filterObject.sortByPrice == sortedListByPrice)
  }
  test("It should sort the Items of the map as per the price High to Low"){
    assert(filterObject.sortByPriceHighToLow == sortedListByPriceHighToLow)
  }
  test("It should sort according to rating default or high to low"){
    assert(filterObject.sortByRating == sortedByRatingHighToLow)
  }
  test("It should sort according to rating low to high"){
    assert(filterObject.sortByRatingLowToHigh == sortedByRating)
  }




}
