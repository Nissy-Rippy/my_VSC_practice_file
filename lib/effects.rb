module Effects
    def self.reverse
             ->(words) do
            words.split(" ").map(&:reverse).join(" ")
        end
    end
    def self.echo(rate)
        ->(words) do
            words.chars.map{|c| c == " "? c : c * rate}.join
        end
    end
 
    def self.loud(level)
        ->(words) do
            words.split(" ").map {|word| word.upcase + "!" * level}.join(" ")
        end
    end
end

class WordSynth
    def initialize
        @effects = []
    end
    
    def add_effect(effect)
        @effects << effect
    end

    def play(original_words)
        @effects.inject(original_words) do |words,synth|
          synth.call(words)
        end
    end 

end
