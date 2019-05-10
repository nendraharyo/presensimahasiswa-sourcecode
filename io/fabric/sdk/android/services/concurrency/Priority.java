package io.fabric.sdk.android.services.concurrency;

public enum Priority
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new io/fabric/sdk/android/services/concurrency/Priority;
    ((Priority)localObject).<init>("LOW", 0);
    LOW = (Priority)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/Priority;
    ((Priority)localObject).<init>("NORMAL", k);
    NORMAL = (Priority)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/Priority;
    ((Priority)localObject).<init>("HIGH", j);
    HIGH = (Priority)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/Priority;
    ((Priority)localObject).<init>("IMMEDIATE", i);
    IMMEDIATE = (Priority)localObject;
    localObject = new Priority[4];
    Priority localPriority = LOW;
    localObject[0] = localPriority;
    localPriority = NORMAL;
    localObject[k] = localPriority;
    localPriority = HIGH;
    localObject[j] = localPriority;
    localPriority = IMMEDIATE;
    localObject[i] = localPriority;
    $VALUES = (Priority[])localObject;
  }
  
  static int compareTo(PriorityProvider paramPriorityProvider, Object paramObject)
  {
    boolean bool = paramObject instanceof PriorityProvider;
    if (bool) {
      paramObject = (PriorityProvider)paramObject;
    }
    for (Priority localPriority = ((PriorityProvider)paramObject).getPriority();; localPriority = NORMAL)
    {
      int i = localPriority.ordinal();
      int j = paramPriorityProvider.getPriority().ordinal();
      return i - j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\Priority.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */