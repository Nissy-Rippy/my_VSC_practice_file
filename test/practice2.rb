require "minitest/autorun"
require "./lib/effects"
class EffectsTest < Minitest::Test
    def test_reverse
        effect = Effects.reverse
        assert_equal "ybuR si !nuf",effect.call("Ruby is fun!")
    end
    
    def test_echo
        effect = Effects.echo(2)
        assert_equal "eeffffeecctt",effect.call("effect")
        effect = Effects.echo(3)
        assert_equal "RRRuuubbbyyy",effect.call("Ruby")
    end

    def test_loud
        effect = Effects.loud(2)
        assert_equal "RUBY!! IS!! FUN!!!",effect.call("Ruby is fun!")
        effect = Effects.loud(3)
        assert_equal "RUBY!!! IS!!! FUN!!!!",effect.call("Ruby is fun!")
    end
end

# ミニテストの雛形の久々の練習
require "./lib/practice"
require "minitest/autorun"

class PracticeTest < Minites::Test
  def test_practice
    practice = Practice.new("pr")
    assert_equal = "pr", practice.name
    refute = "prooo,", practice.name
  end
end


