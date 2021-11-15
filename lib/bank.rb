require "./lib/deep_freezable"

class Bank
    extend DeepFreezable

    CONTRIES = deep_freeze(["Japan","US","India"])
end