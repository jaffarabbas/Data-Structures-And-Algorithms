using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.Other
{
    sealed class IsSemmetric
    {
        public static bool isSummettic()
        {
            int[][] mar = { new[] { 1, 0, 0 }, new[] { 0, 1, 0 }, new[] { 0, 0, 1 } };
            for (int i = 0; i < mar.Length; i++)
            {
                for (int j = i + 1; j < mar[i].Length; j++)
                {
                    Console.WriteLine(" i : " + i + " j : " + j);
                    if (mar[i][j] != mar[j][i])
                    {
                        Console.WriteLine(mar[i][j] + " i : " + i + " j : " + j);
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
