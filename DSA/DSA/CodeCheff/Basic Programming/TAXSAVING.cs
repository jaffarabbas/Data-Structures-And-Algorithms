using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class TAXSAVING
    {
        public static void tax()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                string[] v = Console.ReadLine().Split(' ');
                int y = Convert.ToInt32(v[0]);
                int x = Convert.ToInt32(v[1]);
                int f = y - x;
                Console.WriteLine(f);
                t--;
            }
        }
    }
}
