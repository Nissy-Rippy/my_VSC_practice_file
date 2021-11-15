def title
    puts "-------------------------------------------"
    puts "これは計算アプリです（＊小数点以下は切り捨て）"
    puts "1,足し算　2,引き算　3,割り算　4,掛け算　5,終了"
    puts "1~5を選んでください(1,2,3,4,5)"
    puts "-------------------------------------------"
end

title

while X == 1 || X ==2 || X ==3|| 
print "モード :　"
X = gets.chomp

if X == "1"
　　puts "✩✩足し算が入力されました✩✩"
　　puts "数値を二つ入力してください"
　　print "1つ目 :　"
　　a == gets.chomp
    print "2つ目 : "
    b == gets.chomp
    result =a.to_i + b.to_i
elsif X == "2"
    puts "✩✩引き算が入力されました✩✩"
    　puts "数値を二つ入力してください"
　　print "1つ目 :　"
　　a == gets.chomp
    print "2つ目 : "
    b == gets.chomp
    result =a.to_i + b.to_i
elsif X == "3"
　　puts "✩✩掛け算が入力されました✩✩"
　　puts "数値を二つ入力してください"
　　print "1つ目 :　"
　　a == gets.chomp
    print "2つ目 : "
    b == gets.chomp
    result =a.to_i * b.to_i
elsif X == "4"
    　　puts "✩✩割り算が入力されました✩✩"
    　　puts "数値を二つ入力してください"
    　　print "1つ目 :　"
    　　a == gets.chomp
        print "2つ目 : "
        b == gets.chomp
        result =a.to_i / b.to_i
end
puts "結果:#{result}"
end