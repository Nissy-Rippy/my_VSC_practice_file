require "minitest/autorun"
require "./lib/test"
require "./lib/bank"

class DeepFreezableTest < Minitest::Test

    def test_deep_freeze_to_array
        assert_equal ["Japan","US","India"], Bank::CONTRIES
        assert Bank::CONTRIES.frozen?
        assert Bank::CONTRIES.all? {|contry| contry.frozen?}

    end

    def test_deep_freeze_to_hash
        assert_equal({"Japan" => "yen","US" => "dollar","India" => "rupee"},Test::CONTRIESS)
        assert Test::CONTRIESS.frozen?
        assert Test::CONTRIESS.all? { |key, value| key.frozen? && value.frozen?}
    end
end
