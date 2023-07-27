using DSA.CodeCheff;
using System;

namespace DSA // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        public static void Main()
        {
            int n = Convert.ToInt32 (Console.ReadLine());
            string v = n!=0 ? n.ToString() : new string("0");
            string f = new string(v.Reverse().ToArray());
            string final = "";
            if(f.Last().Equals('-'))
            {
                final = f.Remove(f.Length-1);
                final = "-"+final;
            }else if (f[0].Equals('0'))
            {
                final = f.Remove(0,1);
            }
            else
            {
                final = f;
            }
            Console.WriteLine(final);
        }

    }
}