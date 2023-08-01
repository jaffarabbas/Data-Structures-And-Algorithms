using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.Other
{
    internal class numRoundtoFive
    {
        public static int numRound(int a)
        {
            int temp = 5 - a;
            if(temp > 0)
            {
                return temp;
            }
            else
            {
                return (5 + temp);
            }
        }

        public static int numRoundFinal(int a)
        {
            if (a > 5)
            {
                return (10 - a);
            }
            else
            {
                return (5 - a);
            }
        }

        public static int numRoundFor2and7(int a,bool flag)
        {
            if (flag)
            {
                if (a > 5)
                {
                    int t = 10 - a;
                    return (5 - t);
                }
                else
                {
                    int t = 5 - a;
                    return (5 - t);
                }
            }
            else
            {
                if (a > 5)
                {
                    return (10 - a);
                }
                else
                {
                    return (5 - a);
                }
            }
        }
    }
}
