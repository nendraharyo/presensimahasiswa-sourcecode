package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class l
{
  private static final NumberFormat a = ;
  
  private static double a(double paramDouble)
  {
    double d1 = 5.0D;
    double d2 = 2.0D;
    double d3 = 10.0D;
    int i = (int)Math.floor(Math.log10(paramDouble));
    int j = -i;
    double d4 = j;
    d4 = Math.pow(d3, d4) * paramDouble;
    boolean bool1 = d4 < d1;
    if (bool1) {
      d1 = d3;
    }
    for (;;)
    {
      d2 = i;
      d3 = Math.pow(d3, d2);
      return d1 * d3;
      bool1 = d4 < d2;
      if (!bool1)
      {
        d1 = 1.0D;
        boolean bool2 = d4 < d1;
        if (bool2) {
          d1 = d2;
        } else {
          d1 = d4;
        }
      }
    }
  }
  
  public static List a(double paramDouble1, double paramDouble2, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramInt <= 0) {}
    for (Object localObject1 = localArrayList;; localObject1 = localArrayList)
    {
      return (List)localObject1;
      localObject1 = a;
      int i = 5;
      ((NumberFormat)localObject1).setMaximumFractionDigits(i);
      double[] arrayOfDouble = b(paramDouble1, paramDouble2, paramInt);
      double d1 = arrayOfDouble[1];
      double d2 = arrayOfDouble[0];
      d1 -= d2;
      d2 = arrayOfDouble[2];
      d1 /= d2;
      int j = (int)d1 + 1;
      int k = 0;
      localObject1 = null;
      for (int m = 0; m < j; m = k)
      {
        k = 0;
        localObject1 = null;
        d1 = arrayOfDouble[0];
        d2 = m;
        int n = 2;
        double d3 = arrayOfDouble[n];
        d2 *= d3;
        d1 += d2;
        try
        {
          Object localObject2 = a;
          Object localObject3 = a;
          localObject3 = ((NumberFormat)localObject3).format(d1);
          localObject2 = ((NumberFormat)localObject2).parse((String)localObject3);
          d1 = ((Number)localObject2).doubleValue();
        }
        catch (ParseException localParseException)
        {
          for (;;) {}
        }
        localObject1 = Double.valueOf(d1);
        localArrayList.add(localObject1);
        k = m + 1;
      }
    }
  }
  
  private static double[] b(double paramDouble1, double paramDouble2, int paramInt)
  {
    double d1 = Math.abs(paramDouble1 - paramDouble2);
    double d2 = 1.0000000116860974E-7D;
    boolean bool1 = d1 < d2;
    if (bool1)
    {
      i = 3;
      arrayOfDouble = new double[i];
      arrayOfDouble[0] = paramDouble1;
      arrayOfDouble[1] = paramDouble1;
      int j = 2;
      d2 = 0.0D;
      arrayOfDouble[j] = d2;
      return arrayOfDouble;
    }
    int i = 0;
    double[] arrayOfDouble = null;
    boolean bool2 = paramDouble1 < paramDouble2;
    if (bool2) {
      i = 1;
    }
    for (;;)
    {
      d2 = Math.abs(paramDouble2 - paramDouble1);
      double d3 = paramInt;
      d2 = a(d2 / d3);
      d3 = Math.ceil(paramDouble2 / d2) * d2;
      double d4 = Math.floor(paramDouble1 / d2) * d2;
      if (i != 0)
      {
        i = 3;
        arrayOfDouble = new double[i];
        arrayOfDouble[0] = d4;
        arrayOfDouble[1] = d3;
        k = 2;
        d3 = -1.0D;
        d2 *= d3;
        arrayOfDouble[k] = d2;
        break;
      }
      i = 3;
      arrayOfDouble = new double[i];
      arrayOfDouble[0] = d3;
      arrayOfDouble[1] = d4;
      int k = 2;
      arrayOfDouble[k] = d2;
      break;
      double d5 = paramDouble2;
      paramDouble2 = paramDouble1;
      paramDouble1 = d5;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */