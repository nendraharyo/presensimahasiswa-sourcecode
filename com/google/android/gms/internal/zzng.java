package com.google.android.gms.internal;

public final class zzng
{
  private static int zza(StackTraceElement[] paramArrayOfStackTraceElement1, StackTraceElement[] paramArrayOfStackTraceElement2)
  {
    int i = 0;
    int j = paramArrayOfStackTraceElement2.length;
    int k = paramArrayOfStackTraceElement1.length;
    for (;;)
    {
      k += -1;
      if (k < 0) {
        break;
      }
      j += -1;
      if (j < 0) {
        break;
      }
      StackTraceElement localStackTraceElement1 = paramArrayOfStackTraceElement2[j];
      StackTraceElement localStackTraceElement2 = paramArrayOfStackTraceElement1[k];
      boolean bool = localStackTraceElement1.equals(localStackTraceElement2);
      if (!bool) {
        break;
      }
      i += 1;
    }
    return i;
  }
  
  public static String zzso()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    Object localObject1 = new java/lang/Throwable;
    ((Throwable)localObject1).<init>();
    Object localObject2 = ((Throwable)localObject1).getStackTrace();
    localStringBuilder1.append("Async stack trace:");
    int i = localObject2.length;
    int j = 0;
    Object localObject3 = null;
    Object localObject4;
    StringBuilder localStringBuilder2;
    while (j < i)
    {
      localObject4 = localObject2[j];
      localStringBuilder2 = localStringBuilder1.append("\n\tat ");
      localStringBuilder2.append(localObject4);
      j += 1;
    }
    Throwable localThrowable = ((Throwable)localObject1).getCause();
    localObject3 = localObject2;
    localObject2 = localThrowable;
    while (localObject2 != null)
    {
      localStringBuilder1.append("\nCaused by: ");
      localStringBuilder1.append(localObject2);
      localObject1 = ((Throwable)localObject2).getStackTrace();
      i = zza((StackTraceElement[])localObject1, (StackTraceElement[])localObject3);
      j = 0;
      localObject3 = null;
      for (;;)
      {
        int k = localObject1.length - i;
        if (j >= k) {
          break;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("\n\tat ");
        localStringBuilder2 = localObject1[j];
        localObject4 = localStringBuilder2;
        localStringBuilder1.append((String)localObject4);
        j += 1;
      }
      if (i > 0)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "\n\t... ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append(i);
        String str = " more";
        localObject3 = str;
        localStringBuilder1.append((String)localObject3);
      }
      localObject2 = ((Throwable)localObject2).getCause();
      localObject3 = localObject1;
    }
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzng.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */