package io.fabric.sdk.android.services.common;

public enum IdManager$DeviceIdentifierType
{
  public final int protobufIndex;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("WIFI_MAC_ADDRESS", 0, m);
    WIFI_MAC_ADDRESS = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("BLUETOOTH_MAC_ADDRESS", m, k);
    BLUETOOTH_MAC_ADDRESS = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("FONT_TOKEN", k, 53);
    FONT_TOKEN = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("ANDROID_ID", j, 100);
    ANDROID_ID = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("ANDROID_DEVICE_ID", i, 101);
    ANDROID_DEVICE_ID = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("ANDROID_SERIAL", 5, 102);
    ANDROID_SERIAL = (DeviceIdentifierType)localObject;
    localObject = new io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType;
    ((DeviceIdentifierType)localObject).<init>("ANDROID_ADVERTISING_ID", 6, 103);
    ANDROID_ADVERTISING_ID = (DeviceIdentifierType)localObject;
    localObject = new DeviceIdentifierType[7];
    DeviceIdentifierType localDeviceIdentifierType1 = WIFI_MAC_ADDRESS;
    localObject[0] = localDeviceIdentifierType1;
    localDeviceIdentifierType1 = BLUETOOTH_MAC_ADDRESS;
    localObject[m] = localDeviceIdentifierType1;
    localDeviceIdentifierType1 = FONT_TOKEN;
    localObject[k] = localDeviceIdentifierType1;
    localDeviceIdentifierType1 = ANDROID_ID;
    localObject[j] = localDeviceIdentifierType1;
    localDeviceIdentifierType1 = ANDROID_DEVICE_ID;
    localObject[i] = localDeviceIdentifierType1;
    DeviceIdentifierType localDeviceIdentifierType2 = ANDROID_SERIAL;
    localObject[5] = localDeviceIdentifierType2;
    localDeviceIdentifierType2 = ANDROID_ADVERTISING_ID;
    localObject[6] = localDeviceIdentifierType2;
    $VALUES = (DeviceIdentifierType[])localObject;
  }
  
  private IdManager$DeviceIdentifierType(int paramInt1)
  {
    this.protobufIndex = paramInt1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\IdManager$DeviceIdentifierType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */