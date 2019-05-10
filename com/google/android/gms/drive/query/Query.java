package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final List zzapB;
  private final Set zzapC;
  final boolean zzarL;
  final LogicalFilter zzatV;
  final String zzatW;
  final SortOrder zzatX;
  final List zzatY;
  final boolean zzatZ;
  
  static
  {
    zza localzza = new com/google/android/gms/drive/query/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  private Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList1, boolean paramBoolean1, List paramList2, Set paramSet, boolean paramBoolean2)
  {
    this.mVersionCode = paramInt;
    this.zzatV = paramLogicalFilter;
    this.zzatW = paramString;
    this.zzatX = paramSortOrder;
    this.zzatY = paramList1;
    this.zzatZ = paramBoolean1;
    this.zzapB = paramList2;
    this.zzapC = paramSet;
    this.zzarL = paramBoolean2;
  }
  
  Query(int paramInt, LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList1, boolean paramBoolean1, List paramList2, boolean paramBoolean2) {}
  
  private Query(LogicalFilter paramLogicalFilter, String paramString, SortOrder paramSortOrder, List paramList, boolean paramBoolean1, Set paramSet, boolean paramBoolean2) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public Filter getFilter()
  {
    return this.zzatV;
  }
  
  public String getPageToken()
  {
    return this.zzatW;
  }
  
  public SortOrder getSortOrder()
  {
    return this.zzatX;
  }
  
  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzatV;
    arrayOfObject[0] = localObject;
    localObject = this.zzatX;
    arrayOfObject[1] = localObject;
    localObject = this.zzatW;
    arrayOfObject[2] = localObject;
    localObject = this.zzapB;
    arrayOfObject[3] = localObject;
    return String.format(localLocale, "Query[%s,%s,PageToken=%s,Spaces=%s]", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public List zztJ()
  {
    return this.zzatY;
  }
  
  public boolean zztK()
  {
    return this.zzatZ;
  }
  
  public Set zztL()
  {
    return this.zzapC;
  }
  
  public boolean zztM()
  {
    return this.zzarL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\Query.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */