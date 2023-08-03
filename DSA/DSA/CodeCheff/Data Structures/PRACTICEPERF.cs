using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.CodeCheff
{
    internal class PRACTICEPERF
    {
        public static void p()
        {
            string[] lines = Console.ReadLine().Split(' ');
            int[] arr = new int[lines.Length];
            int count = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = int.Parse(lines[i]);
            }
            foreach (int i in arr)
            {
                if(i >= 10)
                {
                    count++;
                }
            }
            Console.WriteLine(count);
        }
    }
}
