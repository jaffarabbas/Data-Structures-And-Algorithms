using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.LeetCode
{
    internal class ReverseInteger
    {
        public int Reverse(int x)
        {
            int result = 0;

            while (x != 0)
            {
                int digit = x % 10;
                x /= 10;

                // Check for overflow before updating the result
                if (result > int.MaxValue / 10 || (result == int.MaxValue / 10 && digit > 7))
                    return 0;
                if (result < int.MinValue / 10 || (result == int.MinValue / 10 && digit < -8))
                    return 0;

                result = result * 10 + digit;
            }

            return result;
            //if (x == 0)
            //{
            //    return 0;
            //}
            //else
            //{
            //    string v = x != 0 ? x.ToString() : "0";
            //    string f = new string(v.Reverse().ToArray());
            //    string final = "";
            //    if (f.Last().Equals('-'))
            //    {
            //        final = f.Remove(f.Length - 1);
            //        final = "-" + final;
            //    }
            //    else if (f[0].Equals('0'))
            //    {
            //        final = f.Remove(0, 1);
            //    }
            //    else
            //    {
            //        final += f;
            //    }
            //    return Convert.ToInt32(final);
        }
    }
}
