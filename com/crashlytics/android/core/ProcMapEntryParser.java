package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ProcMapEntryParser
{
  private static final Pattern MAP_REGEX = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");
  
  public static ProcMapEntry parse(String paramString)
  {
    Object localObject1 = MAP_REGEX.matcher(paramString);
    int i = ((Matcher)localObject1).matches();
    if (i == 0) {
      localObject1 = null;
    }
    for (;;)
    {
      return (ProcMapEntry)localObject1;
      i = 1;
      try
      {
        localObject2 = ((Matcher)localObject1).group(i);
        int j = 16;
        localObject2 = Long.valueOf((String)localObject2, j);
        long l1 = ((Long)localObject2).longValue();
        int k = 2;
        localObject3 = ((Matcher)localObject1).group(k);
        int m = 16;
        localObject3 = Long.valueOf((String)localObject3, m);
        long l2 = ((Long)localObject3).longValue() - l1;
        int n = 3;
        String str1 = ((Matcher)localObject1).group(n);
        int i1 = 4;
        String str2 = ((Matcher)localObject1).group(i1);
        localObject1 = new com/crashlytics/android/core/ProcMapEntry;
        ((ProcMapEntry)localObject1).<init>(l1, l2, str1, str2);
      }
      catch (Exception localException)
      {
        Logger localLogger = Fabric.getLogger();
        Object localObject2 = "CrashlyticsCore";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        Object localObject3 = "Could not parse map entry: ";
        localObject4 = (String)localObject3 + paramString;
        localLogger.d((String)localObject2, (String)localObject4);
        localLogger = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ProcMapEntryParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */