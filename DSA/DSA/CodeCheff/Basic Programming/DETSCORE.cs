using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class DETSCORE
    {
        public static void d()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int point = Convert.ToInt32(lines[0]);
                int testCases = Convert.ToInt32(lines[1]);
                int p = point / 10;
                int final = p * testCases;
                Console.WriteLine(final);
                t--;
            }
        }
    }
}
