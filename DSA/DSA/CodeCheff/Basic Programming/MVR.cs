using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class MVR
    {
        public static void func()
        {
            string[] lines = Console.ReadLine().Split(' ');
            int x = int.Parse(lines[0]);
            int y = int.Parse(lines[1]);
            int z = int.Parse(lines[2]);
            int t = int.Parse(lines[3]);
            int m = ((x * 2) + y);
            int r = ((z * 2) + t);
            if (m == r)
            {
                Console.WriteLine("Equal");
            }else if(m > r)
            {
                Console.WriteLine("Messi");
            }
            else
            {
                Console.WriteLine("Ronaldo");
            }
        }
    }
}
