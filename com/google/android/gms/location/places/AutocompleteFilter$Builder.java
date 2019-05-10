package com.google.android.gms.location.places;

import java.util.List;

public final class AutocompleteFilter$Builder
{
  private boolean zzaPg = false;
  private int zzaPi = 0;
  
  public AutocompleteFilter build()
  {
    AutocompleteFilter localAutocompleteFilter = new com/google/android/gms/location/places/AutocompleteFilter;
    boolean bool = this.zzaPg;
    List localList = AutocompleteFilter.zzhK(this.zzaPi);
    localAutocompleteFilter.<init>(1, bool, localList);
    return localAutocompleteFilter;
  }
  
  public Builder setTypeFilter(int paramInt)
  {
    this.zzaPi = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\AutocompleteFilter$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */