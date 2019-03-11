package  com.stackroute;
public class OnesComplement {
    int onesComplement(int n)
    {

        // Find number of bits in the
        // given integer
        /*your code here*/

        // XOR the given integer with poe(2,
        // number_of_bits-1 and print the result
        return ((1 << number_of_bits) - 1) ^ n;
    }
}
