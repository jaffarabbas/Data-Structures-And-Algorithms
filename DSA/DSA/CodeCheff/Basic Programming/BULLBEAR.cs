using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class BULLBEAR
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int x = int.Parse(lines[0]);
                int y = int.Parse(lines[1]);
                if(y > x)
                {
                    Console.WriteLine("PROFIT");
                }else if(y == x)
                {
                    Console.WriteLine("NEUTRAL");
                }
                else
                {
                    Console.WriteLine("LOSS");
                }
                a--;
            }
        }
    }
}
