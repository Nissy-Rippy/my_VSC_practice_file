require "./lib/deep_freezable"

class Test
    extend DeepFreezable

    CONTRIESS = deep_freeze({"Japan" => "yen","US" => "dollar","India" => "rupee"})
end
　