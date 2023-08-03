using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class MY1STCONTEST
    {
        public static void func()
        {
            string[] lines = Console.ReadLine().Split(' ');
            int n = int.Parse(lines[0]);
            int a = int.Parse(lines[1]);
            int b = int.Parse(lines[2]);
            int f = n - a;
            int f2 = f - b;
            Console.WriteLine(f+" "+f2);
        }
    }
}
