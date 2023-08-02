using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class FLOW001
    {
        public static void add()
        {
            int T = int.Parse(Console.ReadLine());
            for (int i = 0; i < T; i++)
            {
                string[] lines = Console.ReadLine().Split(' ');
                Console.WriteLine(int.Parse(lines[0]) + int.Parse(lines[1]));
            }
        }
    }
}
