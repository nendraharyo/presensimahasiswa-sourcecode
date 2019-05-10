package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest$Builder
{
  private UserAddressRequest$Builder(UserAddressRequest paramUserAddressRequest) {}
  
  public Builder addAllowedCountrySpecification(CountrySpecification paramCountrySpecification)
  {
    Object localObject = this.zzaMB.zzaMA;
    if (localObject == null)
    {
      localObject = this.zzaMB;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      ((UserAddressRequest)localObject).zzaMA = localArrayList;
    }
    this.zzaMB.zzaMA.add(paramCountrySpecification);
    return this;
  }
  
  public Builder addAllowedCountrySpecifications(Collection paramCollection)
  {
    Object localObject = this.zzaMB.zzaMA;
    if (localObject == null)
    {
      localObject = this.zzaMB;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      ((UserAddressRequest)localObject).zzaMA = localArrayList;
    }
    this.zzaMB.zzaMA.addAll(paramCollection);
    return this;
  }
  
  public UserAddressRequest build()
  {
    Object localObject = this.zzaMB.zzaMA;
    if (localObject != null)
    {
      localObject = this.zzaMB;
      List localList = Collections.unmodifiableList(this.zzaMB.zzaMA);
      ((UserAddressRequest)localObject).zzaMA = localList;
    }
    return this.zzaMB;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\identity\intents\UserAddressRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */