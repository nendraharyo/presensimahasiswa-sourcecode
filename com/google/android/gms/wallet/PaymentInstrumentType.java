package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class PaymentInstrumentType
{
  public static final int AMEX = 3;
  public static final int CHROME_PROXY_CARD_TYPE = 2;
  public static final int DISCOVER = 4;
  public static final int JCB = 5;
  public static final int MASTER_CARD = 2;
  public static final int VISA = 1;
  
  public static ArrayList getAll()
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject = new Integer[i];
    Integer localInteger1 = Integer.valueOf(n);
    localObject[0] = localInteger1;
    Integer localInteger2 = Integer.valueOf(m);
    localObject[n] = localInteger2;
    localInteger2 = Integer.valueOf(k);
    localObject[m] = localInteger2;
    localInteger2 = Integer.valueOf(j);
    localObject[k] = localInteger2;
    localInteger2 = Integer.valueOf(i);
    localObject[j] = localInteger2;
    localObject = Arrays.asList((Object[])localObject);
    localArrayList.<init>((Collection)localObject);
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\PaymentInstrumentType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */