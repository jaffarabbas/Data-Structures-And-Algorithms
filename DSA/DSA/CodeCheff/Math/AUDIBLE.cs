using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Math
{
    internal class AUDIBLE
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {
                
                int x = int.Parse(Console.ReadLine());
             
                if (x >= 67 && x <= 45000)
                {
                    Console.WriteLine("YES");
                }
                else
                {
                    Console.WriteLine("NO");
                }
                a--;
            }
        }
    }
}
