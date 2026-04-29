function savage()
    a=1
    for i in 1:2499
        a = tan(atan(exp(log(sqrt(a*a))))) + 1
    end
    return a
end

using BenchmarkTools
@btime savage()

