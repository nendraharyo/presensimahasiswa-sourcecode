package io.fabric.sdk.android.services.common;

public class ResponseParser
{
  public static final int ResponseActionDiscard = 0;
  public static final int ResponseActionRetry = 1;
  
  public static int parse(int paramInt)
  {
    int i = 0;
    int j = 1;
    int k = 200;
    if (paramInt >= k)
    {
      k = 299;
      if (paramInt > k) {}
    }
    for (;;)
    {
      return i;
      k = 300;
      if (paramInt >= k)
      {
        k = 399;
        if (paramInt <= k)
        {
          i = j;
          continue;
        }
      }
      k = 400;
      if (paramInt >= k)
      {
        k = 499;
        if (paramInt <= k) {}
      }
      else
      {
        i = 500;
        if (paramInt >= i) {
          i = j;
        } else {
          i = j;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\ResponseParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */