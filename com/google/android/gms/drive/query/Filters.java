package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

public class Filters
{
  public static Filter and(Filter paramFilter, Filter... paramVarArgs)
  {
    LogicalFilter localLogicalFilter = new com/google/android/gms/drive/query/internal/LogicalFilter;
    Operator localOperator = Operator.zzauC;
    localLogicalFilter.<init>(localOperator, paramFilter, paramVarArgs);
    return localLogicalFilter;
  }
  
  public static Filter and(Iterable paramIterable)
  {
    LogicalFilter localLogicalFilter = new com/google/android/gms/drive/query/internal/LogicalFilter;
    Operator localOperator = Operator.zzauC;
    localLogicalFilter.<init>(localOperator, paramIterable);
    return localLogicalFilter;
  }
  
  public static Filter contains(SearchableMetadataField paramSearchableMetadataField, String paramString)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzauF;
    localComparisonFilter.<init>(localOperator, paramSearchableMetadataField, paramString);
    return localComparisonFilter;
  }
  
  public static Filter eq(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    boolean bool;
    if (paramString != null) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "Custom property value may not be null.");
      HasFilter localHasFilter = new com/google/android/gms/drive/query/internal/HasFilter;
      SearchableMetadataField localSearchableMetadataField = SearchableField.zzauc;
      Object localObject = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$zza;
      ((AppVisibleCustomProperties.zza)localObject).<init>();
      localObject = ((AppVisibleCustomProperties.zza)localObject).zza(paramCustomPropertyKey, paramString).zztA();
      localHasFilter.<init>(localSearchableMetadataField, localObject);
      return localHasFilter;
      bool = false;
      localHasFilter = null;
    }
  }
  
  public static Filter eq(SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzaux;
    localComparisonFilter.<init>(localOperator, paramSearchableMetadataField, paramObject);
    return localComparisonFilter;
  }
  
  public static Filter greaterThan(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzauA;
    localComparisonFilter.<init>(localOperator, paramSearchableOrderedMetadataField, paramComparable);
    return localComparisonFilter;
  }
  
  public static Filter greaterThanEquals(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzauB;
    localComparisonFilter.<init>(localOperator, paramSearchableOrderedMetadataField, paramComparable);
    return localComparisonFilter;
  }
  
  public static Filter in(SearchableCollectionMetadataField paramSearchableCollectionMetadataField, Object paramObject)
  {
    InFilter localInFilter = new com/google/android/gms/drive/query/internal/InFilter;
    localInFilter.<init>(paramSearchableCollectionMetadataField, paramObject);
    return localInFilter;
  }
  
  public static Filter lessThan(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzauy;
    localComparisonFilter.<init>(localOperator, paramSearchableOrderedMetadataField, paramComparable);
    return localComparisonFilter;
  }
  
  public static Filter lessThanEquals(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    ComparisonFilter localComparisonFilter = new com/google/android/gms/drive/query/internal/ComparisonFilter;
    Operator localOperator = Operator.zzauz;
    localComparisonFilter.<init>(localOperator, paramSearchableOrderedMetadataField, paramComparable);
    return localComparisonFilter;
  }
  
  public static Filter not(Filter paramFilter)
  {
    NotFilter localNotFilter = new com/google/android/gms/drive/query/internal/NotFilter;
    localNotFilter.<init>(paramFilter);
    return localNotFilter;
  }
  
  public static Filter openedByMe()
  {
    FieldOnlyFilter localFieldOnlyFilter = new com/google/android/gms/drive/query/internal/FieldOnlyFilter;
    SearchableOrderedMetadataField localSearchableOrderedMetadataField = SearchableField.LAST_VIEWED_BY_ME;
    localFieldOnlyFilter.<init>(localSearchableOrderedMetadataField);
    return localFieldOnlyFilter;
  }
  
  public static Filter or(Filter paramFilter, Filter... paramVarArgs)
  {
    LogicalFilter localLogicalFilter = new com/google/android/gms/drive/query/internal/LogicalFilter;
    Operator localOperator = Operator.zzauD;
    localLogicalFilter.<init>(localOperator, paramFilter, paramVarArgs);
    return localLogicalFilter;
  }
  
  public static Filter or(Iterable paramIterable)
  {
    LogicalFilter localLogicalFilter = new com/google/android/gms/drive/query/internal/LogicalFilter;
    Operator localOperator = Operator.zzauD;
    localLogicalFilter.<init>(localOperator, paramIterable);
    return localLogicalFilter;
  }
  
  public static Filter ownedByMe()
  {
    OwnedByMeFilter localOwnedByMeFilter = new com/google/android/gms/drive/query/internal/OwnedByMeFilter;
    localOwnedByMeFilter.<init>();
    return localOwnedByMeFilter;
  }
  
  public static Filter sharedWithMe()
  {
    FieldOnlyFilter localFieldOnlyFilter = new com/google/android/gms/drive/query/internal/FieldOnlyFilter;
    SearchableOrderedMetadataField localSearchableOrderedMetadataField = SearchableField.zzaub;
    localFieldOnlyFilter.<init>(localSearchableOrderedMetadataField);
    return localFieldOnlyFilter;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\Filters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */