using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class GDTURN
    {
        public static void isGood()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                string[] v = Console.ReadLine().Split(" ");
                int a = Convert.ToInt32(v[0]);
                int b = Convert.ToInt32(v[1]);

                if((a + b) > 6)
                {
                    Console.WriteLine("YES");
                }
                else
                {
                    Console.WriteLine("NO");
                }
                t--;
            }
        }
    }
}
