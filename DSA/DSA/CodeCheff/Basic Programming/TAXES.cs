using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class TAXES
    {
        public static void t()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                int x = Convert.ToInt32(Console.ReadLine());
                if(x > 100)
                {
                    int f = x - 10;
                    Console.WriteLine(f);
                }
                else
                {
                    Console.WriteLine(x);
                }
                t--;
            }
        }
    }
}
