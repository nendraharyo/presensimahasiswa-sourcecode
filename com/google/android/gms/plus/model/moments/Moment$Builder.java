package com.google.android.gms.plus.model.moments;

import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import java.util.HashSet;
import java.util.Set;

public class Moment$Builder
{
  private String zzJN;
  private final Set zzbeN;
  private String zzbfA;
  private ItemScopeEntity zzbfI;
  private ItemScopeEntity zzbfJ;
  private String zzyv;
  
  public Moment$Builder()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  public Moment build()
  {
    MomentEntity localMomentEntity = new com/google/android/gms/plus/internal/model/moments/MomentEntity;
    Set localSet = this.zzbeN;
    String str1 = this.zzyv;
    ItemScopeEntity localItemScopeEntity1 = this.zzbfI;
    String str2 = this.zzbfA;
    ItemScopeEntity localItemScopeEntity2 = this.zzbfJ;
    String str3 = this.zzJN;
    localMomentEntity.<init>(localSet, str1, localItemScopeEntity1, str2, localItemScopeEntity2, str3);
    return localMomentEntity;
  }
  
  public Builder setId(String paramString)
  {
    this.zzyv = paramString;
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    localSet.add(localInteger);
    return this;
  }
  
  public Builder setResult(ItemScope paramItemScope)
  {
    paramItemScope = (ItemScopeEntity)paramItemScope;
    this.zzbfI = paramItemScope;
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    localSet.add(localInteger);
    return this;
  }
  
  public Builder setStartDate(String paramString)
  {
    this.zzbfA = paramString;
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    localSet.add(localInteger);
    return this;
  }
  
  public Builder setTarget(ItemScope paramItemScope)
  {
    paramItemScope = (ItemScopeEntity)paramItemScope;
    this.zzbfJ = paramItemScope;
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    localSet.add(localInteger);
    return this;
  }
  
  public Builder setType(String paramString)
  {
    this.zzJN = paramString;
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
    localSet.add(localInteger);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\moments\Moment$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */