require_relative "string"
require_relative "item"
class Shop
    attr_reader :items
    
    def initialize(name:,items:)
        @name = name
        @items = items
    end
    
    def display
        puts "ようこそ　#{name}へ"
        puts "当店のメニューはこちらです"
        puts "*" * 30
        @items.each.with_index(1) do |item,index|
            puts "#{index.to_s.ljust(2)}. #{item.name.mb_ljust(24)}: #{item.price.rjust(4)}円"
        end
        puts "*" * 30
    end

    def sell(user,item)
        puts "#{item.name}ですね。　#{item.price} 円になります"
        puts "#{user.money}円 頂戴します"
        puts "おつりは、#{user.money - item.price}です"
        puts "ゆっくり#{item.name}をお楽しみください"
    end


end
