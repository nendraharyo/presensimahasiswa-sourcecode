package io.fabric.sdk.android.services.common;

public enum DeliveryMechanism
{
  public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
  private final int id;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new io/fabric/sdk/android/services/common/DeliveryMechanism;
    ((DeliveryMechanism)localObject).<init>("DEVELOPER", 0, m);
    DEVELOPER = (DeliveryMechanism)localObject;
    localObject = new io/fabric/sdk/android/services/common/DeliveryMechanism;
    ((DeliveryMechanism)localObject).<init>("USER_SIDELOAD", m, k);
    USER_SIDELOAD = (DeliveryMechanism)localObject;
    localObject = new io/fabric/sdk/android/services/common/DeliveryMechanism;
    ((DeliveryMechanism)localObject).<init>("TEST_DISTRIBUTION", k, j);
    TEST_DISTRIBUTION = (DeliveryMechanism)localObject;
    localObject = new io/fabric/sdk/android/services/common/DeliveryMechanism;
    ((DeliveryMechanism)localObject).<init>("APP_STORE", j, i);
    APP_STORE = (DeliveryMechanism)localObject;
    localObject = new DeliveryMechanism[i];
    DeliveryMechanism localDeliveryMechanism = DEVELOPER;
    localObject[0] = localDeliveryMechanism;
    localDeliveryMechanism = USER_SIDELOAD;
    localObject[m] = localDeliveryMechanism;
    localDeliveryMechanism = TEST_DISTRIBUTION;
    localObject[k] = localDeliveryMechanism;
    localDeliveryMechanism = APP_STORE;
    localObject[j] = localDeliveryMechanism;
    $VALUES = (DeliveryMechanism[])localObject;
  }
  
  private DeliveryMechanism(int paramInt1)
  {
    this.id = paramInt1;
  }
  
  public static DeliveryMechanism determineFrom(String paramString)
  {
    Object localObject = "io.crash.air";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool) {
      localObject = TEST_DISTRIBUTION;
    }
    for (;;)
    {
      return (DeliveryMechanism)localObject;
      if (paramString != null) {
        localObject = APP_STORE;
      } else {
        localObject = DEVELOPER;
      }
    }
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public String toString()
  {
    return Integer.toString(this.id);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\DeliveryMechanism.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */