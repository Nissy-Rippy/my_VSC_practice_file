require_relative "shop"
require_relative "item"
require_relative "user"
require_relative "string"
require "pry"
SHOP_NAME = "ラーメン屋　りゅうたろう"
MONEY = 3200

items = Item.import(path: "items.csv")
shop = Shop.new(name: SHOP_NAME,items: items)
user = User.new(money: MONEY)

shop.display
user.choice(shop.items)
shop.sell(user,item)