using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.Other
{
    internal class Fraction
    {
        public static string FindLeastFraction(string fraction)
        {
            // Split the fraction string into numerator and denominator parts
            string[] parts = fraction.Split('/');
            if (parts.Length != 2)
            {
                throw new ArgumentException("Invalid fraction format. Use 'numerator/denominator'.");
            }

            int numerator = int.Parse(parts[0]);
            int denominator = int.Parse(parts[1]);

            // Find the greatest common divisor (GCD) of numerator and denominator
            int gcd = GCD(numerator, denominator);

            // Reduce the fraction to its simplest form (lowest terms)
            int reducedNumerator = numerator / gcd;
            int reducedDenominator = denominator / gcd;
            // Return the least fraction as a string in the format "numerator/denominator"
            return reducedNumerator + "/" + reducedDenominator;
        }
        public static int GCD(int a, int b)
        {
            // Find the greatest common divisor using Euclid's algorithm
            while (b != 0)
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
