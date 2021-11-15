require "minitest/autorun"
require "./lib/convert_hash_synax"

class ConvertHashSynaxTest < Minitest::Test
    def test_convert_hash_synax
        old_synax = <<~TEXT
        {
        :name => "Alice",
        :age => 20,
        :gender => :female
        }
        TEXT
        expected = <<~TEXT
        {
        name: "Alice,
        age: 20,
        gender: :female
        }
        TEXT
        assert_equal expected,convert_hash_synax(old_synax)
    end
end