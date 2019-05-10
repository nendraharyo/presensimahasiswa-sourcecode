package com.google.android.gms.drive.query;

import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Query$Builder
{
  private Set zzapC;
  private boolean zzarL;
  private String zzatW;
  private SortOrder zzatX;
  private List zzatY;
  private boolean zzatZ;
  private final List zzaua;
  
  public Query$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaua = localArrayList;
  }
  
  public Query$Builder(Query paramQuery)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzaua = ((List)localObject);
    localObject = this.zzaua;
    Filter localFilter = paramQuery.getFilter();
    ((List)localObject).add(localFilter);
    localObject = paramQuery.getPageToken();
    this.zzatW = ((String)localObject);
    localObject = paramQuery.getSortOrder();
    this.zzatX = ((SortOrder)localObject);
    localObject = paramQuery.zztJ();
    this.zzatY = ((List)localObject);
    boolean bool = paramQuery.zztK();
    this.zzatZ = bool;
    localObject = paramQuery.zztL();
    this.zzapC = ((Set)localObject);
    bool = paramQuery.zztM();
    this.zzarL = bool;
  }
  
  public Builder addFilter(Filter paramFilter)
  {
    boolean bool = paramFilter instanceof MatchAllFilter;
    if (!bool)
    {
      List localList = this.zzaua;
      localList.add(paramFilter);
    }
    return this;
  }
  
  public Query build()
  {
    Query localQuery = new com/google/android/gms/drive/query/Query;
    LogicalFilter localLogicalFilter = new com/google/android/gms/drive/query/internal/LogicalFilter;
    Object localObject1 = Operator.zzauC;
    Object localObject2 = this.zzaua;
    localLogicalFilter.<init>((Operator)localObject1, (Iterable)localObject2);
    localObject1 = this.zzatW;
    localObject2 = this.zzatX;
    List localList = this.zzatY;
    boolean bool1 = this.zzatZ;
    Set localSet = this.zzapC;
    boolean bool2 = this.zzarL;
    localQuery.<init>(localLogicalFilter, (String)localObject1, (SortOrder)localObject2, localList, bool1, localSet, bool2, null);
    return localQuery;
  }
  
  public Builder setPageToken(String paramString)
  {
    this.zzatW = paramString;
    return this;
  }
  
  public Builder setSortOrder(SortOrder paramSortOrder)
  {
    this.zzatX = paramSortOrder;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\Query$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */