using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class WATERCONS
    {
        public static void water()
        {
            int t = Convert.ToInt32(Console.ReadLine());
            while (t > 0)
            {
                int y = Convert.ToInt32(Console.ReadLine());
                if(y >= 2000)
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
