using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class CBSPEED
    {
        public static void func()
        {
            string[] lines = Console.ReadLine().Split(' ');
            int x = int.Parse(lines[0]);
            int y = int.Parse(lines[1]);
            if (y > x)
            {
                Console.WriteLine("YES");
            }
            else
            {
                Console.WriteLine("NO");
            }
        }
    }
}
