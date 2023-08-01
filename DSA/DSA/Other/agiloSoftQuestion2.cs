using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DSA.Other
{
    internal class agiloSoftQuestion2
    {
        public static int numRound(int a)
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

        public static int LastIntegerValue(int a)
        {
            return a % 10;
        }


        public static int numRoundFor2and7(int a, bool flag)
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
        public static int[] round(int[] arr)
        {
            int pl = LastIntegerValue(arr[arr.Length - 1]);
            int pr = 0;
            if (pl == 2 || pl == 7)
            {
                pr = numRoundFor2and7(pl,true);
                arr[0] = arr[0] - pr;
            }
            for (int i = 1; i < arr.Length; i++)
            {
                int v = LastIntegerValue(arr[i]);
                int l = LastIntegerValue(arr[i-1]);
                int r = numRound(v);
                if(v == 3 || v == 4 || v == 8 || v == 9)
                {
                    arr[i] = arr[i] + r; 
                }else if(v == 1 || v == 6)
                {
                    arr[i] = arr[i] - r;
                }else if(v == 2 || v == 7)
                {
                    int t = 0;
                    if (l == 2 || l == 7)
                    {
                        t = numRoundFor2and7(v, true);
                        arr[i] = arr[i] - t;
                    }
                    else
                    {
                        t = numRoundFor2and7(v, false);
                        arr[i] = arr[i] + t;
                    }
                }
            }
            return arr;
        }
    }
}
