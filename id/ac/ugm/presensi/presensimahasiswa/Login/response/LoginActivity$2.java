package id.ac.ugm.presensi.presensimahasiswa.Login.response;

import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

class LoginActivity$2
  implements GoogleApiClient.ConnectionCallbacks
{
  LoginActivity$2(LoginActivity paramLoginActivity) {}
  
  public void onConnected(Bundle paramBundle)
  {
    Object localObject1 = LocationServices.FusedLocationApi;
    Object localObject2 = LoginActivity.a(this.a);
    localObject1 = ((FusedLocationProviderApi)localObject1).getLastLocation((GoogleApiClient)localObject2);
    Object localObject3;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = LocationServices.FusedLocationApi;
      localObject2 = LoginActivity.a(this.a);
      localObject3 = this.a.a;
      localObject4 = this.a;
      ((FusedLocationProviderApi)localObject1).requestLocationUpdates((GoogleApiClient)localObject2, (LocationRequest)localObject3, (LocationListener)localObject4);
    }
    for (;;)
    {
      return;
      localObject2 = LocationServices.FusedLocationApi;
      localObject3 = LoginActivity.a(this.a);
      localObject4 = this.a.a;
      LoginActivity localLoginActivity = this.a;
      ((FusedLocationProviderApi)localObject2).requestLocationUpdates((GoogleApiClient)localObject3, (LocationRequest)localObject4, localLoginActivity);
      localObject2 = this.a;
      double d1 = ((Location)localObject1).getLatitude();
      ((LoginActivity)localObject2).b = d1;
      localObject2 = this.a;
      d1 = ((Location)localObject1).getLongitude();
      ((LoginActivity)localObject2).c = d1;
      this.a.b = -7.767073D;
      this.a.c = 110.377271D;
      localObject1 = this.a;
      d1 = this.a.b;
      localObject2 = this.a;
      double d2 = ((LoginActivity)localObject2).c;
      ((LoginActivity)localObject1).a(d1, d2);
    }
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    Log.e("LoginActivity", "onConnectionSuspended");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Login\response\LoginActivity$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */