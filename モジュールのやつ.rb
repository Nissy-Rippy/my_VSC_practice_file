class Product
    def title
        log "title is called"
        "A great movie"
    end
    
        private
        
    def log(text)
        puts "[LOG]#{text}"
    end
        
end

class User
    def name
        log "name is called"
        "Alice"
    end
    
    private
    
    def log(text)
        puts "[LOG]#{text}"
    end
end


users = User.new
p users.name

products = Product.new
p products.title


module Loggable
    def log(text)
        puts "[LOG]#{text}"
    end
end

class Product
    include Loggable
    
    def title
        log "title is called"
        "TOYODA DENKI"
    end
    
end

gorio = Product.new

p gorio.title
module Loggable
    def log(text)
        puts "[LOG]#{text}"
    end
end

class Product
    include Loggable
    
    def title
        log "title is called"
        "TOYODA DENKI"
    end
    
end

gorio = Product.new

p gorio.title

module Loggable
    private
    
    def log(text)
        puts "[LOG]#{text}"
    end
end

class Tt
    include Loggable
        def names
        
        log "my family is TOYODA"
               "thank you!!"
        end
end
       
    name = Tt.new
    p name.names

    class Tempo
        include Comparable
        
        attr_reader :bpm
        
        def initialize(bpm)
            @bpm = bpm
        end
        
        def <=>(other)
            if other.is_a?(Tempo)
                bpm<=>other.bpm
            else
                nil
            end
        end
        
        def inspect
            "#{bpm}bpm"
        end
    end

    class Second
        def initialize(player,uniform_number)
             @player = player
             @uniform_number = uniform_number
         end
     end
     
     module Clock
         class Second
             def initialize(digits)
                 @digits = digits
                 @baseball_ = ::Second.new("clock",14)
                
             end
         end
     end
    p
    pro = Clock::Second.new(12)
    module Loggable
        def self.log(text)
            puts "[LOG]#{text}"
        end
    end
    
    Loggable.log("hello")
    
    module Loggable
        class << self
            def log(text)
                puts "[gori]#{text}"
            end
            def name
                log "ゴリラに会いたいな"
            end
        end
    end
    Loggable.name

    module Loggabale
        def log(text)
            puts "[LOG]#{text}"
        end
        module_function :log
    end
    
    Loggabale.log("hello")
    class Product
        include Loggabale
        def title
            log "title is called"
            "alice is glld girl"
        end
    end
    
    producdt = Product.new
    
    p producdt.title

    p Math.sqrt(2)

class Calculater
    include Math
    def calc_sqrt(n)
        sqrt(n)
    end
end

calculator = Calculater.new

p calculator.calc_sqrt(4)

p Math::E
p Math::PI

p Kernel.puts"hello"
p Kernel.p [1,2,3,4,5]

module AwesomeApi
    @base_url = ""
    @debug_mode = false
    
    class << self
        def base_url=(value)
            @base_url = value
        end
        
        def base_url
            @base_url
        end
        
        def debug_mode =(value)
            @debug_mode = value
        end
        
        def debug_mode
            @debug_mode
        end
    end
end
AwesomeApi.base_url = "http://example.com"
AwesomeApi.debug_mode = true

p AwesomeApi.base_url
p AwesomeApi.debug_mode

retry_count = 0
begin
    puts "処理を開始します"
    1/0
rescue
    retry_count += 1
    if retry_count <= 3
        puts "retryします.(#{retry_count}回目)"
        retry
    else
        puts "retryに失敗しました。"
    end
end


def currency_of(country)
    case country
    when :japan
        "yen"
    when:us
        "dollar"
    when :india
        "rupee"
    else
        raise ArgumentError,"これは無効な国名です#{country}"
    end
end
 
puts currency_of(:italy)


users.each do |user|
    begin
        send_mail_to(user)
    rescue => e
        puts "#{e.class} #{e.message}"
        puts e.backtrace
    end
end



require "date"

def convert_heisei_to_date(heisei_text)
    begin
        m = heisei_text.match(/平成(?<jp_year>\d+)年(?<month>\d+)月(?<day>\d+)日/)
        year =  m[:jp_year].to_i + 1988
        month = m[:month].to_i
        day =   m[:day].to_i
        Date.new(year,month,day)
    rescue
        nil
    end
end


require "date"
def convert_heisei_to_date(heisei_text)
        m = heisei_text.match(/平成(?<jp_year>\d+)年(?<month>\d+)月(?<day>\d+)日/)
        year = m[:jp_year].to_i + 1988
        month = m[:month].to_i
        day = m[:day].to_i
    begin
    Date.new(year,month,day)
    rescue ArgumentError
        nil
    end
end

p convert_heisei_to_date("平成28年12月31日")
p convert_heisei_to_date("平成28年99月31日")

require "date"

def convert_heisei_to_date(heisei_text)
    m = heisei_text.match(/平成(?<jp_year>\d+)年(?<month>\d+)月(?<day>\d+)日/)
    year = m[:jp_year].to_i + 1988
    month = m[:month].to_i
    day = m[:day].to_i
    
    if Date.valid_date?(year,month,day)
       Date.new(year,month,day)
    end
end

p convert_heisei_to_date("平成12年4月23日")   

file = File.open("some.txt","w")
begin file << "Hello"
ensure
    file.close
end

File.open("some.txt","w") do |file|
    file << "Hello"
    1/0
end

ret =
begin
    "OK"
rescue
    "error"
ensure
    "ensure"
end
p ret

ret = 
begin
    1/0
    "OK"
rescue
    "error"
ensure 
    "ensure"
end
p ret


def some_method(n)
    begin
        1/n
        "OK"
    rescue
        "error"
    ensure
        "ensure"
    end
end
p some_method(1)
p 
some_method(0)


begin
    1/0
rescue => e
    puts "#{e.class} #{e.message}"
    puts e.backtrace
end

begin
    1/0
rescue
    puts "#{$!.class} #{$!.message}"
    puts $@
end

def some_method
    1/0
rescue => e
    puts "#{e.class} #{e.mesage}"
    puts e.backtrace
end

begin
    some_method
rescue => e
    puts "エラーが発生しました;　#{e.class} #{e.message}"
    original = e.cause
    unless original.nil?
        puts "元の例外:#{original.class} #{original.message}"
        puts original.backtrace
    end
end


def fizz_buzz(n)
    if n % 15 == 0
    "Fizz Buzz"
    elsif n % 3 == 0
        "Fizz"
    elsif n % 5 == 0
        "Buzz"
    else n.to_s
    end
rescue => e
    puts "[LOG]エラーが発生しました:#{e.class} #{e.message}"
    raise
end

p fizz_buzz(nil)

class NoCountryError < StandardError
end
def currency_of(country)
    case country
    when :japan
        "yen"
    when :us
        "dollar"
    when :india
        "rupee"
    else
        raise NoCountryError,"無効な国名です#{country}"
    end
end
p currency_of(:Brazil)