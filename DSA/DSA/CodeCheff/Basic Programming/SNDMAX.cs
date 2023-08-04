using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class SNDMAX
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int x = int.Parse(lines[0]);
                int y = int.Parse(lines[1]);
                int z = int.Parse(lines[2]);
                if(x > y && x < z || x > z && x < y)
                {
                    Console.WriteLine(x);
                }else if (y > x && y < z || y > z && y < x)
                {
                    Console.WriteLine(y);
                } else if (z > x && z < y || z > y && z < x)
                {
                    Console.WriteLine(z);
                }
                a--;
            }
        }
    }
}
