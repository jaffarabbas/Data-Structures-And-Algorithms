using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Math
{
    internal class WAITTIME
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int x = int.Parse(lines[0]);
                int y = int.Parse(lines[1]);
                int w = x * 7;
                int f = w - y;
                Console.WriteLine(f);
                a--;
            }
        }
    }
}
