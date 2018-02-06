package edu.knoldus.test.itemservice

import edu.knoldus.knolkart.item.Item
import edu.knoldus.knolkart.item.operations.FilterElements
import org.scalatest.FunSuite

class ItemServiceTest extends FunSuite {

  val item1 = Item("iPhone 6", 12340.45, "64GB 13MP", "Apple", "Smart Phone", 12, 5)
  val item2 = Item("Levis Jeans", 1800, "Cotton Denim", "Levi's", "Mens wear", 10, 4)
  val item3 = Item("G-Shock", 2599, "Golden Water Resistance", "Casio", "Wrist Watch", 6, 5)
  val item4 = Item("Nivea Fresh Active", 189, "48hrs Fragrence", "Nivea", "Deodorant", 100, 3)
  val item5 = Item("Dell Vostro", 45000, "1TB 8GB Ubuntu", "Dell", "Laptop", 6, 5)
  val item6 = Item("Philips juicer and Grinder",17999, "2 jars 500 watt motor", "Philips", "Juicer and Grinders", 4, 2)

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


}
