using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff.Basic_Programming
{
    internal class DOREWARD
    {
        public static void func()
        {
            int a = int.Parse(Console.ReadLine());
            while (a > 0)
            {

                int x = int.Parse(Console.ReadLine());

                if (x <= 3)
                {
                    Console.WriteLine("BRONZE");
                }
                else if(x > 3 && x <= 6)
                {
                    Console.WriteLine("SILVER");
                }else if(x > 6)
                {
                    Console.WriteLine("GOLD");
                }
                a--;
            }
        }
    }
}
