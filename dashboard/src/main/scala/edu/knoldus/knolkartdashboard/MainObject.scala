package edu.knoldus.knolkartdashboard

import edu.knoldus.knolkart.item.Item

object MainObject {
  def main(args: Array[String]): Unit = {
    val dashboardKnolkart = DashboardKnolkart
  }
}

object SampleData {
  val item1 = Item("iPhone 6", 12340.45, "64GB 13MP", "Apple", "Smart Phone", 12, 5)
  val item2 = Item("Levis Jeans", 1800, "Cotton Denim", "Levi's", "Mens wear", 10, 4.7)
  val item3 = Item("G-Shock", 2599, "Golden Water Resistance", "Casio", "Wrist Watch", 6, 4.3)
  val item4 = Item("Nivea Fresh Active", 189, "48hrs Fragrence", "Nivea", "Deodorant", 100, 3.2)
  val item5 = Item("Dell Vostro", 45000, "1TB 8GB Ubuntu", "Dell", "Laptop", 6, 4)
  val item6 = Item("Philips juicer and Grinder",17999, "2 jars 500 watt motor", "Philips", "Juicer and Grinders", 4, 3)
}