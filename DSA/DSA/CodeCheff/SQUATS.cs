using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class SQUATS
    {
        public static void squarts()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                int v = Convert.ToInt32(Console.ReadLine());
                int f = v * 15;
                Console.WriteLine(f);
                t--;
            }
        }
    }
}
