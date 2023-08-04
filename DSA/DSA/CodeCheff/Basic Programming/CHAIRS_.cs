using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class CHAIRS_
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int x = int.Parse(lines[0]);
                int y = int.Parse(lines[1]);
                int f = x - y;
                if(f < 0)
                {
                    Console.WriteLine(0);
                }
                else
                {
                    Console.WriteLine(f);
                }
                a--;
            }
        }
    }
}
