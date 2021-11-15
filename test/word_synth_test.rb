require "minitest/autorun"
require "./lib/word_synth"
require "./lib/effects"

class WordSynthTest < Minitest::Test
    def test_play_without_effects
        synth = WordSynth.new
        assert_equal "Ruby is fun!",synth.play("Ruby is fun!")
    end

    def test_play_with_many_effects
        require "byebug" ; byebug
        synth = WordSynth.new
        synth.add_effect(Effects.echo(3))
        synth.add_effect(Effects.loud(3))
        synth.add_effect(Effects.reverse)
        assert_equal "!!!YYYBBBUUURRR !!!SSSIII !!!!!!NNNUUUFFF",synth.play("Ruby is fun!")
    end
end