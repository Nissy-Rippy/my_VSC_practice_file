require "csv"

class Item
    attr_reader :name,:price
    def initialize(name:,price:)
        @name = name
        @price = price
    end

    def self.import(path:)
        CSV.read(path,headers: true).map do |row|
            Item.new(
                name: row["name"],
                price: row["price"].to_i
            )
        end

    end
end
CSV.open("./nn/items.csv","w") do |csv|
    csv << ["name","email","age"]
    csv << ["alice","@.dotcom",13]
end

CSV.foreach("./lib/sample.tsv",col_sep: "\t") do |row|
    puts "#{row[0]}#{row[1]}#{row[2]}"
end
 