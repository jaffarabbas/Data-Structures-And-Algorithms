using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class AGELIMIT
    {
        public static void age()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                string[] v = Console.ReadLine().Split(' ');
                int a, x, y;
                x = Convert.ToInt32(v[0]);
                y = Convert.ToInt32(v[1]);
                a = Convert.ToInt32(v[2]);
                if(a >= x && a < y)
                {
                    Console.WriteLine("YES");
                }
                else
                {
                    Console.WriteLine("NO");
                }
                t--;
            }
        }
    }
}
