using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class TOP10
    {
        public static void top()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {  
                int x = Convert.ToInt32(Console.ReadLine());
                if (x <= 10)
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
