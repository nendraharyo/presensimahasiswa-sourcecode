package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.a.e;
import android.util.Log;
import java.util.Calendar;

class TwilightManager
{
  private static final int SUNRISE = 6;
  private static final int SUNSET = 22;
  private static final String TAG = "TwilightManager";
  private static TwilightManager sInstance;
  private final Context mContext;
  private final LocationManager mLocationManager;
  private final TwilightManager.TwilightState mTwilightState;
  
  TwilightManager(Context paramContext, LocationManager paramLocationManager)
  {
    TwilightManager.TwilightState localTwilightState = new android/support/v7/app/TwilightManager$TwilightState;
    localTwilightState.<init>();
    this.mTwilightState = localTwilightState;
    this.mContext = paramContext;
    this.mLocationManager = paramLocationManager;
  }
  
  static TwilightManager getInstance(Context paramContext)
  {
    Object localObject = sInstance;
    if (localObject == null)
    {
      Context localContext = paramContext.getApplicationContext();
      TwilightManager localTwilightManager = new android/support/v7/app/TwilightManager;
      localObject = (LocationManager)localContext.getSystemService("location");
      localTwilightManager.<init>(localContext, (LocationManager)localObject);
      sInstance = localTwilightManager;
    }
    return sInstance;
  }
  
  private Location getLastKnownLocation()
  {
    Object localObject1 = null;
    Object localObject2 = this.mContext;
    Object localObject3 = "android.permission.ACCESS_COARSE_LOCATION";
    int i = e.a((Context)localObject2, (String)localObject3);
    if (i == 0) {}
    for (localObject2 = getLastKnownLocationForProvider("network");; localObject2 = null)
    {
      localObject3 = this.mContext;
      String str = "android.permission.ACCESS_FINE_LOCATION";
      int j = e.a((Context)localObject3, str);
      if (j == 0) {
        localObject1 = getLastKnownLocationForProvider("gps");
      }
      if ((localObject1 != null) && (localObject2 != null))
      {
        long l1 = ((Location)localObject1).getTime();
        long l2 = ((Location)localObject2).getTime();
        boolean bool = l1 < l2;
        if (bool) {
          localObject2 = localObject1;
        }
        return (Location)localObject2;
      }
      if (localObject1 != null) {}
      for (;;)
      {
        localObject2 = localObject1;
        break;
        localObject1 = localObject2;
      }
      i = 0;
    }
  }
  
  private Location getLastKnownLocationForProvider(String paramString)
  {
    try
    {
      localObject1 = this.mLocationManager;
      bool = ((LocationManager)localObject1).isProviderEnabled(paramString);
      if (!bool) {
        break label46;
      }
      localObject1 = this.mLocationManager;
      localObject1 = ((LocationManager)localObject1).getLastKnownLocation(paramString);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "TwilightManager";
        String str2 = "Failed to get last known location";
        Log.d(str1, str2, localException);
        label46:
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return (Location)localObject1;
  }
  
  private boolean isStateValid()
  {
    TwilightManager.TwilightState localTwilightState = this.mTwilightState;
    long l1 = localTwilightState.nextUpdate;
    long l2 = System.currentTimeMillis();
    boolean bool = l1 < l2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTwilightState = null;
    }
  }
  
  static void setInstance(TwilightManager paramTwilightManager)
  {
    sInstance = paramTwilightManager;
  }
  
  private void updateState(Location paramLocation)
  {
    TwilightManager.TwilightState localTwilightState = this.mTwilightState;
    long l1 = System.currentTimeMillis();
    TwilightCalculator localTwilightCalculator = TwilightCalculator.getInstance();
    long l2 = l1 - 86400000L;
    double d1 = paramLocation.getLatitude();
    double d2 = paramLocation.getLongitude();
    localTwilightCalculator.calculateTwilight(l2, d1, d2);
    long l3 = localTwilightCalculator.sunset;
    d1 = paramLocation.getLatitude();
    d2 = paramLocation.getLongitude();
    l2 = l1;
    localTwilightCalculator.calculateTwilight(l1, d1, d2);
    int i = localTwilightCalculator.state;
    int j = 1;
    if (i == j) {}
    long l4;
    long l5;
    long l7;
    long l8;
    for (i = 1;; i = 0)
    {
      l4 = localTwilightCalculator.sunrise;
      l5 = localTwilightCalculator.sunset;
      long l6 = l5;
      l2 = 86400000L + l1;
      d1 = paramLocation.getLatitude();
      d2 = paramLocation.getLongitude();
      localTwilightCalculator.calculateTwilight(l2, d1, d2);
      l7 = localTwilightCalculator.sunrise;
      l2 = 0L;
      l8 = -1;
      d2 = 0.0D / 0.0D;
      bool = l4 < l8;
      if (bool)
      {
        l8 = -1;
        d2 = 0.0D / 0.0D;
        bool = l5 < l8;
        if (bool) {
          break;
        }
      }
      l2 = 43200000L + l1;
      localTwilightState.isNight = i;
      localTwilightState.yesterdaySunset = l3;
      l5 = l4;
      localTwilightState.todaySunrise = l4;
      l5 = l6;
      localTwilightState.todaySunset = l6;
      localTwilightState.tomorrowSunrise = l7;
      localTwilightState.nextUpdate = l2;
      return;
    }
    boolean bool = l1 < l5;
    if (bool) {
      l2 += l7;
    }
    for (;;)
    {
      l8 = 60000L;
      d2 = 2.9644E-319D;
      l2 += l8;
      break;
      bool = l1 < l4;
      if (bool) {
        l2 += l5;
      } else {
        l2 += l4;
      }
    }
  }
  
  boolean isNight()
  {
    Object localObject1 = this.mTwilightState;
    boolean bool1 = isStateValid();
    boolean bool2;
    if (bool1) {
      bool2 = ((TwilightManager.TwilightState)localObject1).isNight;
    }
    for (;;)
    {
      return bool2;
      Object localObject2 = getLastKnownLocation();
      if (localObject2 != null)
      {
        updateState((Location)localObject2);
        bool2 = ((TwilightManager.TwilightState)localObject1).isNight;
      }
      else
      {
        localObject2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.";
        Log.i("TwilightManager", (String)localObject2);
        localObject1 = Calendar.getInstance();
        int j = ((Calendar)localObject1).get(11);
        int i = 6;
        if (j >= i)
        {
          i = 22;
          if (j < i) {}
        }
        else
        {
          j = 1;
          continue;
        }
        j = 0;
        localObject1 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\TwilightManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */