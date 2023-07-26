using DSA.CodeCheff;
using System;

namespace DSA // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        public static void Main()
        {
            string fraction = "12/9";
            string leastFraction = FindLeastFraction(fraction);
            Console.WriteLine("Least Fraction: " + leastFraction);
        }

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