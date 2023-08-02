using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class BIRYANI
    {
        public static void ques()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                string[] lines = Console.ReadLine().Split(' ');
                int x = Convert.ToInt32(lines[0]);
                int y = Convert.ToInt32(lines[1]);
                int f = x * y;
                Console.WriteLine(f);
                t--;
            }
        }
    }
}
