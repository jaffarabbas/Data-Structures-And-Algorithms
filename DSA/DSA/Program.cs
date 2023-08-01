using DSA.CodeCheff;
using DSA.Other;
using System;

namespace DSA // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        
        public static void Main()
        {
            //Console.WriteLine(numRoundtoFive.numRoundFor2and7(LastInteger.LastIntegerValue(102),true));
            int[] arr = { 102, 102, 102, 102 };
            foreach (int i in agiloSoftQuestion2.round(arr))
            {
                Console.WriteLine(i);
            }
        }

    }
}