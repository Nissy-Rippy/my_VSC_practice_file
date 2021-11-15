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
