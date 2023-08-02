using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class FIT
    {
        public static void f()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                int x = Convert.ToInt32(Console.ReadLine());
                int totalKm = x * 2;
                int f = totalKm * 5;
                Console.WriteLine(f);
                t--;
            }
        }
    }
}
