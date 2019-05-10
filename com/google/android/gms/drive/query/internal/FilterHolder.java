package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final Filter zzapi;
  final ComparisonFilter zzauk;
  final FieldOnlyFilter zzaul;
  final LogicalFilter zzaum;
  final NotFilter zzaun;
  final InFilter zzauo;
  final MatchAllFilter zzaup;
  final HasFilter zzauq;
  final FullTextSearchFilter zzaur;
  final OwnedByMeFilter zzaus;
  
  static
  {
    zzd localzzd = new com/google/android/gms/drive/query/internal/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  FilterHolder(int paramInt, ComparisonFilter paramComparisonFilter, FieldOnlyFilter paramFieldOnlyFilter, LogicalFilter paramLogicalFilter, NotFilter paramNotFilter, InFilter paramInFilter, MatchAllFilter paramMatchAllFilter, HasFilter paramHasFilter, FullTextSearchFilter paramFullTextSearchFilter, OwnedByMeFilter paramOwnedByMeFilter)
  {
    this.mVersionCode = paramInt;
    this.zzauk = paramComparisonFilter;
    this.zzaul = paramFieldOnlyFilter;
    this.zzaum = paramLogicalFilter;
    this.zzaun = paramNotFilter;
    this.zzauo = paramInFilter;
    this.zzaup = paramMatchAllFilter;
    this.zzauq = paramHasFilter;
    this.zzaur = paramFullTextSearchFilter;
    this.zzaus = paramOwnedByMeFilter;
    Object localObject = this.zzauk;
    if (localObject != null)
    {
      localObject = this.zzauk;
      this.zzapi = ((Filter)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.zzaul;
      if (localObject != null)
      {
        localObject = this.zzaul;
        this.zzapi = ((Filter)localObject);
      }
      else
      {
        localObject = this.zzaum;
        if (localObject != null)
        {
          localObject = this.zzaum;
          this.zzapi = ((Filter)localObject);
        }
        else
        {
          localObject = this.zzaun;
          if (localObject != null)
          {
            localObject = this.zzaun;
            this.zzapi = ((Filter)localObject);
          }
          else
          {
            localObject = this.zzauo;
            if (localObject != null)
            {
              localObject = this.zzauo;
              this.zzapi = ((Filter)localObject);
            }
            else
            {
              localObject = this.zzaup;
              if (localObject != null)
              {
                localObject = this.zzaup;
                this.zzapi = ((Filter)localObject);
              }
              else
              {
                localObject = this.zzauq;
                if (localObject != null)
                {
                  localObject = this.zzauq;
                  this.zzapi = ((Filter)localObject);
                }
                else
                {
                  localObject = this.zzaur;
                  if (localObject != null)
                  {
                    localObject = this.zzaur;
                    this.zzapi = ((Filter)localObject);
                  }
                  else
                  {
                    localObject = this.zzaus;
                    if (localObject == null) {
                      break;
                    }
                    localObject = this.zzaus;
                    this.zzapi = ((Filter)localObject);
                  }
                }
              }
            }
          }
        }
      }
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("At least one filter must be set.");
    throw ((Throwable)localObject);
  }
  
  public FilterHolder(Filter paramFilter)
  {
    Object localObject = "Null filter.";
    zzx.zzb(paramFilter, localObject);
    this.mVersionCode = 2;
    boolean bool = paramFilter instanceof ComparisonFilter;
    if (bool)
    {
      localObject = paramFilter;
      localObject = (ComparisonFilter)paramFilter;
      this.zzauk = ((ComparisonFilter)localObject);
      bool = paramFilter instanceof FieldOnlyFilter;
      if (!bool) {
        break label307;
      }
      localObject = paramFilter;
      localObject = (FieldOnlyFilter)paramFilter;
      label55:
      this.zzaul = ((FieldOnlyFilter)localObject);
      bool = paramFilter instanceof LogicalFilter;
      if (!bool) {
        break label314;
      }
      localObject = paramFilter;
      localObject = (LogicalFilter)paramFilter;
      label76:
      this.zzaum = ((LogicalFilter)localObject);
      bool = paramFilter instanceof NotFilter;
      if (!bool) {
        break label321;
      }
      localObject = paramFilter;
      localObject = (NotFilter)paramFilter;
      label97:
      this.zzaun = ((NotFilter)localObject);
      bool = paramFilter instanceof InFilter;
      if (!bool) {
        break label328;
      }
      localObject = paramFilter;
      localObject = (InFilter)paramFilter;
      label118:
      this.zzauo = ((InFilter)localObject);
      bool = paramFilter instanceof MatchAllFilter;
      if (!bool) {
        break label335;
      }
      localObject = paramFilter;
      localObject = (MatchAllFilter)paramFilter;
      label139:
      this.zzaup = ((MatchAllFilter)localObject);
      bool = paramFilter instanceof HasFilter;
      if (!bool) {
        break label342;
      }
      localObject = paramFilter;
      localObject = (HasFilter)paramFilter;
      label160:
      this.zzauq = ((HasFilter)localObject);
      bool = paramFilter instanceof FullTextSearchFilter;
      if (!bool) {
        break label349;
      }
      localObject = paramFilter;
      localObject = (FullTextSearchFilter)paramFilter;
      label181:
      this.zzaur = ((FullTextSearchFilter)localObject);
      bool = paramFilter instanceof OwnedByMeFilter;
      if (!bool) {
        break label356;
      }
      localObject = paramFilter;
    }
    for (localObject = (OwnedByMeFilter)paramFilter;; localObject = null)
    {
      this.zzaus = ((OwnedByMeFilter)localObject);
      localObject = this.zzauk;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaul;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaum;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaun;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzauo;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaup;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzauq;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaur;
      if (localObject != null) {
        break label363;
      }
      localObject = this.zzaus;
      if (localObject != null) {
        break label363;
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Invalid filter type.");
      throw ((Throwable)localObject);
      bool = false;
      localObject = null;
      break;
      label307:
      bool = false;
      localObject = null;
      break label55;
      label314:
      bool = false;
      localObject = null;
      break label76;
      label321:
      bool = false;
      localObject = null;
      break label97;
      label328:
      bool = false;
      localObject = null;
      break label118;
      label335:
      bool = false;
      localObject = null;
      break label139;
      label342:
      bool = false;
      localObject = null;
      break label160;
      label349:
      bool = false;
      localObject = null;
      break label181;
      label356:
      bool = false;
    }
    label363:
    this.zzapi = ((Filter)paramFilter);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Filter getFilter()
  {
    return this.zzapi;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    Filter localFilter = this.zzapi;
    arrayOfObject[0] = localFilter;
    return String.format("FilterHolder[%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\FilterHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */