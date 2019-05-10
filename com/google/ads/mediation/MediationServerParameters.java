package com.google.ads.mediation;

import com.google.android.gms.internal.zzin;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class MediationServerParameters
{
  public void load(Map paramMap)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = getClass().getFields();
    int i = localObject2.length;
    int j = 0;
    Object localObject3 = null;
    int m = 0;
    Object localObject6 = null;
    while (m < i)
    {
      Object localObject7 = localObject2[m];
      localObject3 = (MediationServerParameters.Parameter)((Field)localObject7).getAnnotation(MediationServerParameters.Parameter.class);
      if (localObject3 != null)
      {
        localObject3 = ((MediationServerParameters.Parameter)localObject3).name();
        ((Map)localObject1).put(localObject3, localObject7);
      }
      j = m + 1;
      m = j;
    }
    boolean bool1 = ((Map)localObject1).isEmpty();
    if (bool1)
    {
      localObject3 = "No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.";
      zzin.zzaK((String)localObject3);
    }
    localObject3 = paramMap.entrySet();
    localObject2 = ((Set)localObject3).iterator();
    Object localObject8;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = ((Iterator)localObject2).next();
      localObject6 = localObject3;
      localObject6 = (Map.Entry)localObject3;
      localObject3 = ((Map.Entry)localObject6).getKey();
      localObject3 = (Field)((Map)localObject1).remove(localObject3);
      if (localObject3 != null)
      {
        try
        {
          localObject8 = ((Map.Entry)localObject6).getValue();
          ((Field)localObject3).set(this, localObject8);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject8 = ((StringBuilder)localObject4).append("Server option \"");
          localObject4 = (String)((Map.Entry)localObject6).getKey();
          localObject4 = ((StringBuilder)localObject8).append((String)localObject4);
          localObject6 = "\" could not be set: Illegal Access";
          localObject4 = (String)localObject6;
          zzin.zzaK((String)localObject4);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject8 = ((StringBuilder)localObject5).append("Server option \"");
          localObject5 = (String)((Map.Entry)localObject6).getKey();
          localObject5 = ((StringBuilder)localObject8).append((String)localObject5);
          localObject6 = "\" could not be set: Bad Type";
          localObject5 = (String)localObject6;
          zzin.zzaK((String)localObject5);
        }
      }
      else
      {
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject8 = ((StringBuilder)localObject5).append("Unexpected server option: ");
        localObject5 = (String)((Map.Entry)localObject6).getKey();
        localObject8 = ((StringBuilder)localObject8).append((String)localObject5).append(" = \"");
        localObject5 = (String)((Map.Entry)localObject6).getValue();
        localObject5 = ((StringBuilder)localObject8).append((String)localObject5);
        localObject6 = "\"";
        localObject5 = (String)localObject6;
        zzin.zzaI((String)localObject5);
      }
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject5 = ((Map)localObject1).values();
    localObject1 = ((Collection)localObject5).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject5 = (Field)((Iterator)localObject1).next();
      localObject6 = (MediationServerParameters.Parameter)((Field)localObject5).getAnnotation(MediationServerParameters.Parameter.class);
      boolean bool2 = ((MediationServerParameters.Parameter)localObject6).required();
      if (bool2)
      {
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject8 = ((StringBuilder)localObject6).append("Required server option missing: ");
        localObject6 = ((MediationServerParameters.Parameter)((Field)localObject5).getAnnotation(MediationServerParameters.Parameter.class)).name();
        localObject6 = (String)localObject6;
        zzin.zzaK((String)localObject6);
        int n = ((StringBuilder)localObject2).length();
        if (n > 0)
        {
          localObject6 = ", ";
          ((StringBuilder)localObject2).append((String)localObject6);
        }
        localObject6 = MediationServerParameters.Parameter.class;
        localObject5 = ((MediationServerParameters.Parameter)((Field)localObject5).getAnnotation((Class)localObject6)).name();
        ((StringBuilder)localObject2).append((String)localObject5);
      }
    }
    int k = ((StringBuilder)localObject2).length();
    if (k > 0)
    {
      localObject5 = new com/google/ads/mediation/MediationServerParameters$MappingException;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject6 = ((StringBuilder)localObject6).append("Required server option(s) missing: ");
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject6 = (String)localObject1;
      ((MediationServerParameters.MappingException)localObject5).<init>((String)localObject6);
      throw ((Throwable)localObject5);
    }
    zzA();
  }
  
  protected void zzA() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\MediationServerParameters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */