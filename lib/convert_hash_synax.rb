def convert_hash_synax(old_synax)
    old_synax.gsub(/:(\w+) *=> */,"\1: ")
end
